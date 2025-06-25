import { Component, Input } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ProductComponent } from '../product/product.component';
import { ProductService } from '../../services/product.service';
import { Product } from '../../models/product';

@Component({
  selector: 'product-list',
  standalone: true,
  imports: [CommonModule, ProductComponent],
  templateUrl: './product-list.component.html',
  styleUrl: './product-list.component.css'
})
export class ProductListComponent {

  productService!:ProductService;
  products!:Product[];

  constructor(productService:ProductService){
    this.productService = productService;

    this.products =  this.productService.getProducts();
  }
  

}