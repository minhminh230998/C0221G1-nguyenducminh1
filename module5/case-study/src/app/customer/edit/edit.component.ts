import {Component, Inject, OnInit} from '@angular/core';
import {CustomerService} from '../../service/customer.service';
import {MAT_DIALOG_DATA} from '@angular/material/dialog';
import {Customer} from '../../model/customer';
import {FormControl, FormGroup} from '@angular/forms';
import {CustomerTypeService} from '../../service/customer-type.service';
import {CustomerType} from '../../model/customer-type';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {
customer:Customer;
customerForm:FormGroup;
  customerTypes:CustomerType[]
  constructor(private customerService: CustomerService,@Inject(MAT_DIALOG_DATA) public data,private customerTypeService:CustomerTypeService) {
    this.customerService.findById(data.id).subscribe(customer=>{
      this.customer=customer;
      this.customerForm.patchValue(this.customer);
    });
     this.customerForm = new FormGroup({
      name: new FormControl(),
      id: new FormControl(),
      dateOfBirth: new FormControl(),
      gender: new FormControl(),
      idCard: new FormControl(),
      phoneNumber: new FormControl(),
      email: new FormControl(),
      customerType: new FormControl(),
      address: new FormControl(),
    });
  }

  ngOnInit(): void {
    this.customerTypeService.getAll().subscribe(customerTypes=>{
      this.customerTypes=customerTypes;
    })
  }

  submit() {
    const customer = this.customerForm.value;
    console.log(customer)
    this.customerService.update(customer.id,customer).subscribe(()=>{
      alert("Thành Công")
    });
  }
  compareFn(c1: any, c2: any): boolean {
    return c1 && c2 ? c1.id === c2.id : c1 === c2;
  }
}
