import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { QuestionService } from '../../services/question.service';

@Component({
  selector: 'app-question-list',
  templateUrl: './question-list.component.html',
  styleUrls: ['./question-list.component.css']
})
export class QuestionListComponent implements OnInit {

  technologyId!: number;

  technology = '';

  technologyNameHeader = '';

  showForm: boolean = false;
  questions: any[] = [];
  newQuestion = {
    question:'',
    answer:'',
    difficulty:'EASY',
    markedForRevision:false,
    technology: {
      "id": 0
    }
  };

  filteredQuestions: any[] = [];

  searchText = '';

  loading = false;

  constructor(
    private route: ActivatedRoute,
    private questionService: QuestionService
  ) {}

  ngOnInit(): void {
    this.route.params.subscribe(params => {

      this.technologyId = params['technology'];

      this.loadQuestions();

      this.questionService
        .getTechnologyById(this.technologyId)
        .subscribe(data => {
          this.technologyNameHeader= data.name;
        });

    });

  }

  loadQuestions(): void {

    this.loading = true;

    this.questionService
      .getQuestionsByTechnologyId(this.technologyId)
      .subscribe({

        next: (data) => {

          this.questions = data;

          this.filteredQuestions = data;

          if (data.length > 0) {

            this.technology =
              data[0].technologyName;

          }

          this.loading = false;

        },

        error: (err) => {

          console.error(err);

          this.loading = false;

        }

      });

  }

  onSearch(): void {

    this.filteredQuestions =
      this.questions.filter(q =>

        q.question
          .toLowerCase()
          .includes(
            this.searchText.toLowerCase()
          )

      );

  }

  openAddQuestionForm(){
    this.showForm= true;
  }

  saveQuestion() {
    this.newQuestion.technology.id =
      this.technologyId;
    this.questionService
      .saveQuestion(this.newQuestion)
      .subscribe({
        next: (response) => {

          alert('Question Saved');

          this.showForm = false;

          this.newQuestion = {
            question: '',
            answer: '',
            difficulty: 'EASY',
            markedForRevision: false,
            technology: {
              "id": this.technologyId
            }
          };

          this.loadQuestions();
        },
        error: (err) => {
          console.error(err);
        }
      });
  }

  saveRevisionQuestions(): void {

    const payload = this.questions.map(q => ({
      id: q.id,
      markedForRevision: q.markedForRevision
    }));

    console.log(payload);

    this.questionService
      .updateRevisionQuestions(payload)
      .subscribe({
        next: () => {

          alert('Revision List Saved');

        },
        error: (err: any) => {

          console.error(err);

        }
      });

  }

}
