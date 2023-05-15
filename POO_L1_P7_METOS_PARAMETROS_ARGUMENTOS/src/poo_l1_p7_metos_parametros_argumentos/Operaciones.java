/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_l1_p7_metos_parametros_argumentos;

/**
 *
 * @author brian
 */
public class Operaciones {
    int suma, resta, mult, div;
    
    public void sumar(int a, int b){
        suma=a+b;
    }
    public void restar(int a, int b){
        resta=a-b;
    }
    public void mult(int a, int b){
        mult=a*b;
    }
    public void div(int a, int b){
        div=a/b;
    }
    public void resultado(){
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(mult);
        System.out.println(div);
    }
   
}
