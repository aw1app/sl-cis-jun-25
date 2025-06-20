import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ProductComponent } from './components/product/product.component';
import { ProductListComponent } from './components/product-list/product-list.component';
import { Product } from './models/product';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, ProductComponent, ProductListComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'ABC XYZ';

  x=1000;

 products:Product[] = [
    new Product(1, "iPhone", 75000, "Great Phone 1", true, 'images/111.png'),
    new Product(2, "Nokia", 5000, "Simple Phone 2", true, 'images/222.png'),
    new Product(3, "Samsung", 15000, "Good Phone 3", true, 'images/333.png'),
    new Product(4, "Motorala", 25000, "Nice Phone 4", false, 'images/444.png')
  ];

  name1:string="Dell Laptop";
  price1:number=555;


  Samsung:string="QQQQQQQQQQQQQQQQQQQ";
}
