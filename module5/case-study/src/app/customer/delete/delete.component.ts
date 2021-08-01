import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA} from '@angular/material/dialog';
import {CustomerService} from '../../service/customer.service';

@Component({
  selector: 'app-delete',
  templateUrl: './delete.component.html',
  styleUrls: ['./delete.component.css']
})
export class DeleteComponent implements OnInit {

  constructor(private customerService: CustomerService,@Inject(MAT_DIALOG_DATA) public data) { }

  ngOnInit(): void {
  }
  delete(id: any){
    this.customerService.delete(id).subscribe();
    console.log(id)
  }
}
