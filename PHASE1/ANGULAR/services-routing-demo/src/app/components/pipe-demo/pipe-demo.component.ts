import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { ProductV2 } from '../../models/product-v2';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { ProductV2Service } from '../../services/product-v2.service';

@Component({
  selector: 'app-pipe-demo',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './pipe-demo.component.html',
  styleUrl: './pipe-demo.component.css'
})
export class PipeDemoComponent {

  


  title = 'Angular Pipes Demo';
  today = new Date();
  price = 12345.6789;
  percentage = 0.8567;
  longText = 'This is a very long text that needs slicing for display purposes.';
  jsonData = { name: 'John', age: 30, job: 'Engineer' };
  items = ['Item 1', 'Item 2', 'Item 3', 'Item 4'];



  asyncProducts!: Observable<ProductV2[]>;

  productService!:ProductV2Service;
  router!: Router;


  constructor(productService:ProductV2Service, router: Router){
    this.productService = productService;
    this.router = router;
  }

  ngOnInit():void {
    console.log("INSIDE PipeDemoComponent ngOnInit.")
    this.asyncProducts=this.productService.getProducts();
  }

  ngOnChanges():void {
    console.log("INSIDE PipeDemoComponent ngOnChanges.");
    this.asyncProducts=this.productService.getProducts();
  }




}
