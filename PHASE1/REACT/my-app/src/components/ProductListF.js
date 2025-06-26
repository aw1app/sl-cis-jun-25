import { useState } from "react";

let initialProducts = [
    { name: "HP Monitor", price: 6000 },
    { name: "Dell Monitor", price: 7000 },
]


const ProductListF = (props) => {
    let [products, setProducts] = useState(initialProducts);




    return (
        <div>
            <h3> Product List:</h3>
            <table border="1"><thead><td>NAME</td><td>PRICE</td></thead>
            {
               products.map( product =>  <tr> <td> {product.name} </td> <td>  {product.price} </td>  </tr>     ) 
            }
            </table>

        </div>
    );
}


export default ProductListF;