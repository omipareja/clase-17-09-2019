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
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n1,n2;
        n1=Integer.parseInt( JOptionPane.showInputDialog(null,"ingrese un numero")) ;
        n2=Integer.parseInt( JOptionPane.showInputDialog(null,"ingrese un numero")) ;
        
        
        if(n1%n2==0){
            
            JOptionPane.showMessageDialog(null,"El numero : " + n1 + " esmultiplo de :" + n2  );
        }
        else {
            
            JOptionPane.showMessageDialog(null,"no son multiplos"  );
        }
    }
    
    
}
