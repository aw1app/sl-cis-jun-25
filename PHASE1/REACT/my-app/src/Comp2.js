import { useContext } from "react";
import { CountContext } from "./contexts/CounterContext";

const Comp2 = () => {
    let {  count, decrement } = useContext(CountContext);

    return (
        <>
            <p>INSIDE COMP2</p>
            <p> Count : {count} </p>

            <br/>
            <button onClick={decrement} > DECREMENT COUNT </button>
        </>

    );

}

export default Comp2;