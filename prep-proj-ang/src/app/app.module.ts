import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { QuestComponent } from './quest/quest.component';
import { HomePageComponent } from './home-page/home-page.component';
import { QuestionListComponent } from './quest/question-list/question-list.component';
import { CsvViewerComponent } from '../app/csv-viewer-component/csv-viewer-component.component';
import {FormsModule} from "@angular/forms";

@NgModule({
  declarations: [
    AppComponent,
    QuestComponent,
    HomePageComponent,
    QuestionListComponent,
    CsvViewerComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
