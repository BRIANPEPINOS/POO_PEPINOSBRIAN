/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_u2_practica14_interfaceabstract;

/**
 *
 * @author brian
 */
public class Rectangulo implements Figura,Dibujar{
    double base;
    double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        double resultado= base*altura;
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("SE VA A DIBUJAR UN RECTANGULO");
        
    }
    
}
