import CompB from "./CompB";


const CompA = () => {

    const pf1 = (data) => console.log("INSIDE CompA's pf1 function " + data);

    return (
        <>
            <p>INSIDE COMPA</p>
            <CompB name="Madan" func1={pf1} />

        </>

    );

}

export default CompA;