
package poo_u2_practica_7_herencia;

public class Motocicleta extends Vehiculo{
    boolean patada;
    @Override
    public void encendido(){
        encendido=true;
        estado=" encendido";
        
    }
    @Override
    public void apagado(){
        encendido= false;
        estado=" apagado";
    }
}
