
package laboratorio_empleado;

import java.time.LocalDate;

//CREACION DE LA CLASE PADRE EMPLEADO ABSTRACTA PARA QUE LAS OTRAS CLASES HEREDEN SUS ATRIBUTOS
//Y METODOS OBLIGATORIAMENTE
public abstract class Empleado {
    //DECLARACIÓN DE ATRIBUTOS
    private String nombre;
    private int edad;
    private LocalDate fechaingreso;
    double salario;
    final double bono=450.0;
    //DECLARACIÓN DEL METODO ABSTRACTO INCENTIVAR MISMO SERA HEREDADO POR TODAS
    //LAS CLASES HIJAS
    public abstract void incentivar();
  
//CONSTRUCTOR DE LA CLASE EMPLEADO
    public Empleado(String nombre, int edad, LocalDate fechaingreso, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaingreso = fechaingreso;
        this.salario = salario;
        
    }
//CREACIÓN DE LOS METODOS GETTERS Y SETTERS (ENCAPSULAMIENTO)
    public LocalDate getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(LocalDate fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
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
}
