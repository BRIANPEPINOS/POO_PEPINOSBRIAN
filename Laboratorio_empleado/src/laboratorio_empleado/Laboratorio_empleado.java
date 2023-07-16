
package laboratorio_empleado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Laboratorio_empleado {
   public static LocalDate ingresofecha(LocalDate fechaingreso){
       Scanner entrada= new Scanner(System.in); 
       int error=0;
        do{
            try{
                System.out.print("INGRESE LA FECHA QUE INGRESO A TRABAJAR en el formato(YYYY-MM-DD): ");
                String fechaingresost=entrada.nextLine();
                fechaingreso=LocalDate.parse(fechaingresost, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                error=0;
            }catch(DateTimeParseException e){
                System.out.println("LA FECHA INGRESADA NO ESTA EN EL FORMATO (YYYY-MM-DD)");
                error=1;
            }
        }while(error!=1);
        return fechaingreso;
   }
   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
        String nombre,departamento;
        String fechaingresost=null;
        int edad,nivel,numpersonal,error;
        
        double salario;
        LocalDate fechaingreso=null;
        int op1;
        //INGRESO AL MENU CON UN DO WHILE PARA QUE EL USUARIO PUEDA INTERACTUAR LS VECES QUE DESEE HASTA
        //QUECOLOQUE  LA OPCIÓN SALIR
        do{
            System.out.println("-----------BIENVENIDOS AL SISTEMA DE GESTION DE EMPLEADOS--------------");
            System.out.println("--------------------------ELIJA UNA OPCION--------------------------------"
                + "\n1. Director"
                + "\n2. Operario"
                + "\n3. Salir"
                + "\n Digite 1,2,3");
            op1=entrada.nextInt();
            //INICIO DE SWITCH PARA ACCEDER A LAS OPCIONES DIRECTOR, OPERARIO
            switch(op1){
                case 1:
                 //INGRESAR LOS DATOS DE EMPLEDO DIRECTOR
                    entrada.nextLine();
                    System.out.println("USUARIO DIRECTOR ");
                    System.out.print("INGRESE SU NOMBRE: ");
                    nombre=entrada.nextLine();
                    System.out.print("INGRESE SU EDAD: ");
                    edad=entrada.nextInt();
                    entrada.nextLine();
                    error=0;
                    //REALIZAMOS UN DO WHILE PARA QUE CUANDO EL USUARIO INGRESE LA FECHA EN UN FORMATO DIFERENTE AL ESTABLECIDO LE VUELVA A PEDIR 
                    //HASTA QUE LO DIGITE BIEN Y PARA QUE NO NOS GENERE UN ERROR UTILIZAMO UN TRY CATCH
                    do{
                        try{
                            System.out.print("INGRESE LA FECHA QUE INGRESO A TRABAJAR en el formato(YYYY-MM-DD): ");
                            //AQUI INGRESAMOS LA FECHA EN EL FORMATO INDICADO
                            fechaingresost=entrada.nextLine();
                            //EL LOCALDATE.PARSE ALMACENA UNA CADENA DE TEXTO EN ESTE CASO LA FECHA DE INGRESO DEL EMPLEADO Y EL 
                            //DATATIMEFORMATTER.OFPATTERN LE DA UN FORMADO LOCALDATE DE TIPO YYYY-MM-DD
                            fechaingreso=LocalDate.parse(fechaingresost, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                            error=0;
                        }catch(DateTimeParseException e){
                            System.out.println("LA FECHA INGRESADA NO ESTA EN EL FORMATO (YYYY-MM-DD)");
                            error=1;
                        }
                                
                    }while(error==1);
                    //INGRESO DE DATOS
                    System.out.print("INGRESE SU SALARIO ANUAL: ");
                    salario=entrada.nextDouble();
                    entrada.nextLine();
                    System.out.print("INGRESE AL DEPARTAMENTO QUE PERTENECE: ");
                    departamento= entrada.nextLine();
                    System.out.print("INGRESE CUANTO PERSONAL MANEJA: ");
                    numpersonal= entrada.nextInt();
                    //ALMACENAMOS LA INFORMACIÓN INGRESADA ENEL OBJETO TIPO DIRECTOR DIR
                    Director dir= new Director(nombre,edad,fechaingreso,salario,departamento,numpersonal);
                    //LLAMAMOS AL METODO INCENTIVAR
                    dir.incentivar();                   
                    break;                  
                case 2:
                    //INGRESAR LOS DATOS DE EMPLEDO OPERARIO
                    entrada.nextLine();
                    System.out.println("---------------------USUARIO OPERARIO---------------------- ");
                    System.out.print("INGRESE SU NOMBRE: ");
                    nombre=entrada.nextLine();
                    System.out.print("INGRESE SU EDAD: ");
                    edad=entrada.nextInt();
                    entrada.nextLine();
                    error=0;
                    do{
                     //REALIZAMOS UN DO WHILE PARA QUE CUANDO EL USUARIO INGRESE LA FECHA EN UN FORMATO DIFERENTE AL ESTABLECIDO LE VUELVA A PEDIR 
                    //HASTA QUE LO DIGITE BIEN Y PARA QUE NO NOS GENERE UN ERROR UTILIZAMO UN TRY CATCH
                        try{
                            System.out.print("INGRESE LA FECHA QUE INGRESO A TRABAJAR en el formato(YYYY-MM-DD): ");
                            //AQUI INGRESAMOS LA FECHA EN EL FORMATO INDICADO
                            fechaingresost=entrada.nextLine();
                            //EL LOCALDATE.PARSE ALMACENA UNA CADENA DE TEXTO EN ESTE CASO LA FECHA DE INGRESO DEL EMPLEADO Y EL 
                            //DATATIMEFORMATTER.OFPATTERN LE DA UN FORMADO LOCALDATE DE TIPO YYYY-MM-DD
                            fechaingreso=LocalDate.parse(fechaingresost, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                            error=0;
                        }catch(DateTimeParseException e){
                            System.out.println("LA FECHA INGRESADA NO ESTA EN EL FORMATO (YYYY-MM-DD)");
                            error=1;
                        }                
                    }while(error==1);
                    //INGRESO DE DATOS
                    System.out.print("INGRESE SU SALARIO ANUAL: ");
                    salario=entrada.nextDouble();
                    entrada.nextLine();
                    System.out.print("INGRESE EL NIVEL EN QUE SE ENCUENTRA: ");
                    nivel= entrada.nextInt();
                    //ALMACENAMOS LA INFORMACIÓN INGRESADA EN EL OBJETO TIPO OPERARIO OPER
                    Operario oper= new Operario(nombre,edad,fechaingreso,salario,nivel);
                    //LLAMAMOS AL METODO ACTUALIZARNIVEL Y AL METODO INCENTIVAR
                    oper.actualizarnivel();
                    oper.incentivar();
                    
                    break;
                default:
                    System.out.println("SALIENDO.....");
                    break;
            }
        }while(op1!=3);    
    }
}
