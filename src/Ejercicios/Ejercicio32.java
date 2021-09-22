package Ejercicios;

import javax.swing.*;
/**
*
@author CFGS
*/
public class Ejercicio32 {

    public static void main(String[] args){

        String cadena = JOptionPane.showInputDialog(null, "Introduce una frase", "Input", JOptionPane.QUESTION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, "La cuarta y quinta letras son: " + cadena.substring(3, 5), "Metodo Substring", JOptionPane.INFORMATION_MESSAGE);
    } //Fin del main

} //Fin de la clase Ejercicio32
