import './App.css'
import { BrowserRouter, Route, Routes } from 'react-router'
import Bubble from './Components/Bubble'
import Selection from './Components/Selection'
import Merge from './Components/Merge'
import Quick from './Components/Quick'
import Insertion from './Components/Insertion'
import Heap from './Components/Heap'
import Header from './Components/Header'
function App() {

  return (
    <>
    <BrowserRouter>
    <Header/>
      <Routes>
      <Route path='/bubble' element={<Bubble/>}/>
      <Route path='/selection' element={<Selection/>}/>
      <Route path='/merge' element={<Merge/>}/>
      <Route path='/quick' element={<Quick/>}/>
      <Route path='/insertion' element={<Insertion/>}/>
      <Route path='/heap' element={<Heap/>}/>
      </Routes>
      </BrowserRouter>
    </>
  )
}

export default App
