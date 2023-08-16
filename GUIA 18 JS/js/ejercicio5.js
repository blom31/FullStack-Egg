function suma(A, B) {
    let resultado = A + B;
    return resultado;
}
function resta(A, B) {
    let resultado = A - B;
    return resultado;
}
function division(A, B) {
    let resultado = A / B;
    return resultado;
}
function multiplicacion(A, B) {
    let resultado = A * B;
    return resultado;
}

var valor1 = parseInt(prompt("Ingrese el primer valor"));
var valor2 = parseInt(prompt("Ingrese el segundo valor"));
var operacion = prompt(
    "Indique la operacion que desea hacer: S(suma),R(resta),M(multiplicacion),D(division)"
).toUpperCase();

switch (operacion) {
    case "S":
        alert("El resultado es: " + suma(valor1, valor2));
        break;
    case "R":
        alert("El resultado es: " + resta(valor1, valor2));
        break;
    case "M":
        alert("El resultado es: " + multiplicacion(valor1, valor2));
        break;
    case "D":
        alert("El resultado es: " + division(valor1, valor2));
        break;
}