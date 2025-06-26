import { Component } from "react";


class Timer extends Component {

    constructor(props) {
        super(props);
        console.log('INSIDE constructor');

        this.state = {
            seconds: 0,
            maxSeconds: 15
        }
    }

    shouldComponentUpdate(nextProps,nextState){
        console.log('INSIDE shouldComponentUpdate');
        if (nextState.seconds < this.state.maxSeconds + 1 )
            return true;
        else
        return false;
    }

    // called when this comp is inserted into DOM
    componentDidMount() {
        console.log("INSIDE componentDidMount");

        const func = () => {
            this.setState( currState => ( { seconds: currState.seconds + 1  } )
            );
        };

        this.intervalId = setInterval(func, 1000); // run every 1000 ms (1 secs)
    };



    // destroy method
    componentWillUnmount() {
        console.log("INSIDE componentWillUnmount");
        clearInterval(this.intervalId);
    }

    render() {
        console.log("INSIDE render");

        return (
            <div>
                <h1>Timer : {this.state.seconds} seconds</h1>
            </div>
        );
    }





}



export default Timer;