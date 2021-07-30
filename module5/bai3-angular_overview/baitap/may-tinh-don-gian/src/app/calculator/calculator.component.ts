import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.scss']
})
export class CalculatorComponent implements OnInit {
result;
  constructor() { }

  ngOnInit(): void {
  }
  calculate(number1: string, number2: string, select: string): number {

    // tslint:disable-next-line:radix
        const number3: number = parseInt(number1);

    // tslint:disable-next-line:radix
        const number4: number = parseInt(number2);
        switch (select) {
          case '+':
            return this.result = number3 + number4;
          case '-':
            return this.result = number3 - number4;
          case '*':
            return this.result = number3 * number4;
          case '/':
            return this.result = number3 / number4;
    }
  }
}
