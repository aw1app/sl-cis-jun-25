import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductV2Component } from './product-v2.component';

describe('ProductV2Component', () => {
  let component: ProductV2Component;
  let fixture: ComponentFixture<ProductV2Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ProductV2Component]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ProductV2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
