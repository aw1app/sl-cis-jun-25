import { useState } from 'react'
import './App.css'
import CompA from './components/CompA.jsx'
import CompB from './components/CompB.jsx'
import { useSelector, useDispatch } from 'react-redux'
import ProductList from './components/ProductList.jsx'
import ProductListRedux from './components/ProductListRedux.jsx'
import ProductForm from './components/ProductForm.jsx'
import Header from './components/Header.jsx'
import { Route, Routes } from 'react-router-dom'

function App() {
  const [count, setCount] = useState(0)


  const val = useSelector(state => state.counter.val);

  return (
    <>

      <Header />

      <div style={{ padding: '20px' }}>
        <Routes>
          <Route path="/" element={<ProductListRedux />} />
          <Route path="/add-product" element={<ProductForm />} />

        </Routes>

      </div>

      {/* <h1>Welcome to Estore val={val}</h1> */}
      {/* <ProductForm />

      <ProductListRedux /> */}

      {/* <ProductList /> */}

      {/* <CompA />

      <br></br><br></br>

      <CompB /> */}
    </>
  )

}

export default App;
