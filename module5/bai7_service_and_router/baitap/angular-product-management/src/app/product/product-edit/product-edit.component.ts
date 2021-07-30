import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, ParamMap} from '@angular/router';
import {ProductService} from '../../service/product.service';
import {Product} from '../../model/product';
import {FormControl, FormGroup} from '@angular/forms';

@Component({
  selector: 'app-product-edit',
  templateUrl: './product-edit.component.html',
  styleUrls: ['./product-edit.component.css']
})
export class ProductEditComponent implements OnInit {
  product: any;
  productForm: FormGroup;
  id: any;

  constructor(private a: ActivatedRoute, private productService: ProductService) {

    a.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = paramMap.get('id');
      this.product = productService.findByIdProduct(this.id);
    });
    this.productForm = new FormGroup({
      id: new FormControl(this.product.id),
      name: new FormControl(this.product.name),
      price: new FormControl(this.product.price),
      description: new FormControl(this.product.description),
    });
  }

  submit(id) {
    const product = this.productForm.value;
    this.productService.editProduct(product, id);
  }

  ngOnInit(): void {
  }

}
