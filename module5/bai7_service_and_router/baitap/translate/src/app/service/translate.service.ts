import { Injectable } from '@angular/core';
import {Translate} from '../translate';

@Injectable({
  providedIn: 'root'
})
export class TranslateService {
  arr: Translate[] = [
    {id: 1, word: 'Hello', means: 'Xin Chào'},
    {id: 2, word: 'One', means: 'Một'},
    {id: 3, word: 'Two', means: 'Hai'},
    {id: 4, word: 'Dog', means: 'Chó'},
  ];
  constructor() { }
  getDetail(id: number) {
    for (let i = 0; i < this.arr.length; i++) {
      if (this.arr[i].id === id) {
        return this.arr[i];
      }
    }
    return null;
  }
  getAll() {
    return this.arr;
  }
}
