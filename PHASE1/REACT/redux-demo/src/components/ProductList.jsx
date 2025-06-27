import { useEffect, useState } from "react";


const ProductList = (props) => {
    let [products, setProducts] = useState([]);

    useEffect(

        () => { 

            fetch("http://localhost:5000/products")
                .then(res => res.json())
                .then(jsonData => setProducts(jsonData))
                .catch(err => console.log(' something thing went wrong ' + err));

         },

        []

    )

    return (
        <>
            <h3 > Product List:</h3>
            <table border="1"><thead><td>NAME</td><td>PRICE</td></thead>
                {
                    products && 
                    (
                        products.length === 0 ? 'No Products to display ' : 

                        products.map(product => <tr> <td> {product.title} </td> <td>  {product.price} </td>  </tr>)

                    )
                }
            </table>

        </>
    );
}


export default ProductList;