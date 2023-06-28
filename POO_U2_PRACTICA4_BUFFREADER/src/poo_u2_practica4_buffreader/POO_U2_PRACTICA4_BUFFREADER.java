
package poo_u2_practica4_buffreader;

/*import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
*/
import java.io.*;

public class POO_U2_PRACTICA4_BUFFREADER {

   
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        BufferedReader br= new BufferedReader(new FileReader ("C:\\POO1\\POO.txt"));
        String linea;
        try{
            while((linea=br.readLine())!=null){
                System.out.println(linea);
        }
        }catch(IOException e){
            
        }
    }
    
}
