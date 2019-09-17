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
public class letra {
    public static void main(String[] args) {
        char letra;
        letra = JOptionPane.showInputDialog("digite una letra ").charAt(0);
        if(Character.isUpperCase(letra)){
            
            JOptionPane.showMessageDialog(null, "La letra " + letra + " es Mayuscula");
        } else {
            
             JOptionPane.showMessageDialog(null, "La letra :" + letra + " es Minuscula");
        }
        
        
    }
}
