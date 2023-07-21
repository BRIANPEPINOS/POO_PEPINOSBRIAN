
package sistema_pagos_pepinos;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author brian
 */
public class Administrativo extends Personal {
    private int carga;

    public Administrativo(String nombre, int edad,  LocalDate fecha, String nacionalidad, double sueldo, int carga) {
        super(nombre, edad, fecha, nacionalidad, sueldo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
//ESTE METODO HARA QUE EL ADMINISTRATIVO AL TENER 10 AÑOS  MAS EN EL TRABAJO RECIBA COMO COMISION LA TERCERA PARTE DE SU SALARIO
    // Y SI ESTE TIENE MAS DE UNA CARGA FAMILIAR MAYOR A 1 RECIBIRA UNA BONIFICACION EXTRA DE $20 POR CADA CARGA
    @Override
    public void metododepago() {
        setSueldo(getSueldo()*2);//le doy un nuevo valor al saldo del tecnico en este caso sera 900
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
        if (getCarga()>1){
            totalnivel=getCarga()*20;
            System.out.println("USTED CONSTA VARIAS CARGAS FAMILIARES ");
            System.out.println("POR TENER "+getCarga()+" CARGAS FAMILIARES "
                    + "HA RECIBIDO UNA BONIFICACION DE $ "+ totalnivel);
            
        }
        setSueldo(getSueldo()+total+totalnivel);
        System.out.println("SU SALARIO ACTUAL ES DE $ "+getSueldo());
    }
    }



