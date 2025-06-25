import { Component, Input } from '@angular/core';
import { ProductV2Service } from '../../services/product-v2.service';
import { ProductV2 } from '../../models/product-v2';
import { ActivatedRoute } from '@angular/router';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'product-v2',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './product-v2.component.html',
  styleUrl: './product-v2.component.css'
})
export class ProductV2Component {
  product: any;

  productV2Service!: ProductV2Service;
  @Input() id!: number;

  route!: ActivatedRoute;

  constructor(productV2Service: ProductV2Service, route: ActivatedRoute) {
    this.productV2Service = productV2Service;
    this.route = route;
  }


  ngOnInit(): void {


    this.route.paramMap.subscribe(params => {

      const productId = params.get('id');

      if (productId !== null) {
        this.id = Number(productId);

        this.productV2Service.getProduct(this.id).subscribe(

          res => this.product = res,
          err => console.log("Error fetching product with id ", this.id, err)

        );

      }

    });


  }


}
