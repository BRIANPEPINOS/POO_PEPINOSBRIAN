
package poo_u2_practica14_interfaceabstract;


public class Circulo implements Figura, Dibujar, Rotar {
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    

    @Override
    public double calcularArea() {
        double resultado= Math.PI*Math.pow(radio,2);
        return resultado;
    }

    @Override
    public void rotar() {
        System.out.println("VA A ROTAR HACIA LA IZQUIERDA");
    }

    @Override
    public void dibujar() {
        System.out.println("SE VA A DIBUJAR UN CIRCULO");
    }
    
    
}
