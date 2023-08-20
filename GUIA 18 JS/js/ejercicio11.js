/**
 * * fx para validar que el campo que recibe los dtos no estén vacios
 */
function validar(e) {
  e.preventDefault(); /*previene que el boton envie los datos al servidorde forma automática*/

  let frase = document.getElementById("frase").value;

  if (frase.trim() === "") { /*trim elimina los espacios vacios al comienzo y el final*/
    alert("El campo no puede estar vacio");
  }
}

/**
 * * fx para hallar la palabra mas larga
 */
const flecha = () => {
  let frase = document.getElementById("frase").value; /*traigo la frase desde el formulario*/
  let devuelta = document.getElementById("devuelta"); //traigo el capo a asignar
  let masLarga = ""; /*inicioalizo una var para guardar las palabras*/
  let palabras = frase.split(" "); /*creo una variable tipo array para separar la frase */
  
  for (let i = 0; i < palabras.length; i++) { //recorre cada palabra del array
    if (palabras[i].length > masLarga.length) {// evalua el tamaño de la palabra
      masLarga = palabras[i];// reemplaza el valo por la cadena mas larga
    }
  }
    return (devuelta.value = masLarga);
  
};
document.getElementById("formu").addEventListener("submit", validar);
document.getElementById("ejecutar").addEventListener("click", flecha);
