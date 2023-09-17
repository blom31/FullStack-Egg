import { useEffect, useState } from "react";
import reactLogo from "./assets/react.svg";
import viteLogo from "/vite.svg";
/*import bot from './imagen/bot.png'*/
import "./App.css";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import Principal1 from "./components/Principal1";
import Principal2 from "./components/Principal2";

function App() {
  const [count, setCount] = useState(0);

  const [mostrar, setMostrar] = useState(false);
  /*const[imagen, setImagen] = useState(false)*/ /*para querere ver como se muestra una img con el usseEfectt*/
  useEffect(() => {
    console.log("Como muestro una img desde aca?");
    /*if(mostrar){
      setImagen(<img src={reactLogo} alt="React" />)
    }*/
  }, [mostrar]);

  return (
    <>
      <div className="encabezado">
      <img src={viteLogo} className="logo" alt="Vite logo" />
      

        
        <button className="boton">Ejercicio 1</button>
        <br />
        <img src={reactLogo} className="logo react" alt="React logo" />
      </div>
      <h3>Vite + React</h3>

      <div className="card">
        <button
          className="boton"
          onClick={() => setCount((count) => count + 1)}
        >
          count is {count}
        </button>

        <button className="boton" onClick={() => setMostrar(!mostrar)}>Vite?</button>
        {/*uso del hook UseState*/}
        <p> {mostrar && "Practiquemos"} </p>
        <img
          src={mostrar ? viteLogo : reactLogo}
          className="logo"
          alt="Vite logo"
        />
      </div>
      <div className="card">
        
      </div>
    </>
  );
}

export default App;
