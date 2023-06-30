/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionhorarios;

import java.util.List;

/**
 *
 * @author brian
 */
public class LaboratorioFisica extends Laboratorio{
    private String espacio;
    public LaboratorioFisica(String nombre, int capacidad, List<String> equipos,String responsable, String espacio) {
        super(nombre, capacidad, equipos,responsable);
        this.espacio = espacio;
    }
     public String getEspacio() {
        return espacio;
    }
}
