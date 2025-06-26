import { Component } from "react";

// Example of a component that has state
class HelloV1 extends Component {

  state = {
    age:23,
    city: "Noida"
  };


    render() {
        // some javascript let x1=10;

        return (

           <div>

             <h2> Hello World !!</h2>
             <h3> Glad to meet you, {this.props.name} !!</h3>
             <h3> Tell me from which city you are? Is that {this.state.city}? </h3>
           </div>
        );

    }

}

export default HelloV1;