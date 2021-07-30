import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';
import {TranslateService} from '../service/translate.service';
import {Translate} from '../translate';

@Component({
  selector: 'app-detail-translate',
  templateUrl: './detail-translate.component.html',
  styleUrls: ['./detail-translate.component.css']
})
export class DetailTranslateComponent implements OnInit {
  detail: Translate;
  constructor(private translateService: TranslateService,
              private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    const id = this.activatedRoute.snapshot.params.id;
    this.detail = this.translateService.getDetail(parseInt(id));
  }

}
