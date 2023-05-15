/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_l1_p7_metodos;

import javax.swing.JOptionPane;




public class Operaciones {
    int num1;
    int num2;
    int sum, rest, multi, div;

public void ingresonumeros(){
    num1 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NUMERO: "));
    num2 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NUMERO: "));
}

public void sumar(){
    sum=num1+num2;
}
public void mostrarresultado(){
    System.out.println("LA SUMA ES: "+ sum);
}
    
}
