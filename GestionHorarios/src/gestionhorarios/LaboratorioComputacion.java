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
public class LaboratorioComputacion extends Laboratorio {
    private String lugar;
    
    public LaboratorioComputacion(String nombre, int capacidad, List<String> equipos,String responsable, String lugar) {
        super(nombre, capacidad, equipos,responsable);
        this.lugar = lugar;
    }

    public String getLugar() {
        return lugar;
    }
    
}
