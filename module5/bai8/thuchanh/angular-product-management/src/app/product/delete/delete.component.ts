import {Component, Inject, OnInit} from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {ActivatedRoute, ParamMap} from "@angular/router";
import {ProductService} from "../../service/product.service";
import {MAT_DIALOG_DATA} from "@angular/material/dialog";

@Component({
  selector: 'app-delete',
  templateUrl: './delete.component.html',
  styleUrls: ['./delete.component.css']
})
export class DeleteComponent implements OnInit {

  product: any;


  constructor(private a: ActivatedRoute, private productService: ProductService,@Inject(MAT_DIALOG_DATA) public data) {

  }
  ngOnInit(): void {
  }

  delete(id: any){
    this.productService.deleteProduct(id).subscribe();
    console.log(id)
  }
}
