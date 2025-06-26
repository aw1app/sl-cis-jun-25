import { useState } from "react";

function ProductF(props) {

    let [seller, setSeller  ] = useState("HP Inc");
    let [name, setName  ] = useState(props.name);
    let [countryOfOrgin, setCountryOfOrgin  ] = useState("India");
    let [exportLimit, setExportLimit  ] = useState(Number(props.exportLimit));

// seller = "asasasas";///// NO! directly changing state value won't work in react
// setSeller ("asasasas") ; // CORRECT 

let nameInCaps = name.toUpperCase();
let exportLimitNumber =   Number(exportLimit);

const f=()=>{ alert("f is called.");}

    return (
        <div>
            <h3> Product info:</h3>
            <li> Name : {nameInCaps}</li>
            <li> Seller: {seller} </li>
            <li> Country of Origin : {countryOfOrgin}</li>
            <li> Export Limit: {exportLimit}</li>
            <li> Export Allowed : {exportLimitNumber > 100 ? 'LIMIT EXCEEDED' : 'LIMIT ALLOWED'}</li>
            <br></br>
            <button onClick={ f } > Click to call function f </button>
            <button onClick={ () => setExportLimit(10000) } > Click to change export limit to 10000 </button>
            <button onClick={ () => setExportLimit( currVal => currVal + 10 ) } > Click to change export limit by 10 </button>
            <br></br><br></br>
        </div>
    )
}

export default ProductF;