
package prueba1_u2_pepinosbrian;


public class Triangulo extends Figura {

 
    
       @Override
     public double area(){
        double area=(base*altura)/2;
        return area;
    }
     @Override
    public double perimetro(){
        double perimetro =base+lado+lado1;
        return perimetro;
    }
    
    
}
