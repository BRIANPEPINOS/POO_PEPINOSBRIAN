
package poo_u2_practica_7_herencia;


public class POO_U2_PRACTICA_7_HERENCIA {

  
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo vehi= new Vehiculo();
        Vehiculo vehi2= new Vehiculo();
        Automovil auto1 = new Automovil();
        Automovil auto2 = new Automovil();
        Motocicleta moto1= new Motocicleta();
        Motocicleta moto2= new Motocicleta();
       
        vehi.encendido();
        auto1.encendido();
        moto1.encendido();
        System.out.println("VEHICULO: "+vehi.estado+"\nAUTOMOVIL: "+auto1.estado+"\nMOTOCICLETA: "+moto1.estado);
        vehi2.apagado();
        auto2.apagado();
        moto2.apagado();
        System.out.println("VEHICULO: "+vehi2.estado+"\nAUTOMOVIL: "+auto2.estado+"\nMOTOCICLETA: "+moto2.estado);
        
    }
    
}
