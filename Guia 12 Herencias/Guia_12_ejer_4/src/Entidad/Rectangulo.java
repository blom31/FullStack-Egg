/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import Interfaz.CalculosFormas;

/**
 *
 * @author blom3
 */
public class Rectangulo implements CalculosFormas {
    
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    @Override
    public void calcularArea() {
         
        Double area =  base * altura;
        System.out.println("El área del Rectágulo es: " + area);
    }

    @Override
    public void calcularPerimetro() {
        
        double perimetro = (base + altura) * 2;
        System.out.println("El área del Rectángulo es: "+ perimetro);
    }
    
     
}
