
package prueba1_u2_pepinosbrian;

public class Cuadrado extends Figura {

    
   @Override
   public double area(){
        double area=lado*lado;
        return area;
    }
   @Override
    public double perimetro(){
        double perimetro =lado*4;
        return perimetro;
    }
  
}
