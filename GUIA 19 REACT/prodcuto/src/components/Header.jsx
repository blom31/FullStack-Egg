import React from "react";
import {Link} from 'react-router-dom'
import Logo from '../img/logo_gob.png'

export default function Header(){
    return(
        <header className="header">
            <Link className="icon" to={"/"}><img src={Logo} alt=""/></Link>
            
           <nav>
                <Link to={"/"}>Productos</Link>
                <Link to={"/favoritos"}>Favoritos</Link>
           </nav>
            
        </header>
    )
}