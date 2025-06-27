import { useState } from 'react'
import './App.css'
import CompA from './components/CompA.jsx'
import CompB from './components/CompB.jsx'
import {useSelector, useDispatch } from 'react-redux'
import ProductList from './components/ProductList.jsx'

function App() {
  const [count, setCount] = useState(0)
  

  const val = useSelector(state => state.counter.val);

  return (
    <>
      <h1>Welcome to Estore val={val}</h1>

      <ProductList />

      {/* <CompA />

      <br></br><br></br>

      <CompB /> */}
    </>
  )

}

export default App;
