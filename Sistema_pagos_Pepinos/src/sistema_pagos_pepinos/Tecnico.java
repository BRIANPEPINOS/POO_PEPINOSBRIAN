
package sistema_pagos_pepinos;

import java.time.LocalDate;
import java.time.Period;

public class Tecnico extends Personal {
    private int especialidad;

    public Tecnico( String nombre, int edad, LocalDate fecha, String nacionalidad, double sueldo,int especialidad) {
        super(nombre, edad, fecha, nacionalidad, sueldo);
        this.especialidad = especialidad;
    }

  

    public int getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(int especialidad) {
        this.especialidad = especialidad;
    }
//ESTE METODO HARA QUE EL TECNICO AL TENER 10 AÑOS  MAS EN EL TRABAJO RECIBA COMO COMISION LA TERCERA PARTE DE SU SALARIO
    // Y SI ESTE TIENE MAS DE UNA ESPECIALIDADRECIBIRA UNA BONIFICACION EXTRA DE 80
    @Override
    public void metododepago() {
        setSueldo(getSueldo()*3);//le doy un nuevo valor al saldo del tecnico en este caso sera 1350
         double total=0;
        double totalnivel=0;
       
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
        if (getEspecialidad()>1){
            totalnivel=80;
            System.out.println("USTED CONSTA CON MAS DE UNA ESPECIALIDAD ");
            System.out.println("POR TENER VARIAS ESPECIALIDADES "
                    + "HA RECIBIDO UNA BONIFICACION DE $ "+ totalnivel);
            
        }
        setSueldo(getSueldo()+total+totalnivel);
        System.out.println("SU SALARIO ACTUAL ES DE $ "+getSueldo());
    }
    
}
