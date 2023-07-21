
package sistema_pagos_pepinos;

import java.time.LocalDate;
import java.time.Period;

public class Limpieza extends Personal {
    private int estudio;

    public Limpieza(String nombre, int edad,  LocalDate fecha, String nacionalidad, double sueldo, int estudio) {
        super(nombre,edad, fecha, nacionalidad, sueldo);
        
        this.estudio = estudio;
    }

    public int getEstudio() {
        return estudio;
    }

    public void setEstudio(int estudio) {
        this.estudio = estudio;
    }
//ESTE METODO HARA QUE EL SEÑOR DE LIMPIEZA AL TENER 10 AÑOS  EN EL TRABAJO RECIBA COMO COMISION LA TERCERA PARTE DE SU SALARIO
    // Y SI ESTE TIENE MAS DE UNA CARGA FAMILIAR MAYOR A 1 RECIBIRA UNA BONIFICACION EXTRA DE $20 POR CADA CARGA
    @Override
    public void metododepago() {
       setSueldo(getSueldo()*1.5);//le doy un nuevo valor al saldo del tecnico en este caso sera 675
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
        if (getEstudio()==1){
            totalnivel=20;
            System.out.println("USTED SE ENCUENTRA CURSANDO ESTUDIOS ");
            System.out.println("HA RECIBIDO UNA BONIFICACION DE $ "+ totalnivel);
            
        }
        setSueldo(getSueldo()+total+totalnivel);
        System.out.println("SU SALARIO ACTUAL ES DE $ "+getSueldo());
    }
    
    
}
