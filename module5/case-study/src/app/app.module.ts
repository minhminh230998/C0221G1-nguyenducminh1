import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {CustomerListComponent} from './customer/customer-list/customer-list.component';
import {HttpClientModule} from '@angular/common/http';
import { CreateComponent } from './customer/create/create.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {MatDialogModule} from "@angular/material/dialog";
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { DeleteComponent } from './customer/delete/delete.component';
import { EditComponent } from './customer/edit/edit.component';
import {NgxPaginationModule} from 'ngx-pagination';
import {Ng2OrderModule} from 'ng2-order-pipe';
import 'fa-icons';


@NgModule({
  declarations: [
    AppComponent,
    CustomerListComponent,
    CreateComponent,
    DeleteComponent,
    EditComponent,

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
  entryComponents:[CreateComponent]
})
export class AppModule {
}
