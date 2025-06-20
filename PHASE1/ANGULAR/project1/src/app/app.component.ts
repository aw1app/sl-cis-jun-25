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

  //cart!:Product[];

 products:Product[] = [
    new Product(1, "iPhone", 75000, "Great Phone 1", true, 'images/Apple-Phone.JPG'),
    new Product(2, "Dell Laptop", 5000, "Simple Phone 2", true, 'images/dell.JPG'),
    new Product(3, "Samsung", 15000, "Good Phone 3", true, 'images/samsung.png'),
    new Product(4, "Motorala", 25000, "Nice Phone 4", false, 'images/motorola.png')
  ];

  name1:string="Dell Laptop";
  price1:number=555;


  Samsung:string="QQQQQQQQQQQQQQQQQQQ";

  p1(data:any):void{
    console.log(`INSIDE p1 of AppComponent.`);
    console.log(`adding ${data} to the Cart.`);
  }
}
