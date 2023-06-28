
package poo_u2_practica8_herencia2;


public class Deportista extends Persona{
    String deporte;
    
    public Deportista(String nom){
        super(nom);
    }
    public void Cambiarnombre(String nom){
        super.setNombre(nom);
    }
    
}
