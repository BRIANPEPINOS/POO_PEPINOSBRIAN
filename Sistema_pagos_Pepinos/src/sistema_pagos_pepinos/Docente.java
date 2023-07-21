
package sistema_pagos_pepinos;

import java.time.LocalDate;
import java.time.Period;


public class Docente extends Personal{
    private int nivel;//hace referencia al nivel de estudioque tiene el estudio

    public Docente(String nombre, int edad, LocalDate fecha, String nacionalidad, double sueldo, int nivel) {
        super(nombre, edad, fecha, nacionalidad, sueldo);
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    
    @Override
    //ESTE METODO HARA QUE EL DOCENTE AL TENER 10 AÑOS P MAS EN EL TRABAJO RECIBA COMO COMISION LA TERCERA PARTE DE SU SALARIO
    // Y SI ESTE TIENE UN NIVEL DE ESTUDIO DE CUARTO NIVEL RECIBIRA UNA BONIFICACION EXTRA DE 100
    public void metododepago() {
        double total=0;
        double totalnivel=0;
       setSueldo(getSueldo()*4);//le doy un nuevo valor al saldo del docente en este caso sera 1800
        LocalDate fechaactual= LocalDate.now();
         //CREACION DE UNA VARIABLE TIPO PERIOD PARA PODER COMPARAR ENTRE LA FECHA DE INGRESO AL TRABAJO Y LA FECHA ACTUAL
        Period diferencia=Period.between(getFecha(),fechaactual);
         //CREACION DE VARIABLES PARA QUE ME DEVUELVA LA DIFERENCIA DE DIAS, MESES Y AÑOS
        int meses = diferencia.getMonths();
        int años= diferencia.getYears();
        int totalmeses=(años*12)+meses;
        System.out.println("SU PERMANENCIA EN EL TRABAJO ES DE "+totalmeses+" MESES");
        if(totalmeses>120){
            System.out.println("SU SALARIO ACTUAL ES DE :"+getSueldo());
            total= getSueldo()/3;
            System.out.println("POR HABER SUPERADO LOS 10 AÑOS EN NUESTRA EMPRESA"
                    + "HA RECIBIDO UNA BONIFICACION DE $ "+total);
        }
        if (getNivel()>=4){
            totalnivel=100;
            System.out.println("SU NIVEL DE ESTUDIO ES DE CUARTO NIVEL ");
            System.out.println("POR TENER UN 4 GRADO DE ESTUDIO "
                    + "HA RECIBIDO UNA BONIFICACION DE $ "+ totalnivel);
            
        }
        setSueldo(getSueldo()+total+totalnivel);
        System.out.println("SU SALARIO ACTUAL ES DE $ "+getSueldo());
           
            
    }
    
    
    
    
}
