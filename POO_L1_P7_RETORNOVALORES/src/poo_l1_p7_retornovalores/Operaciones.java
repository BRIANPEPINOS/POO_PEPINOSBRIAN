/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_l1_p7_retornovalores;

/**
 *
 * @author brian
 */
public class Operaciones {
    public int sumar(int num1, int num2){
        int suma=num1+num2;
        return suma;
    }
    public int restar(int num1, int num2){
        int resta=num1-num2;
        return resta;
    }
    public int mult(int num1, int num2){
        int mult=num1*num2;
        return mult;
    }
    public float div(float num1, float num2){
        float divi=num1/num2;
        return divi;
    }
    public void mostrarresultado(int a){
        System.out.println("la suma es: "+a);
    }
    public void mostrarresultado(float a){
        System.out.println(a);
    }
    
}
