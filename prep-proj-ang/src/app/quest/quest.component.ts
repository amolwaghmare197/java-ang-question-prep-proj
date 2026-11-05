import { Component, OnInit } from '@angular/core';
import { QuestionService } from '../services/question.service'

@Component({
  selector: 'app-quest',
  templateUrl: './quest.component.html',
  styleUrls: ['./quest.component.css']
})
export class QuestComponent implements OnInit {

  technologies:any[]=[];
  questionCount = 0;

  showTechnologyForm = false;

  newTechnology = {
    name: ''
  };
  constructor(private questionService: QuestionService) { }

  ngOnInit(): void {

    this.questionService
      .getTechnologyList()
      .subscribe(data => {

        this.technologies = data;

      });
    this.questionService.getQuestionCount().subscribe(data => {

      this.questionCount = data;

    });
  }

  saveTechnology(): void {

    if (!this.newTechnology.name.trim()) {
      alert('Technology Name Required');
      return;
    }

    this.questionService
      .saveTechnology(this.newTechnology)
      .subscribe({

        next: (response) => {

          this.technologies.push(response);

          this.newTechnology = {
            name: ''
          };

          this.showTechnologyForm = false;

          alert('Technology Added Successfully');
        },

        error: (err: any) => {
          console.error(err);
        }
      });

  }

}
