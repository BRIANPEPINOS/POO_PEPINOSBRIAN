//CREACION DE LA CLASE GESTOR CREACION DE ARREGLOS Y METODOS PARA INGRESOS DE DATOS DE PROFESOR ALUMNO Y TOPOS LOS METODOS PARA MI MENU
package evaluacion_pepinos_brian;

import java.util.ArrayList;


public class Gestor {
    public ArrayList<Profesor> arrprof;
    public ArrayList<Alumno> arralum;
    public ArrayList<Materia> arrmat;
    public ArrayList<Matricula> arrmatricula;
    
    public Gestor() {
        arrprof = new ArrayList<>();
        arralum = new ArrayList<>();
        arrmat = new ArrayList<>();
        arrmatricula = new ArrayList<>();
    }
    
     public void datosmatricula(String profesor,String nombre, String materia){
        Matricula matri = new Matricula(profesor, nombre ,materia);
        arrmatricula.add(matri);
        
    }
     public void datosprof(String nombre,String direccion, int celular, int cedula){
        Profesor prof = new Profesor(nombre, direccion ,celular, cedula);
        arrprof.add(prof);
        
    }
     public void datosalum(String nombre,String direccion, int celular, int cedula){
        Alumno alum = new Alumno(nombre, direccion ,celular, cedula);
        arralum.add(alum);
        
    }
    public void datosmat(String materia){
        Materia mat = new Materia(materia);
        arrmat.add(mat);
        
    }
    
     public void cuantosmatriculados(){
        for(int i=0;i <this.arrmatricula.size();i++){
            Materia mat = this.arrmat.get(i);
            System.out.println(mat.materia);
           
        }
    }
}
