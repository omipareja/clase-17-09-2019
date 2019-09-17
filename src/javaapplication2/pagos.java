/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import javax.swing.JOptionPane;

/**
 *
 * @author utp
 */
public class pagos {
    
     public static void main(String[] args) {
        int horas;
        horas =Integer.parseInt( JOptionPane.showInputDialog("digite las horas "));
        if(horas<=40){
            
            JOptionPane.showMessageDialog(null, "su pago es :" +(horas*25000));
        } else{
            
            JOptionPane.showMessageDialog(null, "su pago es :" +((40*25000)+((horas-40)*35000)));
        }
        
        
    }
    
}
