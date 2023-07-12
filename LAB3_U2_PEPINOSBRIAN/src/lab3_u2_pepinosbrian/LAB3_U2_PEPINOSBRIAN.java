
package lab3_u2_pepinosbrian;


import java.util.Scanner;


public class LAB3_U2_PEPINOSBRIAN {

   
    public static void main(String[] args) {
        // TODO code application logic here
        //DECLARACIÓN DE LOS ATRIBUTOS A UTILIZAR
        int op1,op2;
        String nombre,seccion;
        double precio;
        int unidadesPedidas = 5;
        double totalPedidoestandar = 0.0;
        double totalPedidofertado = 0.0;
        double totalPedido = 0.0;
        //CREACION DE UN OBJETO TIPO SCANNER LLAMADO ENTRADA
        Scanner entrada = new Scanner(System.in);
        //INICIO DEL MENU
        do{
            System.out.println("---------BIENVENIDO AL SISTEMA DE PRODUCTOS-----------");
            System.out.println("ELIJA UNA OPCIÓN"
                + "\n1. Productos"
                + "\n2. Salir");
            op1=entrada.nextInt();
            //CREACION DE CICLO SWITVH PARA ELEJIR UNA OPCION
            switch(op1){
                case 1:
                    //ESCOJA LOS TIPOS DE PRODUCTOS
                    do{
                    System.out.println("----------------TIPOS DE PRODUCTOS-------------");
                    System.out.println("1. Ofertados"
                            + "\n2. Estandar"
                            + "\n3. Menu Principal"
                            + "\nDIGITE UNA OPCION");
                    op2=entrada.nextInt();
                    switch(op2){
                        case 1:
                            System.out.print("PRODUCTOS OFERTADOS QUE VA A INGRESAR: ");
                            int numProductosOfertados = entrada.nextInt();
                            entrada.nextLine();
                            //INSTANCIAMOS UN ARREGLO DEL TIPO OFERTA PARA ALMACENAR LOS PRODUCTOS OFERTADOS DE ACUERDO AL NUMERO DE PRODUCTOS QUE VAMOS A INGRESAR
                            Oferta[] productosOfertados = new Oferta[numProductosOfertados];

                            for (int i = 0; i < numProductosOfertados; i++) {
                                System.out.println("Ingrese los datos del Producto Ofertado " + (i + 1) + ":");
                                System.out.print("Nombre: ");
                                nombre = entrada.nextLine();
                                System.out.print("Precio: ");
                                precio = entrada.nextDouble();
                                entrada.nextLine();
                                System.out.print("Días restantes para la oferta: ");
                                int dias = entrada.nextInt();
                                entrada.nextLine();
                                //GUARDAMOS LOS DATOS DE LOS PRODUCTOS DE OFERTA
                                productosOfertados[i] = new Oferta(nombre, precio, dias);
                                
                            }
                            //ATRAVEZ DEL BUCLE FOR EACH CALACULAMOS LOS PRECIOS
                            for (Oferta productoOfertado : productosOfertados) {
                                totalPedidofertado += productoOfertado.obtenerPrecioPedido(unidadesPedidas);
                            }
                            System.out.println("Total del pedido: " + totalPedidofertado);
                            break;
                            
                        case 2:
                            System.out.print("PRODUCTOS ESTANDAR QUE VA A INGRESAR: ");
                            int numProductosEstandar = entrada.nextInt();
                            entrada.nextLine();
                            //INSTANCIAMOS UN ARREGLO DEL TIPO ESTANDAR PARA ALMACENAR LOS PRODUCTOS OFERTADOS DE ACUERDO AL NUMERO DE PRODUCTOS QUE VAMOS A INGRESAR
                            Estandar[] productosEstandar = new Estandar[numProductosEstandar];

                            for (int i = 0; i < numProductosEstandar; i++) {
                                System.out.println("Ingrese los datos del Producto Estándar " + (i + 1) + ":");
                                System.out.print("Nombre: ");
                                nombre = entrada.nextLine();
                                System.out.print("Precio: ");
                                precio = entrada.nextDouble();
                                entrada.nextLine();
                                System.out.print("Sección: ");
                                seccion = entrada.nextLine();
                                //GUARDAMOS LOS DATOS DE LOS PRODUCTOS DE ESTANDAR
                                productosEstandar[i] = new Estandar(nombre, precio, seccion);
                                 
                            }
                            //ATRAVEZ DEL BUCLE FOR EACH CALACULAMOS LOS PRECIOS
                            for (Estandar productoEstandar : productosEstandar) {
                                        totalPedidoestandar += productoEstandar.obtenerPrecioPedido(unidadesPedidas);
                                }
                            System.out.println("Total del pedido: " + totalPedidoestandar);
                            break;
                            
                            
                        default:
                            System.out.println("SALIENDO AL MENU PRINCIPAL");
                            break;
                    }
                    }while(op2!=3);
                    break;
                default:
                    System.out.println("SALIENDO");
                    break;
                    
            }
        }while(op1!=2);
        
               
       totalPedido=totalPedidoestandar+totalPedidofertado;
        System.out.println("Total del pedido: " + totalPedido);

        entrada.close();
    }
}
