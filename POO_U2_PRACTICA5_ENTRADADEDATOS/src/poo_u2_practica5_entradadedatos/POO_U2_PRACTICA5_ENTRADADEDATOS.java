

package poo_u2_practica5_entradadedatos;

import java.io.*;
public class POO_U2_PRACTICA5_ENTRADADEDATOS {

    public static void main(String[] args) {
        try(BufferedReader br= new BufferedReader(new FileReader ("C:\\POO\\POO.docx"));
            BufferedWriter bw= new BufferedWriter(new FileWriter ("C:\\POO\\POO.docx"));){
            bw.write("esto es una prueba usasndo buffered");
            bw.newLine();
            bw.write("seguimos usando bufferes");
            bw.newLine();
            bw.write("hola a todos");
            bw.flush();
            String linea=br.readLine();
            
            while(linea!= null){
                System.out.println(linea);
                linea=br.readLine();
            }
        }catch(IOException e){
            System.out.println("error "+e);
        }
    }
    
}
