
package poo_u2_practica_7_herencia;


public class Vehiculo {
    String placa;
    int numruedas;
    boolean encendido;
    String estado;
    public void setNumeroRuedas (int ruedas){
        numruedas= ruedas;
    }
    
    public void encendido(){
        encendido=true;
        estado="encendido";
        
    }
    public void apagado(){
        encendido= false;
        estado="apagado";
    }
}

