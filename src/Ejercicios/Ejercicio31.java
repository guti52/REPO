package Ejercicios;

import javax.swing.*;
/**
*
@author CFGS
*/
public class Ejercicio31 {

    public static void main(String[] args){

        String frase1 = JOptionPane.showInputDialog(null, "Introduce la primera frase", "Primera frase", JOptionPane.INFORMATION_MESSAGE);
        
        String frase2 = JOptionPane.showInputDialog(null, "Introduce la segunda frase", "Segunda frase", JOptionPane.INFORMATION_MESSAGE);
    
        if (frase1.equals(frase2)){
            JOptionPane.showMessageDialog(null, "Las 2 frases son iguales", "Respuesta", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Las 2 frases son diferentes", "Respuesta", JOptionPane.WARNING_MESSAGE);
        }
    
    
    } //Fin del main

} //Fin de la clase Ejercicio31
