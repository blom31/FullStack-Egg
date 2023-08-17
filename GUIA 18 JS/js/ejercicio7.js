const limite = parseFloat(prompt("Ingrese un limite"));

if (isNaN(limite) || limite <= 0) {
  alert("Ingrese valor valido");
} else {
  let suma = 0;
  let valor = parseInt(prompt("Ingrese un numero"));
  if (isNaN(valor)) {
    alert("Ingrese un numero");
  } else {
    while (suma < limite) {
      valor = parseFloat(prompt("Ingrese otro numero " + suma));

      suma += valor;
    }
    if (suma === limite) {
      alert("Se llego al limite");
    }
  }
}
