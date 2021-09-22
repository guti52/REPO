package Ejercicios;

import javax.swing.*;

/**
*
@author CFGS
*/
public class Ejercicio30 {

    public static void main(String[] args){

        String frase = JOptionPane.showInputDialog(null, "Por favor, introduce una frase", "Introduccion", JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, "La longitud de la cadena es de: " + frase.length(), "Respuesta", JOptionPane.PLAIN_MESSAGE);
    } //Fin del main

} //Fin de la clase Ejercicio30
