import { Component, Input } from '@angular/core';
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

  @Input("name") name!:string;

  constructor() {
    this.product = new Product();
  }

  ngOnInit():void{
    this.product.name = this.name;
  }

}
