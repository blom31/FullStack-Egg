export default function Ejercicio1() {
  const titulo = "Hello Dog ";
  const subtitulo = "Sub título";

  return (
    <div>
      <h2>Ejercicio 1</h2>
      <p className="ejercicio">
        Crear un proyecto compuesto de un solo Functional Component. En dicho
        componente mostrar al menos dos datos, como por ejemplo titulo y
        subtitulo. El componente debe ser llamado desde App,
      </p>
      <h1>{titulo}</h1>
      <h2>{subtitulo}</h2>
    </div>
  );
}
