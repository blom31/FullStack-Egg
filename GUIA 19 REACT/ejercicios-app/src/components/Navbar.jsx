
import { Link } from "react-router-dom"
export default function Navbar() {
  return (
    <div>
      <div className='navbar'>
      <Link className='link' to ='/'>Inicio</Link>
      {/*<Link to='/Principal2'>Principal 2 </Link>*/}
      <Link className='link' to='/Ejercicio1'>Ejercicio 1 </Link>
      <Link className="link" to='Ejercicio2'>Ejercicio 2</Link>
      <Link className="link" to='Ejercicio3'>Ejercicio 3</Link>
      <Link className="link" to='Ejercicio4'>Ejercicio 4</Link>
      
    </div>
    </div>
  )
}
