
package poo_u2_practica16_polimorfismo;


public class Triangulo extends Figura {
    private double base,altura;
    public Triangulo(double base, double altura,String color) {
        super(color);
        this.base=base;
        this.altura=altura;
    }

    @Override
    public double calcSuperficie() {
      return (base*altura)/2;
    }
    
    
}
