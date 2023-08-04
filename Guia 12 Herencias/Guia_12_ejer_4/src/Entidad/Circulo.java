/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import Interfaz.CalculosFormas;
import static java.lang.Math.PI;


public class Circulo implements CalculosFormas {
    
    private Double radio;

    public Circulo() {
    }

    public Circulo(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    @Override
    public void calcularArea() {
        
        Double area = PI * Math.pow(radio,2); 
        
        System.out.println("El área del Circulo es: "+ area);
    }

    @Override
    public void calcularPerimetro() {
                
        double perimetro = PI * radio*2;
        System.out.println("El perímetro del circulo es: "+ perimetro);
    }
    
    
    
}
