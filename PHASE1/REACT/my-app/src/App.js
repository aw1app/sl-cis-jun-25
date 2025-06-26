import logo from './logo.svg';
import './App.css';
import Hello from './components/Hello';
import HelloV1 from './components/HelloV1';
import HelloV2 from './components/HelloV2';
import Timer from './components/Timer';
import Product from './components/Product';
import ProductF from './components/ProductF';
import ProductListF from './components/ProductListF';
import CompA from './CompA';

// Context Demo
import Comp1 from './Comp1';
import Comp2 from './Comp2';
import { CountContext, CountProvider } from './contexts/CounterContext';
import { useContext } from 'react';

function App() {
  let {  count} = useContext(CountContext);

  return (
    <div className="App">
      <h1 className="App-header" style={{ backgroundColor: "lightblue" }}>
        Welcome to EStore {count}
      </h1>

      
        <Comp1 />
        <Comp2 />

      <hr />
      <CompA />

      <hr />
      <ProductListF />

      <hr />
      <Product name="DSP Chip 001" exportLimit="1000" />
      <Product name="iPhone 2025" exportLimit="80" />

      <ProductF name="Nokia 3010" exportLimit="800" />
      <ProductF name="Motorola AI Laptop" exportLimit="18" />

      {/* <Timer /> */}

      {/* <Hello name="Muralidhar" />

      <HelloV1 name="Shastry" />

      <HelloV2 name="Sharda" /> */}
    </div>
  );
}

export default App;
