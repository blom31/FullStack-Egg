import React, { useState } from "react";
import { Link } from "react-router-dom";
import fav from "../img/vite.png";
import Nofav from "../img/react.png";

export default function Producto({ producto, agregarFav, eliminarFav }) {
  const [favorito, setFavorito] = useState(false);

  function handleCick() {

    if(favorito){
      eliminarFav(producto)
      setFavorito(false)
    }else{
      agregarFav(producto)
      setFavorito(true)
    }
    
  }

  return (
    <div className="producto">
      <Link to={'/producto/${producto.id}'}><img src={producto.image} alt="" />{" "}</Link>
      <div className="info">
        <p>{producto.title}</p>
        <mark>${producto.price}</mark>
      </div>
      {favorito ? (
        <img className="fav" onClick={handleCick} src={Nofav} alt="" />
      ) : (
        <img className="fav" onClick={handleCick} src={fav} alt="" />
      )}
    </div>
  );
}
