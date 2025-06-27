import { useDispatch } from "react-redux";
import { addProduct } from "../store";
import { useState } from "react";

const ProductForm = () => {

    const dispatch = useDispatch();

    let [product, setProduct] = useState( { title:'', price: 0 } );


    const handleChange = (evt) => {
      let {name, value} = evt.target;

      setProduct(
        currProd => ( {...currProd, [name]: value } )
      );

    }

    const handleSubmit = (evt) => {
        evt.preventDefault();

        dispatch ( addProduct(product)  );

    }

    return (

        <form onSubmit={ handleSubmit }>

            <input name="title" value={product.title} onChange={handleChange} required />
            <input name="price" value={product.price} onChange={handleChange} required />

            <button type="submit">ADD PRODUCT</button>

        </form>


    )

}


export default ProductForm;