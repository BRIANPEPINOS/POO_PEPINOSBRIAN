
package poo_u2_practica16_polimorfismo;


public class Circulo extends Figura{
    private int radio;
    public Circulo(int radio, String color) {
        super(color);
        this.radio=radio;
    }

    @Override
    public double calcSuperficie() {
      return Math.PI*Math.pow(radio,2 );
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
}
