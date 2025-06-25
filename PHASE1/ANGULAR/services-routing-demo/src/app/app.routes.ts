import { Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { AddProductV2Component } from './components/add-product-v2/add-product-v2.component';
import { ProductListV2Component } from './components/product-list-v2/product-list-v2.component';

export const routes: Routes = [

    { path: '', component: AppComponent },
    { path: 'add-product', component: AddProductV2Component },
    { path: 'list-products', component: ProductListV2Component },
    



];
