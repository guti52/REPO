package Ejercicios;

import javax.swing.JOptionPane;

/**
*
@author CFGS
*/
public class Ejercicio34 {

    public static void main(String[] args){

        String dia = JOptionPane.showInputDialog(null, "Introduce un dia de la semana", "Introduccion", JOptionPane.QUESTION_MESSAGE);
        Object[] dias_semana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        
        if (dia.equals(dias_semana[0]) || dia.equals(dias_semana[1]) || dia.equals(dias_semana[2]) || dia.equals(dias_semana[3]) || dia.equals(dias_semana[4])){
            JOptionPane.showMessageDialog(null, "El " + dia + " es labroable", "Laborable", JOptionPane.INFORMATION_MESSAGE);
        } else if (dia.equals(dias_semana[5]) || dia.equals(dias_semana[6])){
             JOptionPane.showMessageDialog(null, "El " + dia + " no es laborable", "No laborable", JOptionPane.WARNING_MESSAGE);
        } else {
             JOptionPane.showMessageDialog(null, "Valor erroneo", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    } //Fin del main

} //Fin de la clase Ejercicio34
