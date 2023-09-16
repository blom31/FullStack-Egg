import  {useState, useEffect} from "react";

export default function Welcome(props){
console.log(props);
const {message, name} = props; /*esto muestra el paso de las props de un componente a otro*/

/* esto es para el uso del useState que sisrve para cambiar el estado de algo sin actualizar toda la pag*/
const [counter, setCounter] = useState(0); /*el valor inicial es cero*/
const [semaforo, setSemaforo] = useState(false) /* el valor inicial es false*/
console.log(semaforo);

/*uso de los HOOKS*/
useEffect( ()=>{
    console.log(semaforo);
},[semaforo]);

const contar = () => { /*función contar y cambia valor al preionar el boton*/
    setCounter(counter + 1); /*con esta función aumenta el contador*/
    setSemaforo(!semaforo) /*con esta función cambial el calor booleano*/
}
console.log(semaforo);
    return (
        <div>
            <p>Hola, {name} </p>
            <h3>{message}</h3>
            <h2>Contador de React con Hooks</h2>
            <p>Contador creciendo es {counter} </p>
            <p>El color del semaforo es {semaforo ? 'red' : 'green'}</p> {/*se muestra el color del semaforo segun su estado */}
            <button type="submit" onClick={contar}>Aumentar el Contador</button><br/>
        </div>
    );
}