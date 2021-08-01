import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {ProductService} from '../../service/product.service';
import {Product} from '../../model/product';
import {MatDialog, MatDialogModule} from "@angular/material/dialog";
import {DeleteComponent} from "../delete/delete.component";

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
  products: Product[]

  constructor(private productService: ProductService,private dialog:MatDialog) {
    this.productService.getAll().subscribe(product => {
      this.products = product;
    });
  }

  ngOnInit(): void {

  }
  openDialog(id): void {

    let dialogRef = this.dialog.open(DeleteComponent, {
      data : {id}
    });
    dialogRef.afterClosed().subscribe(() => {
      this.productService.getAll().subscribe(product => {
        this.products = product;
      });
    });
  }
  delete(id: any){
    this.productService.deleteProduct(id).subscribe();
    console.log(id)
  }

}
