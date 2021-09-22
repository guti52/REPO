package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author CFGS
 */
public class Ejercicio17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un dias de la semana: ");
        String dia = sc.next().toLowerCase();

        switch (dia) {
            case "lunes":
                
            case "martes":
                
            case "miercoles":
                
            case "jueves":
                
            case "viernes":
                System.out.println("Es un dia laborable");
                break;
            case "sabado":
                
            case "domingo":
                System.out.println("No es un dia laborable");
                break;

            default:
                System.out.println("Valor no valido");
        }
        
    } //Fin del main

} //Fin de la clase Ejercicio17
