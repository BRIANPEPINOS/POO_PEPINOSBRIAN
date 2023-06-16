
package prueba1_u2_pepinosbrian;


public class Rectangulo extends Figura {

    
   
    
     @Override
     public double area(){
        double area=base*altura;
        return area;
    }
     @Override
    public double perimetro(){
        double perimetro =(base*2)+(altura*2);
        return perimetro;
    }
    
}
