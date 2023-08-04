/*/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. 
A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
 */
package Service;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author blom3
 */
public class Sv_circu {
    
    
    
    public void crearCircu(){
        Circunferencia circu = new Circunferencia();
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el radio para calcular el área y su perímetro");
        circu.setRadio(leer.nextDouble());        
    }
            
    
}
