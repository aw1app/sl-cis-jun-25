import { Component, Input } from '@angular/core';
import { Product } from '../../models/product';
import { CommonModule } from '@angular/common';
import { ProductComponent } from '../product/product.component';

@Component({
  selector: 'product-list',
  standalone: true,
  imports: [CommonModule, ProductComponent],
  templateUrl: './product-list.component.html',
  styleUrl: './product-list.component.css'
})
export class ProductListComponent {

 @Input("products") products!: Product[];



}
