//OPERADORES LOGICOS
package poo_operadores_logicos;

public class POO_OPERADORES_LOGICOS {

    public static void main(String[] args) {
        int num1=1;
        int num2=1;
        System.out.println("&&: "+((num1==num2)&&(num1!=num2)));
        System.out.println("||: "+((num1==num2)||(num1!=num2)));
        System.out.println("not: "+(!(num1==num2)));
        int numero=0;
        while(numero<10||numero>60){
        numero = (int)(Math.random()*100);  
        }
        System.out.println(numero);
     
        }
        
    }
    

