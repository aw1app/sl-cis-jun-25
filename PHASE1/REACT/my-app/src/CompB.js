

const CompB = (props) => {


    return (
        <div style={{ borderColor: "1px solid blue" }} >
            My name as given by my parent(CompA) : {props.name}    

            <button onClick={ () => props.func1(100) } > Click me to call parent's (CompA's)  function pf1 and give it 100</button>
        </div>
    );

}


export default CompB;