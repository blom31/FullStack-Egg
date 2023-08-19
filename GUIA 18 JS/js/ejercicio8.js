
function ejecutarPrograma() {
  let maximo = 0;
  let minimo = 0;
  let suma = 0;
  let cantidadNumeros = 0;

  function leerNumero() {
    return parseInt(
      prompt("Ingrese un número entero (ingrese 0 para terminar):")
    );
  }

  while (true) {
    const numero = leerNumero();

    if (numero === 0) {
      break;
    }

    maximo = Math.max(maximo, numero);
    minimo = Math.min(minimo, numero);

    suma += numero;
    cantidadNumeros++;
  }

  const promedio = suma / cantidadNumeros;

  const resultados = document.getElementById("resultados");
  maximo =document.getElementById("max");
  minimo =document.getElementById("min");
  promedio =document.getElementById("prom");
  
    max.value = maximo;
}
/*
        // Inicializamos variables para almacenar el máximo, el mínimo y la suma de números.
let maximo = 0;
let minimo = 0;
let suma = 0;
let cantidadNumeros = 0;

// Función para leer un número del usuario
function leerNumero() {
    return parseInt(prompt("Ingrese un número entero (ingrese 0 para terminar):"));
}

// Leer números hasta que se ingrese 0
while (true) {
    const numero = leerNumero();
    
    if (numero === 0) {
        break; // Terminar el bucle si se ingresa 0
    }
    
    // Actualizar máximo y mínimo
    maximo = Math.max(maximo, numero);
    minimo = Math.min(minimo, numero);
    
    // Sumar número a la suma total y aumentar contador
    suma += numero;
    cantidadNumeros++;
}

// Calcular el promedio
const promedio = suma / cantidadNumeros;

// Mostrar resultados
console.log("Máximo número ingresado:", maximo);
console.log("Mínimo número ingresado:", minimo);
console.log("Promedio de números ingresados:", promedio);
*/
