/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_l1_p7_retornovalores;

import javax.swing.JOptionPane;

/**
 *
 * @author brian
 */
public class POO_L1_P7_RETORNOVALORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Operaciones opsum= new Operaciones();
        int a;
        int b;
        a = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NUMERO: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NUMERO: "));
        
        int sum =opsum.sumar(a,b);
        int res =opsum.restar(a,b);
        int mult =opsum.mult(a,b);
        float div =opsum.div(a,b);
        opsum.mostrarresultado(sum);
        opsum.mostrarresultado(res);
        opsum.mostrarresultado(mult);
        opsum.mostrarresultado(div);
    }
    
}
