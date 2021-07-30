import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ListTranslateComponent} from './list-translate/list-translate.component';
import {DetailTranslateComponent} from './detail-translate/detail-translate.component';


const routes: Routes = [ {
  path: '',
  component: ListTranslateComponent
}, {
  path: 'translate/view/:id',
  component:DetailTranslateComponent
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
