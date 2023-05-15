/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_l1_p7_metos_parametros_argumentos;

import javax.swing.JOptionPane;

/**
 *
 * @author brian
 */
public class POO_L1_P7_METOS_PARAMETROS_ARGUMENTOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operaciones opsum= new Operaciones();
        int a;
        int b;
        int c,d,e,f;
        a = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NUMERO: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NUMERO: "));
        opsum.sumar(a, b);
        opsum.restar(a, b);
        opsum.mult(a, b);
        opsum.div(a, b);
        opsum.resultado();
        
        
    }
    
}
