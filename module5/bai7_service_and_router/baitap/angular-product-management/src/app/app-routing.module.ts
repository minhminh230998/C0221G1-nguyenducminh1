import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ProductListComponent} from './product/product-list/product-list.component';
import {ProductCreateComponent} from './product/product-create/product-create.component';
import {ProductEditComponent} from './product/product-edit/product-edit.component';
import {DeleteComponent} from "./product/delete/delete.component";


const routes: Routes = [{
  path: '',
  component: ProductListComponent
}, {
  path: 'product/create',
  component: ProductCreateComponent
}, {
  path: 'product/edit/:id',
  component: ProductEditComponent
},{
  path: 'product/delete/:id',
  component: DeleteComponent
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
