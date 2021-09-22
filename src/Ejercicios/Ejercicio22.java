package Ejercicios;

import java.util.Scanner;

/**
*
@author CFGS
*/
public class Ejercicio22 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String frase = sc.nextLine();
        int contador = 0;
        int x;
        for (x = 0; x<frase.length(); x++)
            if (frase.charAt(x)=='a' || frase.charAt(x)=='e' || frase.charAt(x)=='i' || frase.charAt(x)=='o' || frase.charAt(x)=='u'){
                contador++;
            }
        System.out.println("La frase " + frase + " tiene " + contador + " vocales");
    } //Fin del main

} //Fin de la clase Ejercicio22
