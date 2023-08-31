
function comenzar() { /*esta función se llama desde el boton "comenzar" con el evento "onclick"*/
  let sum = 0;
  let num;
  let numeros = [];
  do {
    num = parseInt(prompt("ingrese un numero")); /* se piden los números por un pront para almacenar en el array numeros*/
    if (num !== 0) {
      numeros.push(num); /*se van guardando los números dentro del array*/
      sum += num;
    }
  } while (num !== 0);

  //console.log(numeros)

  if (numeros.length > 0) {
    let max = document.getElementById("max");
    let min = document.getElementById("min");
    let prom = document.getElementById("prom");

      max.value = Math.max(...numeros);
      min.value = Math.min(...numeros);
      prom.value = sum/numeros.length;

   
  } else {
    alert("No se ingresaron números.");
  }
}

function borrar() {
  document.getElementById("max").value = "";
  document.getElementById("min").value = "";
  document.getElementById("prom").value = "";
}


