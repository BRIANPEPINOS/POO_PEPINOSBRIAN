
package prueba1_u2_pepinosbrian;


public class Pentagono extends Figura {

     @Override
     public double area(){
        double area=((lado*5)*apotema)/2;
        return area;
    }
     @Override
    public double perimetro(){
        double perimetro =lado*5;
        return perimetro;
    }
    
    
}
