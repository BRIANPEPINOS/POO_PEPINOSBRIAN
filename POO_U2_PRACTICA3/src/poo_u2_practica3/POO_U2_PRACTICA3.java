
package poo_u2_practica3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class POO_U2_PRACTICA3 {

   
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       try{
           String nombre= br.readLine();
           int div=8/0;
           System.out.println(div);
       }catch(IOException e){
           e.printStackTrace();
       }catch(java.lang.ArithmeticException e){
           System.out.println("NO PUEDE DIVIDIR EN 0");
       }
    }
    
}
