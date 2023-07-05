/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_u2_practica13_claseabstract;

/**
 *
 * @author brian
 */
public class Cuadrado extends Figura{
    double lado;
    
    public Cuadrado( double lado, double x, double y) {
        super(x,y);
        this.lado=lado;
    }

    @Override
    public double calcularArea() {
        double resultado= lado*lado;
        return resultado;
    }
    
    
    
    
}
