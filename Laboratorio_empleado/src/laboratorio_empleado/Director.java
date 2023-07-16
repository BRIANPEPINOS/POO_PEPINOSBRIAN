package laboratorio_empleado;
//IMPORTAMOS LAS LIBRERIAS LOCALDATE PARA PODER MANEJAR LAS FECHAS
import java.time.LocalDate;
//IMPORTAMOS LA LIBRERIA TIME.PERIOD PARA PODER SACAR LA DIFERENCIA DE DIAS, MESE, AÑOS ENTRE DOS FECHAS
import java.time.Period;
import java.util.Scanner;
//CLASE DIRECTO HEREDA DE LA CLASE EMPLEADO
public class Director extends Empleado {
    private String departamento;
    private int numpersonal;
//CONSTRUCTOR DE LA CLASE DIRECTOR QUE HEREDA LOS ATRIBUTOS DE LA CLASE EMPLEADO
    public Director( String nombre, int edad, LocalDate fechaingreso, double salario,String departamento, int numpersonal) {
        super(nombre, edad, fechaingreso, salario);
        this.departamento = departamento;
        this.numpersonal = numpersonal;
    }
//CREACIÓN DE LOS METODOS GETTERS Y SETTERS (ENCAPSULAMIENTO)
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getNumpersonal() {
        return numpersonal;
    }

    public void setNumpersonal(int numpersonal) {
        this.numpersonal = numpersonal;
    }
//SOBREESCRITURA DEL METODO ABSTRCATO DE LA CLASE PADRE EMPLEADO
// ESTE METODO ES PARA REALIZAR LOS DIFERENTES INCENTIVOS QUE TENDRA EL EMPLEADO DIRECTO
    @Override
    public void incentivar() {
        //CREACION DE UNA VARIABLE TIPO LOCALDATE PARA OBTENER LA FECHA ACTUAL
        LocalDate fechaactual= LocalDate.now();
         //CREACION DE UNA VARIABLE TIPO PERIOD PARA PODER COMPARAR ENTRE LA FECHA DE INGRESO AL TRABAJO Y LA FECHA ACTUAL
        Period diferencia=Period.between(getFechaingreso(),fechaactual);
         //CREACION DE VARIABLES PARA QUE ME DEVUELVA LA DIFERENCIA DE DIAS, MESES Y AÑOS
        int meses = diferencia.getMonths();
        int años= diferencia.getYears();
        int totalmeses=(años*12)+meses;
        System.out.println("SU PERMANENCIA EN EL TRABAJO ES DE "+totalmeses+" MESES");
        if(totalmeses>30&&this.getNumpersonal()>20){
            System.out.println("SU SALARIO ACTUAL ES DE :"+getSalario());
            setSalario(getSalario()+(2*bono));
            System.out.println("POR HABER SUPERADO LOS 30 MESES DE ESTANCIA EN EL TRABAJO"
                    + "Y MANEJAR MAS DE 20 PERSONAS EN SU CARGO"
                    + "SU NUEVO SALARIO ES DE "+getSalario());
        }else {
            if(totalmeses>30||this.getNumpersonal()>20){
                if(totalmeses>30){
                    
                    System.out.println("SU SALARIO ACTUAL ES DE :"+getSalario());
                    setSalario(getSalario()+bono);
                    System.out.println("POR HABER SUPERADO LOS 30 MESES DE ESTANCIA EN EL TRABAJO"
                    + "SU NUEVO SALARIO ES DE "+getSalario());
                }else{
                    
                    System.out.println("SU SALARIO ACTUAL ES DE :"+getSalario());
                    setSalario(getSalario()+bono);
                    System.out.println("POR TENER A SU CARGO MAS DE 20 PERSONAS HA RECIBIDO UN BONO A SU SALARIO"
                    + "SU NUEVO SALARIO ES DE "+getSalario());
                }
            }else{
                    System.out.println("NO HA RECIBIDO NIGUNA BONIFICACIÓN A SU SALARIO");
                }
            }
        }     
}
