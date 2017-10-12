import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SegViaBoletoComponent } from './seg-via-boleto.component';

describe('SegViaBoletoComponent', () => {
  let component: SegViaBoletoComponent;
  let fixture: ComponentFixture<SegViaBoletoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SegViaBoletoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SegViaBoletoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
