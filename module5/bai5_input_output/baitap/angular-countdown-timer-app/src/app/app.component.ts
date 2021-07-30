import {Component, EventEmitter, Output} from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  remainingTimes: any;
  number: any;
  a: any;

  newCountdown(event: any) {
    this.remainingTimes = event;
  }

  abc(event: any) {
    this.a = event;
  }
}
