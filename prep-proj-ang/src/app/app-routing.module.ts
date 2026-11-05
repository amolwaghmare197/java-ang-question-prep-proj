import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { QuestComponent } from '../app/quest/quest.component'
import {HomePageComponent} from "./home-page/home-page.component";
import {QuestionListComponent} from "./quest/question-list/question-list.component";
import { CsvViewerComponent } from './csv-viewer-component/csv-viewer-component.component'

const routes: Routes = [
  {
    path: 'home',
    component: HomePageComponent
  },
  {
    path: 'questions',
    component: QuestComponent
  },
  {
    path: 'questions/:technology',
    component: QuestionListComponent
  },
  {
    path: 'csvs',
    component: CsvViewerComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
