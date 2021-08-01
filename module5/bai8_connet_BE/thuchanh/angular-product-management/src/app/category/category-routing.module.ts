import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {CreateCategoryComponent} from "./create-category/create-category.component";
import {EditCategoryComponent} from "./edit-category/edit-category.component";
import {ListCategoryComponent} from "./list-category/list-category.component";


const routes: Routes = [
  {
    path: 'create',
    component: CreateCategoryComponent
  },
  {
    path: 'edit/:id',
    component: EditCategoryComponent
  },
  {
    path: 'list',
    component: ListCategoryComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CategoryRoutingModule {

}
