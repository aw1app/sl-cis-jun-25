import { Component } from '@angular/core';
import { Product } from '../../models/product';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'product-list',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './product-list.component.html',
  styleUrl: './product-list.component.css'
})
export class ProductListComponent {

  products!: Product[];

  constructor() {
    this.products = [
      new Product(1, "iPhone", 75000, "Great Phone", true, 'images/111.png'),
      new Product(2, "Nokia", 5000, "Simple Phone", true, 'images/222.png'),
      new Product(3, "Samsung", 15000, "Good Phone", true, 'images/333.png'),
      new Product(4, "Motorala", 25000, "Nice Phone", false, 'images/444.png')
    ];
  }

}
