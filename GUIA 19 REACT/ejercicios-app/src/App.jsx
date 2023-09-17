
import "./App.css";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import Inicio from "./components/Principal1";
//import Principal2 from "./components/Principal2";
import Header from "./components/Header";
import Navbar from "./components/Navbar"
import Ejercicio1 from "./components/Ejercicio1";
import Footer from "./components/Footer";

function App() {
  
  return (
      <BrowserRouter>
      <Header/>
      <Navbar/>
        <Routes>
          <Route path="/" element={<Inicio />}></Route>
          {/*<Route path="/Principal2" element={<Principal2 />}></Route>
          <Route path="/producto/:id" element={<Principal2/>}></Route>
          <Route path="/*" element ={<h1>404</h1>}></Route>*/}
          <Route path="/Ejercicio1" element={<Ejercicio1/>}></Route>
          
        </Routes>
        <Footer/>
        </BrowserRouter>
  );
}

export default App;
