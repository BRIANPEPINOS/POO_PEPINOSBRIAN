
package sistema_pagos_pepinos;

//realizao una calsse abstract de la cual heredaran los atributos y metodos las clases hijas

import java.time.LocalDate;

public abstract class Personal {
    private String nombre;
    private int edad;
    private LocalDate fecha;
    private String nacionalidad;
    private double sueldo=450;//establezco un sueldo basico en 450 e ira variando de acuerdo al cargo
    //creacion del metodo abastracto mismo sera heredado por todas las clases que hereden de la clase de personal
    public abstract void metododepago();

    public Personal(String nombre, int edad, LocalDate fecha, String nacionalidad, double sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.fecha = fecha;
        this.nacionalidad = nacionalidad;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

  

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
}
