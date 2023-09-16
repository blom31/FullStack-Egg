import Producto from "./Producto";

export default function Productos({productos, agregarFav, eliminarFav}) {

    return (
        <div className="productos">
            {
            productos.length > 0 ? productos.map(producto => <Producto key={producto.id} producto={producto} agregarFav={agregarFav} eliminarFav={eliminarFav} />)
            :
            <p>Lista vacia</p>
            }
        </div>
    );
}
