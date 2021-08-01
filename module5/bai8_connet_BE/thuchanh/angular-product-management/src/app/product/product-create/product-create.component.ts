import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {ProductService} from '../../service/product.service';
import {CategoryService} from "../../service/category.service";
import {Category} from "../../model/Category";

@Component({
  selector: 'app-product-create',
  templateUrl: './product-create.component.html',
  styleUrls: ['./product-create.component.css']
})
export class ProductCreateComponent implements OnInit {
  categorys: Category[];
  category: Category;
  productForm: FormGroup = new FormGroup({
    name: new FormControl(),
    price: new FormControl(),
    description: new FormControl(),
    category: new FormControl(),
  });
  constructor(private productService: ProductService,private categoryService: CategoryService) {
    this.categoryService.getAll().subscribe(category => {
      this.categorys = category;
    });
  }

  ngOnInit(): void {
  }
  submit() {
      const product = this.productForm.value;
      this.productService.saveProduct(product).subscribe();
      alert("Thêm thành công")
  }
}
