
package laboratorio_empleado;
//IMPORTAMOS LAS LIBRERIAS LOCALDATE PARA PODER MANEJAR LAS FECHAS
import java.time.LocalDate;
//IMPORTAMOS LA LIBRERIA TIME.PERIOD PARA PODER SACAR LA DIFERENCIA DE DIAS, MESE, AÑOS ENTRE DOS FECHAS
import java.time.Period;

//CLASE OPERARIO HEREDA DE CLASE EMPLEADO
public class Operario extends Empleado {
    private int nivel;
//CONSTRUCTOR DE LA CLASE OPERARIO HEREDANDO LOS ATRIBUTOS DE EMPLEADO
    public Operario(String nombre, int edad, LocalDate fechaingreso, double salario,int nivel) {
        super(nombre, edad, fechaingreso, salario);
        this.nivel = nivel;
    }
//CREACION DEL METODO GET Y SET DEL ATRIBUTO NIVEL
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
//SOBREESCRITURA DEL METODO ABSTRCATO DE LA CLASE PADRE EMPLEADO
// ESTE METODO ES PARA REALIZAR LOS DIFERENTES INCENTIVOS QUE TENDRA EL EMPLEADO OPERARIO
    @Override
    public void incentivar() {
      
        if(getEdad()>30&&this.getNivel()>2){
            System.out.println("SE HA HECHO ACREEDOR A UN DOBLE BONO POR SUPERAR LOS 30 AÑOS DE EDAD"
                    + "Y TENER UN NIVEL SUPERIOR A 2");
            setSalario(getSalario()+(2*bono));
            System.out.println("SU SALARIO ACTUAL ES DE :"+getSalario());
             }else {
            if(getEdad()>30||this.getNivel()>2){
                if(getEdad()>30){
                    System.out.println("SE HA HECHO ACREEDOR A UN BONO POR SUPERAR LOS 30 AÑOS DE EDAD");
                    setSalario(getSalario()+bono);
                    System.out.println("SU SALARIO ACTUAL ES DE :"+getSalario());
                    
                }else{
                    System.out.println("SE HA HECHO ACREEDOR A UN BONO POR SUPERAR EL NIVEL 2");
                    setSalario(getSalario()+bono);
                    System.out.println("SU SALARIO ACTUAL ES DE :"+getSalario());
                }
            }else{
                System.out.println("NO HA RECIBIDO NIGUNA BONIFICACIÓN A SU SALARIO");
            }
        }
        
    }
    // CREACION DEL METODO ACTUALIZAR NIVEL
    public void actualizarnivel(){
        //CREACION DE UNA VARIABLE TIPO LOCALDATE PARA OBTENER LA FECHA ACTUAL
        LocalDate fechaactual= LocalDate.now();
        //CREACION DE UNA VARIABLE TIPO PERIOD PARA PODER COMPARAR ENTRE LA FECHA DE INGRESO AL TRABAJO Y LA FECHA ACTUAL
        Period diferencia= Period.between(getFechaingreso(), fechaactual);
        //CREACION DE VARIABLES PARA QUE ME DEVUELVA LA DIFERENCIA DE DIAS, MESES Y AÑOS
        int años = diferencia.getYears();
        int meses=diferencia.getMonths();
        int dias=diferencia.getDays();
        int totaldias=(((años*12)*365)+dias);
        System.out.println(totaldias);
        System.out.println("USTED LLEVA EN SU ACTUAL TRABAJO "+años+" años"+meses+" meses"+dias+" dias");
        if(totaldias>730){
            if(getNivel()<5){
                setNivel(getNivel()+1);
                System.out.println("USTED LLEVA MAS DE DOS AÑOS EN LA EMPRESA A SIDO PROMOVIDO AL NIVEL "+getNivel());
            }else{
                System.out.println("SU NIVEL YA ES EL 5");
            }
        }     
    } 
}
