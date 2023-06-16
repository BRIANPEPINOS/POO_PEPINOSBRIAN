
package prueba1_u2_pepinosbrian;

import java.util.Scanner;


public class Prueba1_U2_PEPINOSBRIAN {

    
    public static void main(String[] args) {
        Cuadrado cua = new Cuadrado();
        Rectangulo rect=new Rectangulo();
        Triangulo tri=new Triangulo();
        Pentagono pent=new Pentagono();
        int op,num;
        Scanner entrada= new Scanner(System.in);
        double lado,lado1, base,altura,apotema;

        do{
            System.out.println("""
                               BIENVENIDOS AL SISTEMA DE CALCULO DE AREAS Y PERIMETROS
                               ---------------ESCOJA UNA OPCION------------------
                               1.- CUADRADO 
                               2.- RECTANGULO
                               3.- TRIANGULO
                               4.- PENTAGONO
                               5.- SALIR""");
            op= entrada.nextInt();
            
            switch(op){
                case 1:
                    entrada.nextLine();
                    System.out.println("CUANTOS CUADRADOS QUIERE CALCULAR AREA Y PERIMETRO");
                    num= entrada.nextInt();
                    for(int i=0;i<num;i++){
                        System.out.println("--------CUADRADO"+(i+1)+"------------");
                        System.out.println("INGRESE EL LADO DEL CUADRADO "+(i+1));
                        lado= entrada.nextDouble();
                        cua.setLado(lado);
                        System.out.println("EL AREA  ES "+ cua.area());
                        System.out.println("EL PERIMETRO ES "+cua.perimetro());                     
                    }
                    break;
                case 2:
                    entrada.nextLine();
                    System.out.println("CUANTOS RECTANGULOS QUIERE CALCULAR AREA Y PERIMETRO");
                    num= entrada.nextInt();
                    for(int i=0;i<num;i++){
                        System.out.println("--------RECTANGULO"+(i+1)+"------------");
                        System.out.println("INGRESE LA BASE DEL RECTANGULO "+(i+1));
                        base= entrada.nextDouble();
                        rect.setBase(base);
                        System.out.println("INGRESE LA ALTURA DEL RECTANGULO "+(i+1));
                        altura= entrada.nextDouble();
                        rect.setAltura(altura);
                        System.out.println("EL AREA  ES "+ rect.area());
                        System.out.println("EL PERIMETRO ES "+ rect.perimetro());          
                    }                             
                    break;
                case 3:
                    System.out.println("CUANTOS TRIANGULOS QUIERE CALCULAR AREA Y PERIMETRO");
                    num= entrada.nextInt();
                    for(int i=0;i<num;i++){
                        System.out.println("--------TRIANGULO"+(i+1)+"------------");
                        System.out.println("INGRESE LA BASE DEL TRIANGULO "+(i+1));
                        base= entrada.nextDouble();
                        tri.setBase(base);
                        System.out.println("INGRESE LA ALTURA DEL TRIANGULO "+(i+1));
                        altura= entrada.nextDouble();
                        tri.setAltura(altura);
                        System.out.println("INGRESE EL LADO A DEL TRIANGULO "+(i+1));
                        lado= entrada.nextDouble();
                        tri.setLado(lado);
                        System.out.println("INGRESE EL LADO B DEL TRIANGULO "+(i+1));
                        lado1= entrada.nextDouble();
                        tri.setLado1(lado1);
                        System.out.println("EL AREA  ES "+ tri.area());
                        System.out.println("EL PERIMETRO ES "+ tri.perimetro());                        
                    }                              
                    break;
                
                case 4:
                    System.out.println("CUANTOS PENTAGONOS QUIERE CALCULAR AREA Y PERIMETRO");
                    num= entrada.nextInt();
                    for(int i=0;i<num;i++){
                        System.out.println("--------PENTAGONO"+(i+1)+"------------");
                        System.out.println("INGRESE EL LADO DEL PENTAGONO "+(i+1));
                        lado= entrada.nextDouble();
                        pent.setLado(lado);
                        System.out.println("INGRESE EL APOTEMA DEL RECTANGULO "+(i+1));
                        apotema= entrada.nextDouble();
                        pent.setApotema(apotema);
                        System.out.println("EL AREA  ES "+ pent.area());
                        System.out.println("EL PERIMETRO ES "+ pent.perimetro());          
                    }                             
                    break;
                case 5:
                    System.out.println("-----------------SALIENDO---------------------");
                    break;
            }
            
        }while(op!=5);
    }
}
