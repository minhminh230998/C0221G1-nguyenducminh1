import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import {ReactiveFormsModule} from '@angular/forms';
import { ListTranslateComponent } from './list-translate/list-translate.component';
import { DetailTranslateComponent } from './detail-translate/detail-translate.component';

@NgModule({
  declarations: [
    AppComponent,
    ListTranslateComponent,
    DetailTranslateComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        ReactiveFormsModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
