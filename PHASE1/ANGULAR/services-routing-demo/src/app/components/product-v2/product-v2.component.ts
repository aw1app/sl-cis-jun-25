import { Component, Input } from '@angular/core';
import { ProductV2Service } from '../../services/product-v2.service';
import { ProductV2 } from '../../models/product-v2';

@Component({
  selector: 'product-v2',
  standalone: true,
  imports: [],
  templateUrl: './product-v2.component.html',
  styleUrl: './product-v2.component.css'
})
export class ProductV2Component {
product: any;

  productV2Service!:ProductV2Service;
  @Input() id!:number;

  constructor(productV2Service:ProductV2Service){
    this.productV2Service = productV2Service;    
  }


  ngOnInit():void{
    this.productV2Service.getProduct(this.id).subscribe(

      res => this.product = res,
      err => console.log("Error fetching product with id ", this.id,  err)

    );
  }


}
