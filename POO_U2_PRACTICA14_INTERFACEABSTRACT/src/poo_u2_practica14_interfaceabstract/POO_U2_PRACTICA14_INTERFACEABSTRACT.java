
package poo_u2_practica14_interfaceabstract;

import java.util.Scanner;


public class POO_U2_PRACTICA14_INTERFACEABSTRACT {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE LOS DATOS DEL CUADRADO");
        double lado=entrada.nextDouble();
        Cuadrado cua1= new Cuadrado(lado);
        System.out.println("INGRESE LOS DATOS DEL CIRCULO");
        double radio=entrada.nextDouble();
        Circulo cir1= new Circulo(radio);
        System.out.println("INGRESE LOS DATOS DEL RECTANGULO");
        double base=entrada.nextDouble();
        double altura=entrada.nextDouble();
        Rectangulo rec1= new Rectangulo(base,altura);
        System.out.println("DATOS CUADRADO");
        System.out.println("LADO: "+lado);
        System.out.println("EL AREA DEL CUADRADO ES : "+cua1.calcularArea());
        cua1.dibujar();
        System.out.println("DATOS CIRCULO");
        System.out.println("EL AREA DEL CIRCULO ES: "+cir1.calcularArea());
        cir1.dibujar();
        cir1.rotar();
        System.out.println("DATOS RECTANGULO");
        System.out.println("EL AREA DEL RECTANGULO ES: "+rec1.calcularArea());
        rec1.dibujar();
    }
    
}
