import { Component } from '@angular/core';
import { Product } from '../../models/product';

@Component({
  selector: 'product',
  standalone: true,
  imports: [],
  templateUrl: './product.component.html',
  styleUrl: './product.component.css'
})
export class ProductComponent {

 product:Product= new Product(0,"Mac Laptop", 1000000, "Great Workforce Laptop", true, '');

}
