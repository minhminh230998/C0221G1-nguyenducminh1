import {Injectable} from '@angular/core';
import {User} from '../user';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  users: User[]=[];

  constructor() {

  }
  save(user: User){
    this.users.push(user);
  }
}
