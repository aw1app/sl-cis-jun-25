import { useEffect, useState } from "react";
import { useDispatch, useSelector } from "react-redux";
import { fetchProducts } from "../store";


const ProductListRedux = (props) => {

    let { items, error, status } = useSelector(state => state.products); // extract the slice parameters like items, status from the products slice.
    const dispatch = useDispatch();


    useEffect(

        () => {
           
            if (status === 'idle') dispatch(fetchProducts())

        },

        [status]

    );

    if (status === 'loading') {
        return <p>Loading products...</p>;
    }

    if (status === 'failed') {
        return <p>Error fetching products data error: {error}</p>;
    }


    return (
        <>
            <h3 > Product List:</h3>
            <table border="1"><thead><tr><td>NAME</td><td>PRICE</td></tr></thead><tbody>
                {
                    items &&
                    (
                        items.length === 0 ? <tr><td> No Products to display </td></tr> :

                            items.map( (product,key) => <tr><td>{product.title}</td><td>{product.price} </td></tr>)

                    )
                }
           </tbody></table>

        </>
    );
}


export default ProductListRedux;