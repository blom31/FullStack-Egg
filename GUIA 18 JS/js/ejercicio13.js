document.getElementById("formu").addEventListener("submit", crear);

function crear(){
    let nombre = document.getElementById("nombre").value;
    let edad = document.getElementById("edad").value;
    let sexo = document.querySelector('input[name="sexo"]:checked').value;
    let peso = document.getElementById("peso").value;
    let altura = document.getElementById("altura").value;

    let objeto = {
        "Nombre": nombre,
        "Edad" : parseInt(edad),
        "Sexo"  : sexo ,
        "Peso"   : parseFloat (peso), //en kg
        "Altura"    :parseFloat (altura),// en cm
    }
    console.log(objeto);
};


/**
 * ? crear el formulario para asignar los valores 
 */