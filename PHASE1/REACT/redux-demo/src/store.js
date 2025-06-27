import { configureStore, createAsyncThunk, createSlice } from "@reduxjs/toolkit";


///////// COUNTER SLICE ////////////////////
const counterSlice = createSlice(
    {

        name: 'counter',
        initialState: { val: 0 },

        reducers: {
            //synchronous actions
            increment: (state) => { state.val += 1; },
            decrement: (state) => { state.val -= 1; },
        }

    }

);

// Exposing the synchrounous actions to the components.
export const { increment, decrement } = counterSlice.actions;

///////// COUNTER SLICE ////////////////////


///////// PRODUCTS SLICE ////////////////////

// Async thunk to fetch products from json-server
export const fetchProducts = createAsyncThunk('products/fetchProducts', async () => {
    const response = await fetch('http://localhost:5000/products');
    const data = await response.json();
    return data;
}
);

export const addProduct = createAsyncThunk('products/addProduct', async (newProduct) => {

    const res = await fetch('http://localhost:5000/products', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(newProduct),
    });

    const data = await res.json();
    return data;

}
);


export const deleteProduct = createAsyncThunk('products/deleteProduct', async (productId) => {

    const res = await fetch(`http://localhost:5000/products/${productId}`, {
        method: 'DELETE',
    });
    if (res.ok) {       
        return productId; // Return the deleted product ID
    } else {
        throw new Error('Failed to delete product');
    }
}
);


const productsSlice = createSlice(
    {

        name: 'products',
        initialState: { items: [], error: '', status: 'idle' },

        reducers: {
            //synchronous actions
        },
        extraReducers: (builder) => {

            builder
                .addCase(fetchProducts.pending, (state) => {
                    console.log('store : INSIDE extraReducers fetchProducts.pending case ');
                    state.status = 'loading';
                })
                .addCase(fetchProducts.fulfilled, (state, action) => {
                    console.log('store : INSIDE fetchProducts fetchProducts.fulfilled case ');
                    state.status = 'succeeded';
                    state.items = action.payload;
                })
                .addCase(fetchProducts.rejected, (state, action) => {
                    console.log('store : INSIDE fetchProducts fetchProducts.rejected case ');
                    state.status = 'failed';
                    state.error = action.error.message;
                })
                .addCase(addProduct.fulfilled, (state, action) => {
                    state.status = 'add-product-succeeded';
                    state.items.push(action.payload);
                })
                .addCase(deleteProduct.fulfilled, (state, action) => {
                    state.status = 'delete-product-succeeded';
                    state.items.filter( product  => product.id != action.payload);
                })
                ;

        }

    }

);



///////// PRODUCTS SLICE ////////////////////


const store = configureStore(
    {
        reducer: {
            counter: counterSlice.reducer,
            products: productsSlice.reducer
        },
    }
);

export default store;