package Ejercicios;

import javax.swing.JOptionPane;

/**
*
@author CFGS
*/
public class Ejercicio35 {

    public enum dias_semana{
        LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
    }
    
    public static void main(String[] args){

        
        String dia = JOptionPane.showInputDialog(null, "Introduce un dia laborable", "Dia semana", JOptionPane.QUESTION_MESSAGE);
        
        if (dia.equals(dias_semana.LUNES) || dia.equals(dias_semana.MARTES) || dia.equals(dias_semana.MIERCOLES) || dia.equals(dias_semana.JUEVES) || dia.equals(dias_semana.VIERNES)){
            JOptionPane.showMessageDialog(null, "El " + dia + " es laborable", "Laborable", JOptionPane.INFORMATION_MESSAGE);
        } else if (dia.equals(dias_semana.SABADO) || dia.equals(dias_semana.DOMINGO)){
         JOptionPane.showMessageDialog(null, "El " + dia + " no es laborable", "No laborable", JOptionPane.WARNING_MESSAGE);
        }  else {
             JOptionPane.showMessageDialog(null, "Valor erroneo", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
    } //Fin del main

} //Fin de la clase Ejercicio35
