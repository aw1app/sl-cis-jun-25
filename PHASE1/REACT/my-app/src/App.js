import logo from './logo.svg';
import './App.css';
import Hello from './components/Hello';
import HelloV1 from './components/HelloV1';
import HelloV2 from './components/HelloV2';
import Timer from './components/Timer';
import Product from './components/Product';
import ProductF from './components/ProductF';
import ProductListF from './components/ProductListF';

function App() {
  return (
    <div className="App">
      <h1>
        Welcome to EStore
      </h1>

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
