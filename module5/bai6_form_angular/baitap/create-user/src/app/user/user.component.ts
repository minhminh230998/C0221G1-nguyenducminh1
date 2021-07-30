import {Component, OnInit} from '@angular/core';
import {User} from '../user';
import {FormControl, FormGroup, Validators} from '@angular/forms';

import {comparePassword} from './validate';
import {UserService} from '../service/user.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
  public  user: User;
  public  users: User[]=[
    {email: "a",password:"a",confirm_password:"a",country:"a",age:1,gender:"a",phone:"a"}

  ];


  userForm: FormGroup;


  constructor(private userService: UserService) {
    this.userForm = new FormGroup({
      email: new FormControl('', [Validators.required, Validators.email]),
      country: new FormControl(''),
      age: new FormControl('', [Validators.required, Validators.min(18)]),
      gender: new FormControl(''),
      phone: new FormControl('', [Validators.required, Validators.pattern(/^\+84\d{9,10}$/)]),
      pw: new FormGroup({
        password: new FormControl('', [Validators.required, Validators.minLength(6)]),
        confirm_password: new FormControl('', [Validators.required])
      }, [comparePassword])
    });
  }


  ngOnInit(): void {
  }

  createUser() {
   // this.userService.save(this.userForm.value);
   // console.log(this.userService.users)
this.users.push(this.userForm.value);
console.log(this.users)

  }

}
