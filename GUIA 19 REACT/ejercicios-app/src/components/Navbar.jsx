
import { Link } from "react-router-dom"
export default function Ejercicio2() {
  return (
    <div>
      <div className='navbar'>
      <Link className='link' to ='/'>Inicio</Link>
      {/*<Link to='/Principal2'>Principal 2 </Link>*/}
      <Link className='link' to='/Ejercicio1'>Ejercicio 1 </Link>
    </div>
    </div>
  )
}
