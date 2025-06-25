import { Injectable } from '@angular/core';
import { Product } from '../models/product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  products!: Product[];

  constructor() {

    this.products = [
      new Product(1, "iPhone", 75000, "Great Phone 1", true, 'images/Apple-Phone.JPG'),
      new Product(2, "Dell Laptop", 5000, "Simple Phone 2", true, 'images/dell.JPG'),
      new Product(3, "Samsung", 15000, "Good Phone 3", true, 'images/samsung.png'),
      new Product(4, "Motorala", 25000, "Nice Phone 4", false, 'images/motorola.png')
    ];

  }

  // CRUD 
  // get all products
  getProducts(): Product[] {
    return this.products;
  }

  // get a single product
  getProduct(id: number): Product {
    return this.products[id];
  }

  // add a new product

  // delete a product

  // edit a product

}
