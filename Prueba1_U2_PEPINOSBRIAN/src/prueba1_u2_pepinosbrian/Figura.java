
package prueba1_u2_pepinosbrian;


public class Figura {
    double lado,lado1,base,altura,apotema;
    
    


    public double area(){
        double area=lado*lado;
        return area;  
    }
    public double perimetro(){
        double perimetro =lado*4;
        return perimetro;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
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

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }
    
}
