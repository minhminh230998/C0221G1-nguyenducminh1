import {Component, OnInit} from '@angular/core';
import {CustomerService} from '../../service/customer.service';
import {Customer} from '../../model/customer';
import {CreateComponent} from '../create/create.component';
import {MatDialog} from '@angular/material/dialog';
import {DeleteComponent} from '../delete/delete.component';
import {EditComponent} from '../edit/edit.component';

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {
  customers: Customer[]=[];
  dateFrom: any = '1111/11/11';
  dateTo: any = '3333/11/11';
  searchText: any = '';
  config: any;
  key = 'id';
  a: boolean = false;

  constructor(private customerService: CustomerService, private dialog: MatDialog) {

    this.config = {
      itemsPerPage: 5,
      currentPage: 1,
      totalItems: this.customers.length
    };

  }
  sort(key: any) {
    this.key = key;
    this.a = !this.a;
    // this.config = {
    //   itemsPerPage: 5,
    //   currentPage: 1,
    //   totalItems: this.customers.length
    // };
    // console.log(this.customers.length)
  }

  pageChanged(event) {
    this.config.currentPage = event;
  }

  ngOnInit(): void {
    this.customerService.getAll().subscribe(customers => {
      this.customers = customers;

    });
  }

  openDialog(id: any) {
    let dialogRef = this.dialog.open(DeleteComponent, {
      data: {id}
    });
    dialogRef.afterClosed().subscribe(() => {
      this.customerService.getAll().subscribe(customer => {
        this.customers = customer;
      });
    });

  }

  openDialogEdit(id: any) {
    let dialogRef = this.dialog.open(EditComponent, {
      data: {id}
    });
    dialogRef.afterClosed().subscribe(() => {
      this.customerService.getAll().subscribe(customer => {
        this.customers = customer;
      });
    });

  }

  openDialogCreate() {
    let dialogRef = this.dialog.open(CreateComponent, {});
    dialogRef.afterClosed().subscribe(() => {
      this.customerService.getAll().subscribe(customers => {
        this.customers = customers;
      });
    });

  }

  search() {
    this.customerService.search(this.searchText, this.dateFrom, this.dateTo).subscribe(customers => {
      this.customers = customers;
      this.config = {
        itemsPerPage: 5,
        currentPage: 1,
        totalItems: this.customers.length
      };
    });
  }




}
