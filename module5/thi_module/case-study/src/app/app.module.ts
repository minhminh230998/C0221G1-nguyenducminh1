import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';

import {HttpClientModule} from '@angular/common/http';

import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {MatDialogModule} from "@angular/material/dialog";
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { DeleteComponent } from './delete/delete.component';
import { EditComponent } from './edit/edit.component';
import {NgxPaginationModule} from 'ngx-pagination';
import {Ng2OrderModule} from 'ng2-order-pipe';
import 'fa-icons';
import { ListComponent } from './list/list.component';
import { NarbarComponent } from './narbar/narbar.component';


@NgModule({
  declarations: [
    AppComponent,
    DeleteComponent,
    EditComponent,
    ListComponent,
    NarbarComponent,

  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    ReactiveFormsModule,
    AppRoutingModule,
    MatDialogModule,
    BrowserAnimationsModule,
    FormsModule,
    NgxPaginationModule,
    Ng2OrderModule,
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {
}
