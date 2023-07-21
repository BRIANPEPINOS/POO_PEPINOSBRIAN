
package sistema_pagos_pepinos;
//IMPORTACION DE LIBRERIAS 
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


public class Sistema_pagos_Pepinos {

   
    public static void main(String[] args) {
        // TODO code application logic here
  Scanner entrada= new Scanner(System.in);
        String nombre,nacionalidad;
        double sueldo=450;
        String fechaingresost=null;
        int edad,nivel,especialidad,carga,estudio,error;
        double salario;
        LocalDate fechaingreso=null;
        int op1;
        //INGRESO AL MENU CON UN DO WHILE PARA QUE EL USUARIO PUEDA INTERACTUAR LS VECES QUE DESEE HASTA
        //QUECOLOQUE  LA OPCIÓN SALIR
        do{
            System.out.println("-----------BIENVENIDOS AL SISTEMA DE GESTION DE EMPLEADOS--------------");
            System.out.println("--------------------------ELIJA UNA OPCION--------------------------------"
                + "\n1. DOCENTE"
                + "\n2. TECNICO"
                + "\n3. ADMINISTRATIVI"
                + "\n4. LIMPIEZA"
                    + "\n DIGITE UNA OPCION (1-2-3-4)");
            op1=entrada.nextInt();
            //INICIO DE SWITCH PARA ACCEDER A LAS OPCIONES DOCENTE, TECNICO, ADMINISTRATIVO, LIMPIEZA
            switch(op1){
                case 1:
                 //INGRESAR LOS DATOS DE DOCENTE
                    entrada.nextLine();
                    System.out.println("USUARIO DOCENTE ");
                    System.out.print("INGRESE SU NOMBRE: ");
                    nombre=entrada.nextLine();
                    System.out.print("INGRESE SU EDAD: ");
                    edad=entrada.nextInt();
                     entrada.nextLine();
                    System.out.print("INGRESE SU NACIONALIDAD: ");
                    nacionalidad=entrada.nextLine();
                   
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
                    System.out.print("INGRESE SU NIVEL DE ESTUDIO: ");
                    nivel=entrada.nextInt();
                    entrada.nextLine();
                                      //ALMACENAMOS LA INFORMACIÓN INGRESADA ENEL OBJETO TIPO DIRECTOR DIR
                    Docente doc= new Docente(nombre,edad,fechaingreso,nacionalidad,sueldo,nivel);
                    //LLAMAMOS AL METODO INCENTIVAR
                    doc.metododepago();
                    break;                  
                case 2:
                   //INGRESAR LOS DATOS DE DOCENTE
                    entrada.nextLine();
                    System.out.println("USUARIO TECNICO ");
                    System.out.print("INGRESE SU NOMBRE: ");
                    nombre=entrada.nextLine();
                    System.out.print("INGRESE SU EDAD: ");
                    edad=entrada.nextInt();
                     entrada.nextLine();
                    System.out.print("INGRESE SU NACIONALIDAD: ");
                    nacionalidad=entrada.nextLine();
                    
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
                    System.out.print("INGRESE CUANTAS ESPECIALIDADES TIENE: ");
                    especialidad=entrada.nextInt();
                    entrada.nextLine();
                                      //ALMACENAMOS LA INFORMACIÓN INGRESADA ENEL OBJETO TIPO DIRECTOR DIR
                    Tecnico tec= new Tecnico(nombre,edad,fechaingreso,nacionalidad,sueldo,especialidad);
                    //LLAMAMOS AL METODO INCENTIVAR
                    tec.metododepago();
                    
                    break;
                    
                case 3:
                   //INGRESAR LOS DATOS DE ADMINISTRATIVO
                    entrada.nextLine();
                    System.out.println("USUARIO ADMINISTRATIVO ");
                    System.out.print("INGRESE SU NOMBRE: ");
                    nombre=entrada.nextLine();
                    System.out.print("INGRESE SU EDAD: ");
                    edad=entrada.nextInt();
                     entrada.nextLine();
                    System.out.print("INGRESE SU NACIONALIDAD: ");
                    nacionalidad=entrada.nextLine();
                    
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
                    System.out.print("INGRESE CUANTAS CARGAS FAMILIARES TIENE TIENE: ");
                    carga=entrada.nextInt();
                    entrada.nextLine();
                                      //ALMACENAMOS LA INFORMACIÓN INGRESADA ENEL OBJETO TIPO DIRECTOR DIR
                    Administrativo adm= new Administrativo(nombre,edad,fechaingreso,nacionalidad,sueldo,carga);
                    //LLAMAMOS AL METODO INCENTIVAR
                    adm.metododepago();
                    
                    break;
                    
                case 4:
                   //INGRESAR LOS DATOS DE PERSONAL DE LIMPIEZA
                    entrada.nextLine();
                    System.out.println("USUARIO PERSONAL LIMPIEZA ");
                    System.out.print("INGRESE SU NOMBRE: ");
                    nombre=entrada.nextLine();
                    System.out.print("INGRESE SU EDAD: ");
                    edad=entrada.nextInt();
                     entrada.nextLine();
                    System.out.print("INGRESE SU NACIONALIDAD: ");
                    nacionalidad=entrada.nextLine();
                  
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
                    System.out.print("INGRESE 1 SI ESTA CURSANDO ESTUDIOS O CUALQUIER TECLA SI NO: ");
                    estudio=entrada.nextInt();
                    entrada.nextLine();
                    //ALMACENAMOS LA INFORMACIÓN INGRESADA EN EL OBJETO TIPO LIMPIEZA LIM
                    Limpieza lim= new Limpieza(nombre,edad,fechaingreso,nacionalidad,sueldo,estudio);
                    //LLAMAMOS AL METODO INCENTIVAR
                    lim.metododepago();
                    
                    break;
                default:
                    System.out.println("SALIENDO.....");
                    break;
            }
        }while(op1!=5);    
    }
}