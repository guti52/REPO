package Ejercicios;

import java.util.Scanner;

/**
*
@author CFGS
*/
public class Ejercicio23 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la frase");
        String x = sc.nextLine();
        String frase = x.replace('a', 'e');
        System.out.println(frase);
        
    } //Fin del main

} //Fin de la clase Ejercicio23
