const mayor = 18;
let edad = prompt("Ingresa tu edad");

if (isNaN(edad) || edad < 0) {
  prompt("El valor que ingresaste es " + typeof edad + ", ingresa tu edad ");
  /*console.log("El valor que ingresaste es " + typeof edad + ", ingresa tu edad ");*/
  edad = prompt("Ingresa tu edad");
}
if (edad >= mayor) {
    /*console.log("Es mayor de edad");*/
    alert("Es mayor de edad");
} else {
    /*console.log("No es mayor de edad");*/
    alert ("No eres mayor de edad") ;
}
