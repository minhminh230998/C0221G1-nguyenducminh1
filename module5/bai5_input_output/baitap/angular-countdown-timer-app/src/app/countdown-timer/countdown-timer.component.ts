import {Component, EventEmitter, Input, OnChanges, OnDestroy, OnInit, Output, SimpleChanges} from '@angular/core';

@Component({
  selector: 'app-countdown-timer',
  templateUrl: './countdown-timer.component.html',
  styleUrls: ['./countdown-timer.component.css']
})
export class CountdownTimerComponent implements OnInit, OnChanges, OnDestroy {
  message = '';
  remainingTime: number;
  @Input()
  seconds: any;
  @Output()
  finish = new EventEmitter();
  @Output()
  se = new EventEmitter();
  private intervalId = 0;
  private a: any = 0;


  ngOnChanges(changes: SimpleChanges) {
    if ('seconds' in changes) {
      let v = changes.seconds.currentValue;
      v = typeof v === 'undefined' ? 0 : v;
      const vFixed = Number(v);
      this.seconds = Number.isNaN(vFixed) ? 0 : vFixed;
    }
  }

  clearTimer() {
    clearInterval(this.intervalId);
  }

  resetTime(a: any) {
    a = this.remainingTime;
    clearInterval(a);
  }

  ngOnInit() {
    this.reset();
  }

  ngOnDestroy() {
    this.clearTimer();
  }

  start() {
    if (this.a !== 0) {
      this.remainingTime = this.a;
      this.countDown();
      this.se.emit(this.a);
    } else {
      this.countDown();
      this.remainingTime = this.seconds;
      this.se.emit(this.seconds);
    }

    if (this.remainingTime <= 0) {
      this.clearTimer();
      this.finish.emit('Do not countdown!');
    }
  }

  stop() {

    this.a = this.remainingTime;
    this.clearTimer();
    this.resetTime(this.remainingTime);
    this.message = `Holding at T-${this.a} seconds`;
    this.se.emit(this.message);
  }

  reset() {
    this.clearTimer();
    this.remainingTime = this.seconds;
    this.message = `Click start button to start the Countdown, ${this.seconds}`;
    this.se.emit(this.message);
  }

  private countDown() {
    // this.clearTimer();
    this.intervalId = window.setInterval(() => {
      this.finish.emit(this.remainingTime);
      this.remainingTime -= 1;
      if (this.remainingTime === 0) {
        this.finish.emit('Blast off!');
        this.clearTimer();
      } else {
        this.finish.emit(`T-${this.remainingTime} seconds and counting`);
      }
    }, 1000);
  }
}
