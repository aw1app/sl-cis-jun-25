import logo from './logo.svg';
import './App.css';
import Hello from './components/Hello';
import HelloV1 from './components/HelloV1';

function App() {
  return (
    <div className="App">
      <h1>
        Welcome to EStore
      </h1>

      <Hello name="Muralidhar" />

      <HelloV1 name="Shastry" />
    </div>
  );
}

export default App;
