import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, ParamMap, Router} from "@angular/router";
import {CategoryService} from "../../service/category.service";
import {FormControl, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-delete-category',
  templateUrl: './delete-category.component.html',
  styleUrls: ['./delete-category.component.css']
})
export class DeleteCategoryComponent implements OnInit {
  categoryForm: FormGroup;
  id: number;
  constructor(private categoryService: CategoryService,
              private router: Router,
              private activatedRoute: ActivatedRoute) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = +paramMap.get('id');
      this.getCategory(this.id);
    });
  }


  ngOnInit(): void {
  }
  getCategory(id: number) {
    return this.categoryService.findById(id).subscribe(category => {
      this.categoryForm = new FormGroup({
        name: new FormControl(category.name),
      });
    });
  }
  deleteCategory(id: number) {
    this.categoryService.deleteCategory(id).subscribe(() => {
      this.router.navigate(['/category/list']);
    }, e => {
      console.log(e);
    });
  }
}
