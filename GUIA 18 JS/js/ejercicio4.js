let caracter = prompt("Ingrese un carácter");

caracter = caracter.toUpperCase();/*se pasa a mayúsculas*/

if (typeof caracter === "string") {/*valido si es de tipo string el caracter*/
  if (caracter == "S" || caracter == "N") {/*valido que se cumpla la condición*/
    alert("Correcto");
  } else {
    alert("Incorrecto");
  }
} 
