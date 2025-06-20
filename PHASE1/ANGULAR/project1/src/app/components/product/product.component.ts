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
  @Input("price") price!:number;
  @Input("inStock") inStock!:boolean;
  @Input("imagePath") imagePath!:string;

  constructor() {
    this.product = new Product();
  }

  ngOnInit():void{
    this.product.name = this.name;
    this.product.price = this.price;
    this.product.inStock = this.inStock;
    this.product.imagePath = this.imagePath;
  }

}
