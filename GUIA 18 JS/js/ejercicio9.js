document.getElementById("ingresar").addEventListener("submit", validar);
document.getElementById("ejecutar").addEventListener("click",separar);

/**
 * *validar que el campo frase no esté vacio y que contenga solo valores de tipo string*/
function validar(e) {
  e.preventDefault();  /*previene que el boton envie los datos al servidorde forma automática*/

  let frase = document.getElementById("frase").value;

  /** 
  * ? PROBAR IF TERNARIO frase === "" || !isNaN(frase) ? alert("Ingrese un valor"):alert ("Ingresa un valor válido");*/
  if (!isNaN(frase) || frase === "") {
    alert(
      "Ingrese un valor no numérico y no vacío \n Intente nuevamente");
  }
 /** 
  * ! se ejecuta la función aun arrojando error cuando se ingresa un número */ 
}

function separar() {
  let frase = document.getElementById("frase").value;
  let fraseNew = "";
  let separada = document.getElementById("separada");
/** 
  * * usamos un ciclo for para recorrer la frase con la funcion length y sumarle un espacio en cada recorrido*/
  for (let i = 0; i < frase.length; ++i) { 
    fraseNew += frase[i] + " ";
  }
  /** 
  * * usamos la función .trim() para elimar el espacio en blanco del último caracter*/
  separada.value = fraseNew.trim();
  console.log(fraseNew);
}
