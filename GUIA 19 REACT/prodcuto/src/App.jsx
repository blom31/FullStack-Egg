import { BrowserRouter, Routes, Route } from 'react-router-dom'
import './App.css'
import Footer from './components/footer'
import Header from './components/header'
import Productos from "./components/Productos"
import useProducto from './hooks/useProducto'
import Detalle from './components/Detalle'

function App() {
 
  const{productos, favoritos, agregarFav, eliminarFav} = useProducto()
  return (
    <BrowserRouter>
      <Header/>
        <Routes>
          <Route path="/" element={<Productos productos={productos} agregarFav={agregarFav} eliminarFav={eliminarFav}/>} />
          <Route path="/favoritos" element={<Productos productos={favoritos} agregarFav={agregarFav} eliminarFav={eliminarFav}/>} />
          <Route path="/producto/:id" element={<Detalle/>}/>
        </Routes>
      <Footer/>
    </BrowserRouter>
  )
}


export default App 
