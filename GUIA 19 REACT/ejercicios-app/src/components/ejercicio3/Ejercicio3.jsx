import Ejercicio3Props from "./Ejercicio3Props";

export default function Ejercicio3() {
  return (
    <div>
        <h2>Ejercicio 3</h2>
      <p className="ejercicio">
        
        Crear un Componente Main el cual llame dos veces a un mismo componente,
        es decir, que Main anide a Hijo e Hijo.
      </p>
      <p>Sus hijas son: </p>
      <Ejercicio3Props name="Olga" lastName="Betancourt"/>
      <Ejercicio3Props name="Cleverit" lastName="Betancourt"/>
    </div>
  );
}
