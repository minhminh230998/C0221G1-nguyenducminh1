import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {ProductListComponent} from './product/product-list/product-list.component';
import {ProductCreateComponent} from './product/product-create/product-create.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {MatDialogModule} from "@angular/material/dialog";

import {ProductEditComponent} from './product/product-edit/product-edit.component';
import {DeleteComponent} from './product/delete/delete.component';
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {HttpClientModule} from "@angular/common/http";
import {ListCategoryComponent} from './category/list-category/list-category.component';
import {CreateCategoryComponent} from './category/create-category/create-category.component';
import {EditCategoryComponent} from './category/edit-category/edit-category.component';
import {DeleteCategoryComponent} from './category/delete-category/delete-category.component';

@NgModule({
  declarations: [
    AppComponent,
    ProductListComponent,
    ProductCreateComponent,

    ProductEditComponent,

    DeleteComponent,

    ListCategoryComponent,

    CreateCategoryComponent,

    EditCategoryComponent,

    DeleteCategoryComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    MatDialogModule,
    BrowserAnimationsModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent],
  entryComponents: [DeleteComponent]
})
export class AppModule {
}
