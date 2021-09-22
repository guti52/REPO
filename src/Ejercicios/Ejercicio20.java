package Ejercicios;

import java.util.Scanner;

/**
*
@author CFGS
*/
public class Ejercicio20 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = sc.nextInt();
        
        if (numero % 5 == 0){
            System.out.println("No es un número primo");
        } else if ( numero % 2 != 0){
            System.out.println("Es un numero primo");
        }
        
    } //Fin del main

} //Fin de la clase Ejercicio20
