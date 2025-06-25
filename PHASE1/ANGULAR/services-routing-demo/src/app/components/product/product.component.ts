import { Component, EventEmitter, Input, Output } from '@angular/core';
import { ProductService } from '../../services/product.service';
import { Product } from '../../models/product';

@Component({
  selector: 'product',
  standalone: true,
  imports: [],
  templateUrl: './product.component.html',
  styleUrl: './product.component.css'
})
export class ProductComponent {

  product!: Product;
  productService! :ProductService;

  @Input() id!: number;

  constructor(productService :ProductService) {
    this.productService=productService;
  } 

  ngOnInit():void{
    this.product= this.productService.getProduct(this.id);
  }

}