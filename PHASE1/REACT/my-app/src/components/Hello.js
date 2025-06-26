import { Component } from "react";

// Example of a component that recieve data from the parent through props
class Hello extends Component {


    render() {

        // some javascript let x1=10;

        return (

           <div>

             <h2> Hello World !!</h2>
             <h2> Glad to meet you, {this.props.name} !!</h2>

           </div>
        );

    }


}

export default Hello;