import { Component, OnInit } from '@angular/core';
import {Translate} from '../translate';
import {TranslateService} from '../service/translate.service';

@Component({
  selector: 'app-list-translate',
  templateUrl: './list-translate.component.html',
  styleUrls: ['./list-translate.component.css']
})
export class ListTranslateComponent implements OnInit {
arr: Translate[];
  constructor(private translateService: TranslateService) {
    this.arr = this.translateService.getAll();
  }

  ngOnInit(): void {
  }

}
