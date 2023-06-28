
package poo_u2_practica6;
import java.io.*;
import java.util.*;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
public class POO_U2_PRACTICA6 {

   
    public static void main(String[] args) {
        List <Personsa> persona = new ArrayList<Personsa>();
        persona.add(new Personsa("JAVIER","0987854784","bjygrl"));
        persona.add(new Personsa("CARLOS","0987854785","bjygHJLKL"));
        persona.add(new Personsa("RICARDO","0987854786","bjygWWER"));
        persona.add(new Personsa("MATIAS","0987854787","bjYJKLHKL"));
        ExportarCSV(persona);
        ImportarCSV(); 
     
    }

     public static void ExportarCSV(List<Personsa> persona) {
        String salidaArchivo = "Persona1.csv"; // Nombre del archivo
        boolean existe = new File(salidaArchivo).exists(); // Verifica si existe
        
        // Si existe un archivo llamado asi lo borra
        if(existe) {
            File archivoPersona = new File(salidaArchivo);
            archivoPersona.delete();
        }
        
        try {
            // Crea el archivo
            CsvWriter salidaCSV = new CsvWriter(new FileWriter(salidaArchivo, true), ',');
            
            // Datos para identificar las columnas
            salidaCSV.write("Nombre");
            salidaCSV.write("Telefono");
            salidaCSV.write("Email");
            
            salidaCSV.endRecord(); // Deja de escribir en el archivo
            
            // Recorremos la lista y lo insertamos en el archivo
            for(Personsa user : persona) {
                salidaCSV.write(user.getNombre());
                salidaCSV.write(user.getTelfono());
                salidaCSV.write(user.getMail());
                
                salidaCSV.endRecord(); // Deja de escribir en el archivo
            }
            
            salidaCSV.close(); // Cierra el archivo
            
        } catch(IOException e) {
            e.printStackTrace();
        }    
    }
    
    public static void ImportarCSV() {
        try{
            List<Personsa> persona = new ArrayList<Personsa>(); // Lista donde guardaremos los datos del archivo
            
            CsvReader leerPersona = new CsvReader("Persona.csv");
            leerPersona.readHeaders();
            
            // Mientras haya lineas obtenemos los datos del archivo
            while(leerPersona.readRecord()) {
                String nombre = leerPersona.get(0);
                String telefono = leerPersona.get(1);
                String email = leerPersona.get(2);
                
                persona.add(new Personsa(nombre, telefono, email)); // Añade la informacion a la lista
            }
            
            leerPersona.close(); // Cierra el archivo
            
            // Recorremos la lista y la mostramos en la pantalla
            for(Personsa user : persona) {
                System.out.println(user.getNombre() + " , "
                    + user.getTelfono() + " , "
                    +user.getMail());
            }
            
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    
}
