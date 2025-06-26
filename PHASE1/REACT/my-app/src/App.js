import logo from './logo.svg';
import './App.css';
import Hello from './components/Hello';
import HelloV1 from './components/HelloV1';
import HelloV2 from './components/HelloV2';

function App() {
  return (
    <div className="App">
      <h1>
        Welcome to EStore
      </h1>

      <Hello name="Muralidhar" />

      <HelloV1 name="Shastry" />

      <HelloV2 name="Sharda" />
    </div>
  );
}

export default App;
