
package poo_u2_practica13_claseabstract;


public class Circulo extends Figura{
    double radio;

    public Circulo(double radio, double x, double y) {
        super(x, y);
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        double resultado=Math.PI*(Math.pow(radio, 2));
       return resultado;
    }
    
}
