/* se valida que el campo tenga un valor*/
function validar(e) {
  e.preventDefault(); /*previene que el boton envie los datos al servidorde forma automática*/

  let frase = document.getElementById("frase").value;

  if (frase === "") {
    alert("El campo no puede estar vacio");
  }
}

/* funcion flecha*/
//* se declara antes de usar la función*/
const reverse = () => {
    const frase = document.getElementById("frase").value;
    let devuelta = document.getElementById("devuelta"); /*me traigo el campo donde se mostrará la frase invertida*/
    let array= frase.split(""); //crea un arreglo para almacenar la palabra*/
    let invertida = array.reverse(); //se invierte el array
    return devuelta.value = (invertida.join("")); //asigno el valor de invertida en el campo del formu y se usa la funcion join()
}
document.getElementById("formu").addEventListener("submit", validar);
document.getElementById("ejecutar").addEventListener("click",reverse);