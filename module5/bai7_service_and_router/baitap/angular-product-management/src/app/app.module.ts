import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {ProductListComponent} from './product/product-list/product-list.component';
import {ProductCreateComponent} from './product/product-create/product-create.component';
import {ReactiveFormsModule} from '@angular/forms';
import {MatDialogModule} from "@angular/material/dialog";

import {ProductEditComponent} from './product/product-edit/product-edit.component';
import {DeleteComponent} from './product/delete/delete.component';
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";

@NgModule({
  declarations: [
    AppComponent,
    ProductListComponent,
    ProductCreateComponent,

    ProductEditComponent,

    DeleteComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    MatDialogModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent],
  entryComponents: [DeleteComponent]
})
export class AppModule {
}
