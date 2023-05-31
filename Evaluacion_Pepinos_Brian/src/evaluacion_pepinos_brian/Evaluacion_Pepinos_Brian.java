
package evaluacion_pepinos_brian;

import java.util.Scanner;


public class Evaluacion_Pepinos_Brian {

    public static void main(String[] args) {
        int opc;
        String nombre;
        String nombre1;
        String direccion;
        int celular;
        int cedula;
        String materia;
        Scanner entrada = new Scanner(System.in);
        
        Gestor gest = new Gestor();
        do{
            System.out.println("BIENVENIDOS AL SISTEMA DE MATRICULAS DE LA ESPE"
                    + "\n1.-INGRESAR DATOS DE PROFESORES "
                    + "\n2.-INGRESAR DATOS DE ALUMNO"
                    + "\n3.-INGRESAR LAS MATERIAS"
                    + "\n4.-INGRESE DATOS DE MATRICULA"
                    + "\n5.-CUANTOS ESTUDIANTES MATRICULADOS POR CADA MATERIA"
                    + "\n6.-");
            opc= entrada.nextInt();
            
            switch(opc){
                case 1:
                    entrada.nextLine();
                    System.out.println("INGRESE LOS DATOS DEL PROFESOR");
                    
                        System.out.println("------DATOS PROFESOR ----------");
                        System.out.println("INGRESA EL NOMBRE ");
                        nombre = entrada.nextLine();
                        System.out.println("INGRESA LA DIRECCION ");
                        direccion = entrada.nextLine();
                        System.out.println("INGRESE EL CELULAR ");
                        celular = entrada.nextInt();
                        System.out.println("INGRESA LA CEDULA ");
                        cedula = entrada.nextInt();
                        gest.datosprof(nombre, direccion, celular, cedula);
                    
                    
                    break;
                case 2:
                    entrada.nextLine();
                    
                    System.out.println("INGRESE LOS DATOS DEL ALUMNO");
                    
                        System.out.println("------DATOS ALUMNO 11----------");
                        System.out.println("INGRESA EL NOMBRE ");
                        nombre = entrada.nextLine();
                        System.out.println("INGRESA LA DIRECCION ");
                        direccion = entrada.nextLine();
                        System.out.println("INGRESE EL CELULAR ");
                        celular = entrada.nextInt();
                        System.out.println("INGRESA LA CEDULA ");
                        cedula = entrada.nextInt();
                        gest.datosalum(nombre, direccion, celular, cedula);
                    
                    break;
                case 3:
                    entrada.nextLine();
                    System.out.println("INGRESE LAS MATERIAS QUE EXISTE PARA MATRICULAS");
                    for(int i=0; i<4;i++){
                        
                        System.out.print((i+1)+".- ");
                        materia = entrada.nextLine();
                        gest.datosmat(materia);    
                    }              
                    break;
                case 4:
                    entrada.nextLine();
                     System.out.println("------DATOS DE MATRICULA----------");
                        System.out.println("INGRESA EL NOMBRE DEL PROFESOR ");
                        nombre = entrada.nextLine();
                        System.out.println("INGRESA NOMBRE DEL ALUMNO ");
                        nombre1 = entrada.nextLine();
                        System.out.println("INGRESA LA MATERIA ");
                        materia = entrada.nextLine();
                        gest.datosmatricula(nombre, nombre1, materia);  
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
            }
            
        }while(opc!=6);
    }
}
    

