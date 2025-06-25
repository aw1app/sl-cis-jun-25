import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ProductComponent } from './components/product/product.component';
import { ProductListComponent } from './components/product-list/product-list.component';
import { Product } from './models/product';
import { ProductListV2Component } from './components/product-list-v2/product-list-v2.component';
import { ProductV2Component } from './components/product-v2/product-v2.component';
import { AddProductV2Component } from "./components/add-product-v2/add-product-v2.component";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, ProductComponent, ProductListComponent, ProductListV2Component, 
    ProductV2Component, AddProductV2Component],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'ABC XYZ';

  
}