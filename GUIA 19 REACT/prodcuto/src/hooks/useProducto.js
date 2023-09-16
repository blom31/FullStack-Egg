import { useEffect, useState } from 'react';
import { obtenerProductos } from '../servicios/productoService';

export default function useProducto() {
  
    const [productos, setProductos] = useState([]);
    const [favoritos, setFavoritos ]=useState([]);

    useEffect(() => {
        obtenerProductos().then((data) => {
            setProductos(data);
        });
    }, []);

function agregarFav(producto){
    const newFav = [...favoritos]
    newFav.push({...producto})
    setFavoritos(newFav)
}
function eliminarFav(producto){
    const newFav= favoritos.filter (e=> e.id !== producto.id )  //elimina el elemento que coincide con
    setFavoritos(newFav)//el id del objeto a borrar

}
    return {productos, favoritos, agregarFav, eliminarFav}
}
