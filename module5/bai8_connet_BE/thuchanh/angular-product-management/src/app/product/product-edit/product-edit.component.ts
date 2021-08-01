import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, ParamMap} from '@angular/router';
import {ProductService} from '../../service/product.service';
import {Product} from '../../model/product';
import {FormControl, FormGroup} from '@angular/forms';
import {Category} from "../../model/Category";
import {CategoryService} from "../../service/category.service";

@Component({
  selector: 'app-product-edit',
  templateUrl: './product-edit.component.html',
  styleUrls: ['./product-edit.component.css']
})
export class ProductEditComponent implements OnInit {
  categorys: Category[];
  category: Category;
  product: any;
  productForm: FormGroup;
  id: any;

  constructor(private a: ActivatedRoute, private productService: ProductService,private categoryService: CategoryService) {

    a.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = paramMap.get('id');
      console.log(this.id)
      productService.findById(this.id).subscribe(data =>{
        this.product=data;
        this.category=this.product.category;
        // console.log(this.product)
        // console.log(this.product.category)
        this.productForm.patchValue(this.product);
      });
    });
    this.productForm = new FormGroup({
      name: new FormControl(''),
      id: new FormControl(''),
      price: new FormControl(''),
      description: new FormControl(''),
      category: new FormControl(''),

    });
    console.log(this.productForm)
    this.categoryService.getAll().subscribe(category => {
      this.categorys = category;
    });


  }
  compareFn(c1: any, c2: any): boolean {
    return c1 && c2 ? c1.id === c2.id : c1 === c2;
  }

  submit() {
    const product = this.productForm.value;
    console.log(product)
    this.productService.updateProduct(product.id,product).subscribe();
  }

  ngOnInit(): void {
  }

}
