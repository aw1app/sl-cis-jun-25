import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import CompA from './components/CompA.jsx'
import CompB from './components/CompB.jsx'
import {useSelector, useDispatch } from 'react-redux'

function App() {
  const [count, setCount] = useState(0)
  

  const val = useSelector(state => state.counter.val);
  const dispatch = useDispatch();

  return (
    <>
      <h1>Welcome to Estore val={val}</h1>

      <CompA />

      <br></br><br></br>

      <CompB />
    </>
  )

}

export default App;
