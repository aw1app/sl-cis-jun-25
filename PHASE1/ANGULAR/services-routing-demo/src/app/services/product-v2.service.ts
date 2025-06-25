import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs/internal/BehaviorSubject';
import { ProductV2 } from '../models/product-v2';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class ProductV2Service {

  private serverUrl: string = "http://localhost:5000/products";

  private productsSubject = new BehaviorSubject<ProductV2[]>([]);
  products$ = this.productsSubject.asObservable();



  constructor(private httpClient: HttpClient) {
    this.loadProducts();
  }

  // Load all products and update the subject
  loadProducts(): void {
    this.getProducts().subscribe(
      response => this.productsSubject.next(response),
      error => console.error('Error loading products:', error)
    );
  }

  // CRUD 
  // get all products
  getProducts(): Observable<ProductV2[]> {
    return this.httpClient.get<ProductV2[]>(this.serverUrl);
  }

  // get a single product
  getProduct(id: number): Observable<ProductV2> {
    return this.httpClient.get<ProductV2>(this.serverUrl + "/" + id);
  }


}
