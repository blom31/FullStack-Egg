/*const PI = 3.1416;*/
let radio = parseInt(prompt("Ingrese el valor del radio de una circunferencia"));

/*let area = PI * radio*radio;*/
let area = Math.PI * radio**2;

/*area= Math.round(area);  para redondear,*/ 

alert("el valor del área es: "+ area.toFixed(2));/*toFixed para definir la cantidad de decimales*/

let peri = 2 * Math.PI * radio;

alert("El valor del perímetro es: " + peri.toFixed(2));
