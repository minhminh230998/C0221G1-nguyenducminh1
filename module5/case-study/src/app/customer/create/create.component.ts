import {Component, OnInit} from '@angular/core';
import {CustomerService} from '../../service/customer.service';
import {FormControl, FormGroup} from '@angular/forms';
import {CustomerType} from '../../model/customer-type';
import {CustomerTypeService} from '../../service/customer-type.service';

@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent implements OnInit {
  customerTypes: CustomerType[];
  customerForm: FormGroup = new FormGroup({
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

  constructor(private customerService: CustomerService, private customerTypeService: CustomerTypeService) {

  }

  ngOnInit(): void {
    this.customerTypeService.getAll().subscribe(customerTypes=>{
      this.customerTypes=customerTypes;
    })
  }

  submit() {
    const customer = this.customerForm.value;
    this.customerService.saveCustomer(customer).subscribe();
    alert('Thêm thành công');
  }
}
