import { Component, OnInit } from '@angular/core';
import {Category} from "../../model/Category";
import {CategoryService} from "../../service/category.service";

@Component({
  selector: 'app-list-category',
  templateUrl: './list-category.component.html',
  styleUrls: ['./list-category.component.css']
})
export class ListCategoryComponent implements OnInit {

  categories: Category[] = [];

  constructor(private categoryService: CategoryService) {
  }

  ngOnInit() {
    this.categoryService.getAll().subscribe(categories => {
      this.categories = categories;
    });
  }
}
