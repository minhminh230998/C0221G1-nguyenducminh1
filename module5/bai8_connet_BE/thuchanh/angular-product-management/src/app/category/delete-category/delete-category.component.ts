import {Component, Inject, OnInit} from '@angular/core';
import {ActivatedRoute, ParamMap, Router} from "@angular/router";
import {CategoryService} from "../../service/category.service";
import {FormControl, FormGroup} from "@angular/forms";
import {ProductService} from "../../service/product.service";
import {MAT_DIALOG_DATA} from "@angular/material/dialog";

@Component({
  selector: 'app-delete-category',
  templateUrl: './delete-category.component.html',
  styleUrls: ['./delete-category.component.css']
})
export class DeleteCategoryComponent implements OnInit {

  id: number;
  constructor(private a: ActivatedRoute, private categoryService: CategoryService,@Inject(MAT_DIALOG_DATA) public data) {

  }
  delete(id: any){
    this.categoryService.deleteCategory(id).subscribe();
    console.log(id)
  }


  ngOnInit(): void {
  }

}
