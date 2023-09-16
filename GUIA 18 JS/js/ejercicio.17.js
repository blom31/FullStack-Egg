document.getElementById("formu").addEventListener("submit",rellenar);

function rellenar(e){

    e.preventDefault();

   let vector1 = []; //se declaran los vectores cero
   let vector2= [];

   for (let i = 0; i<8; i++){ 
    vector1.push(Math.floor(Math.random() * 10));
    vector2.push(Math.floor(Math.random() * 10));
   }

   document.getElementById("vector1").value= vector1.join(', ');
   document.getElementById("vector2").value= vector2.join(', ');
}

function eliminarUltimos() {
    if (vector1.length >= 2 && vector2.length >= 2) {
        vector1.splice(-2);
        vector2.splice(-2);
        document.getElementById("vector1").value = vector1.join(', ');
        document.getElementById("vector2").value = vector2.join(', ');
    } else {
        alert("Los vectores no tienen suficientes elementos para eliminar.");
    }
}