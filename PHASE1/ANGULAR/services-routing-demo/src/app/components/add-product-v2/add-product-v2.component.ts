import { Component } from '@angular/core';
import { ProductV2Service } from '../../services/product-v2.service';
import { ProductV2 } from '../../models/product-v2';
import { CommonModule } from '@angular/common';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'add-product-v2',
  standalone: true,
  imports: [CommonModule, ReactiveFormsModule],
  templateUrl: './add-product-v2.component.html',
  styleUrl: './add-product-v2.component.css'
})
export class AddProductV2Component {

  productV2Service!: ProductV2Service;
  product!: ProductV2;

  productForm!: FormGroup;

  constructor(private fb: FormBuilder, productV2Service: ProductV2Service) {
    this.productV2Service = productV2Service;

    this.productForm = this.fb.group(

      {
        productName: ['', [Validators.required, Validators.minLength(3)]],
        productPrice: ['', [Validators.required, Validators.pattern(/^\d+(\.\d{1,2})?$/), Validators.max(100000)]]
      }

    );

  }

  addProduct(): void {
    let name = this.productForm.get('productName')?.value;
    let price = this.productForm.get('productPrice')?.value;

    let tempProduct = new ProductV2(-1, name, price, 'some desc');

    console.log("INSIDE addProduct() ", tempProduct);

    this.productV2Service.addProduct(tempProduct);


  }

}
