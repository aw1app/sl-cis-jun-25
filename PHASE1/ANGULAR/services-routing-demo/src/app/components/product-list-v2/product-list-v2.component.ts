import { Component } from '@angular/core';
import { ProductV2 } from '../../models/product-v2';
import { ProductV2Service } from '../../services/product-v2.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'product-list-v2',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './product-list-v2.component.html',
  styleUrl: './product-list-v2.component.css'
})
export class ProductListV2Component {


  productV2Service!: ProductV2Service;
  products!: ProductV2[];

  constructor(productV2Service: ProductV2Service) {
    this.productV2Service = productV2Service;
  }


  ngOnInit(): void {
    this.productV2Service.getProducts().subscribe(

      res => this.products = res,
      err => console.log("Error fetching product list", err)

    );
  }

  
  deleteProduct(id: number) {
    this.productV2Service.deleteProduct(id);
  }

}
