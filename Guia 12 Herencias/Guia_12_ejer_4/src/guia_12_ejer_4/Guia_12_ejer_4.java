/*Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package guia_12_ejer_4;

import Entidad.Circulo;
import Entidad.Rectangulo;


public class Guia_12_ejer_4 {

    
    public static void main(String[] args) {
       
        Circulo circulo1 = new Circulo(5.0);
        Rectangulo rectangulo1 = new Rectangulo(2,4);
        
        
        circulo1.calcularArea();
        circulo1.calcularPerimetro();
        
        rectangulo1.calcularArea();
        rectangulo1.calcularPerimetro();
    }
    
}
