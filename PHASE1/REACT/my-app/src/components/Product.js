import { Component } from "react";


class Product extends Component {


    constructor(props) {
        super(props);

        this.state = {
            "name": this.props.name,
            "seller": "Dell Inc",
            "countryOfOrgin": "USA",
            "exportLimit": this.props.exportLimit
        }
    }



    render() {

        let nameInCaps = this.state.name.toUpperCase();
        let exportLimitNumber =   Number(this.state.exportLimit);

        return (
            <div>
                <h3> Product info:</h3>
                <li> Name : {nameInCaps}</li>
                <li> Seller: {this.state.seller} </li>                
                <li> Country of Origin : {this.state.countryOfOrgin}</li>
                <li> Export Limit: {this.state.exportLimit}</li>
                <li> Export Allowed : { exportLimitNumber > 100 ? 'LIMIT EXCEEDED' : 'LIMIT ALLOWED'}</li>
            </div>
        );
    }


}

export default Product;