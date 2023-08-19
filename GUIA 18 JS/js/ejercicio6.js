/*identifico la sección a trabajr*/
const formulario = document.getElementById("formulario");

/*con el boton calcular se llama a la función validar nro ingresado*/
document.getElementById("calcular").addEventListener("click", validar);
document.getElementById("calcular").addEventListener("click",validarParImpar);
/*valido el campo numero ingresado por el usuario*/

function validar(e) {
  e.preventDefault(); /*evito cualquier evento por defecto*/

  let nro = document.getElementById("nro").value;
  
  /*let validar = /^[0-9]+$/; investigar */
  
  if (isNaN(parseInt(nro)) || parseInt(nro) < 0) {
   /* valido que el campo sea numérico*/
    alert("El valor ingresado no es un valor numérico");
  } else {
    if (nro === "") {
      alert("Ingrese un número");
    }
  }
}

/*validar si el nro ingresado es par o impar*/

function validarParImpar() {
  let nro = document.getElementById("nro").value;
  let parimpar = document.getElementById("parimpar");
  let resto = nro % 2;

 
    if (nro == 0) {
      parimpar.value=("El número 0 no puede ser par ni impar.");
    
    }else{
      if (resto == 0) {
        parimpar.value = "El número es par";
      } else {
        parimpar.value = "El número es impar";
      }
    }
   
  
}
