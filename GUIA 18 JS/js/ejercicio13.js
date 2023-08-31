document.getElementById("formu").addEventListener("submit", crear);

function crear(e){

    e.preventDefault();

    let nombre = document.getElementById("nombre").value;
    let edad = document.getElementById("edad").value;
    let sexo = document.querySelector('input[name="sexo"]:checked').value;
    let peso = document.getElementById("peso").value;
    let altura = document.getElementById("altura").value;
    

    objeto = {
        "Nombre": nombre,
        "Edad" : parseInt(edad),
        "Sexo"  : sexo ,
        "Peso"   : parseFloat (peso), //en kg
        "Altura"    :parseFloat (altura),// en cm
    }

    let objetoJSON = JSON.stringify(objeto);
    document.getElementById("objeto").value = objetoJSON;
    //console.log(objeto);
}


// const mostrar = (objeto) =>{


/**
 * ? crear el formulario para asignar los valores 
 * 
 * const miElemento = document.getElementById("miId"); // Obtén una referencia al elemento
const contenidoHTML = miElemento.innerHTML; // Recupera el contenido HTML
console.log(contenidoHTML);
 */
