import { useContext } from "react";
import { CountContext } from "./contexts/CounterContext";

const Comp1 = () => {
    let {  count, increment } = useContext(CountContext);

    return (
        <>
            <p>INSIDE COMP1</p>
            <p> Count : {count} </p>

            <br/>
            <button onClick={increment} > INCREMENT COUNT </button>
        </>

    );

}

export default Comp1;