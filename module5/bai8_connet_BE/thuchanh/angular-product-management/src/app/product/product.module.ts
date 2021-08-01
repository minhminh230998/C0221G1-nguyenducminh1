import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ProductRoutingModule } from './product-routing.module';
import {ProductListComponent} from "./product-list/product-list.component";
import {ProductEditComponent} from "./product-edit/product-edit.component";
import {ProductCreateComponent} from "./product-create/product-create.component";
import {DeleteComponent} from "./delete/delete.component";
import {ReactiveFormsModule} from '@angular/forms';
import {MatDialogModule} from "@angular/material/dialog";

@NgModule({
  declarations: [
    ProductListComponent,
    ProductCreateComponent,
    ProductEditComponent,
    DeleteComponent
  ],
  imports: [
    CommonModule,
    ProductRoutingModule,
    ReactiveFormsModule,
    MatDialogModule

  ]
})
export class ProductModule { }
