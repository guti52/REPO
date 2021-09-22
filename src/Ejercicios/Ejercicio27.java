package Ejercicios;

import java.util.Scanner;

/**
*
@author CFGS
*/
public class Ejercicio27 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String x = sc.nextLine();
        String frase = x.replace(" ", "");
        System.out.println(frase);
        
    } //Fin del main

} //Fin de la clase Ejercicio27
