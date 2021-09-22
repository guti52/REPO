package Ejercicios;

import javax.swing.JOptionPane;

/**
*
@author CFGS
*/
public class Ejercicio33 {

    public static void main(String[] args){

        String frase = JOptionPane.showInputDialog(null, "Introduce una frase", "Frase", JOptionPane.QUESTION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, frase.split(frase), "Respuesta", JOptionPane.INFORMATION_MESSAGE);
    } //Fin del main

} //Fin de la clase Ejercicio33
