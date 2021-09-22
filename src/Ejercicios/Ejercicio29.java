package Ejercicios;

import javax.swing.*;

/**
 *
 * @author CFGS
 */
public class Ejercicio29 {

    public static void main(String[] args) {

        String frase = JOptionPane.showInputDialog("Introduce una frase");
        Object[] valors = {"MAYUSCULAS", "minusculas"};
        int opciones = JOptionPane.showOptionDialog(null, "¿A que quieres convertir?", "Eleccion",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, valors, valors[0]);
        if (opciones == 0){
            JOptionPane.showMessageDialog(null, frase.toUpperCase(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, frase.toLowerCase(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }

    } //Fin del main

} //Fin de la clase Ejercicio29
