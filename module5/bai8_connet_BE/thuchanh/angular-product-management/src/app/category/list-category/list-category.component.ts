import { Component, OnInit } from '@angular/core';
import {Category} from "../../model/Category";
import {CategoryService} from "../../service/category.service";
import {DeleteCategoryComponent} from "../delete-category/delete-category.component";
import {MatDialog} from "@angular/material/dialog";

@Component({
  selector: 'app-list-category',
  templateUrl: './list-category.component.html',
  styleUrls: ['./list-category.component.css']
})
export class ListCategoryComponent implements OnInit {

  categories: Category[] = [];
  category: Category;

  constructor(private categoryService: CategoryService,private dialog:MatDialog) {
  }

  ngOnInit() {
    this.categoryService.getAll().subscribe(categories => {
      this.categories = categories;
    });
  }

  openDialog(id: number) {
    let dialogRef = this.dialog.open(DeleteCategoryComponent, {
      data : {id}
    });
    dialogRef.afterClosed().subscribe(() => {
      this.categoryService.getAll().subscribe(category => {
        this.categories = category;
      });
    });
  }
}
