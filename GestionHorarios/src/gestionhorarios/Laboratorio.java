
package gestionhorarios;

import java.util.List;


public class Laboratorio {
    protected String nombre;
    protected int capacidad;
    protected List<String> equipos;
    protected String responsable;

    public Laboratorio(String nombre, int capacidad, List<String> equipos, String responsable) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.equipos = equipos;
        this.responsable=responsable;
    }
    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public List<String> getEquipos() {
        return equipos;
    }
    public String getResponsable() {
        return responsable;
    }
    
    

}
