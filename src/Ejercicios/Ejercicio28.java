package Ejercicios;

import javax.swing.JOptionPane;

/**
*
@author CFGS
*/
public class Ejercicio28 {

    public static void main(String[] args){

        String clave = "";
            String frase_inicial = JOptionPane.showInternalInputDialog(null, "introduce la frase", "Intro", JOptionPane.INFORMATION_MESSAGE);
        String frase_final;
        
        while(!frase_inicial.equals(clave)){
            frase_final = JOptionPane.showInputDialog(null, "Introduce la frase", "intro", JOptionPane.INFORMATION_MESSAGE);
            System.out.println(frase_final);
            
            if(frase_final.equals(clave)){
                JOptionPane.showMessageDialog(null, frase_final);
                break;
            }
        }
    } //Fin del main

} //Fin de la clase Ejercicio28
