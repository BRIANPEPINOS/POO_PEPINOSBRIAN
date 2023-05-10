
package poo_condicional;


public class POO_CONDICIONAL {

    public static void main(String[] args) {
        int hora=-5;
        if(hora>=0 && hora<=12){
            System.out.println("buenos dias");
        }else if(hora>12 && hora<=10){
            System.out.println("buenas tardes");
        }else {
            System.out.println("buenas noches");
        }
        
    }
    
}
