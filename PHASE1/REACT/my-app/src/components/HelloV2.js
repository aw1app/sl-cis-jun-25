import { Component } from "react";

// Example of a component that has state that we set it inside constructor
class HelloV2 extends Component {
x1=10;

  constructor(props) {
   super(props);

    this.state = {
      name: props.name,
      age: 23,
      city: "Noida"
    };

  }

  f(){
    alert("Hi, did you click the button?")
  }

  render() {
    // some javascript let x1=10;

    return (

      <div>

        <h2> Hello World !!</h2>
        <h3> Glad to meet you, {this.props.name} !!</h3>
        <h3> Tell me from which city you are? Is that {this.state.city}? </h3>
        <h3> x1 : {this.x1} </h3>

        <br/>
        <button onClick={this.f} > CLICK me! </button>
      </div>
    );

  }

}

export default HelloV2;