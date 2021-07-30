import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ArticleComponent } from './article/article.component';
import {FormsModule} from '@angular/forms';
import { LikeComponent } from './like/like.component';
import { NavbarComponent } from './navbar/navbar.component';
import { FooterComponent } from './footer/footer.component';
import {Routes, RouterModule} from '@angular/router';
import {NgxPaginationModule} from 'ngx-pagination';

const routes: Routes = [
  { path: 'navbar', component: NavbarComponent },
  { path: 'article', component: ArticleComponent },
]

@NgModule({
  declarations: [
    AppComponent,
    ArticleComponent,
    LikeComponent,
    NavbarComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    RouterModule.forRoot(routes),
    NgxPaginationModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
