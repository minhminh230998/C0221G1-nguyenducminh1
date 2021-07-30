import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DetailTranslateComponent } from './detail-translate.component';

describe('DetailTranslateComponent', () => {
  let component: DetailTranslateComponent;
  let fixture: ComponentFixture<DetailTranslateComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DetailTranslateComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DetailTranslateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
