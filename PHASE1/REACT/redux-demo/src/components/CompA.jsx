import { useDispatch, useSelector } from "react-redux";
import { increment, decrement } from "../store";

const CompA = (props) => {

    const val = useSelector(state => state.counter.val);
    const dispatch = useDispatch();

    return (
        <div style={{ border: '1px solid red'}}>
            Val : { val }  &nbsp;  &nbsp;

            <button onClick={  () => dispatch ( increment() ) } > INCREMENT THE GLOBAL VARIABLE val </button>   &nbsp;  &nbsp;
            <button onClick={  () => dispatch ( decrement() ) } > DECREMENT THE GLOBAL VARIABLE val </button>

        </div>

    )


}


export default CompA;