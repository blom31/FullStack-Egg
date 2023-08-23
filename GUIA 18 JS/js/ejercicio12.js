document.getElementById("formu").addEventListener("submit", validar);
/**
 * * fx para validar que el campo que recibe los dtos no estén vacios
 */
function validar(e) {
  e.preventDefault(); /*previene que el boton envie los datos al servidorde forma automática*/

  let argumento = document.getElementById("argumento").value;

  if (argumento.trim() === "") {
    /*trim elimina los espacios vacios al comienzo y el final*/
    alert("El campo no puede estar vacio");
  }else{
  const tipo = flecha(argumento);
}
}
/**
 * * fx para hallar el tipo de datos ingresaddos
 */
const argumento = document.getElementById("argumento").value; /*traigo el argumento desde el formulario*/

const flecha = (argumento) => {
  let tipoDAto = document.getElementById("tipoDAto"); //traigo el campo a asignar
  let num = parseFloat(argumento);
  
  if (!isNaN(num)) {
    return (tipoDAto.value = "number");
  } else if (argumento === "true" || argumento === "false") {
    return (tipoDAto.value = "boolean");
  } else {
    return (tipoDAto.value = "string");
  }
};

document.getElementById("ejecutar").addEventListener("click", flecha);
