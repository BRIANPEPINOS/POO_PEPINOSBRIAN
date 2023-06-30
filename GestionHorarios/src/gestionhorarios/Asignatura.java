
package gestionhorarios;

import java.util.ArrayList;
import java.util.List;


public class Asignatura {
    private String nombre;
    private String horario;
    private Laboratorio laboratorio;
    List<Asignatura> asignaturas = new ArrayList<>();
    public Asignatura(String nombre, String horario, Laboratorio laboratorio) {
        this.nombre = nombre;
        this.horario = horario;
        this.laboratorio = laboratorio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getHorario() {
        return horario;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public List<Asignatura> getAsignaturas(String nombre,String horario) {
        return asignaturas;
    }
    
}
