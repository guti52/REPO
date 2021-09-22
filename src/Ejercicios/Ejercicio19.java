package Ejercicios;

import java.util.Scanner;

/**
*
@author CFGS
*/
public class Ejercicio19 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int x = sc.nextInt();
        String numero = String.valueOf(x);
        if (x < 0){
            System.out.println("El numero introducido es negativo");
        } else {
            System.out.println("El numero " + x + " tiene " + numero.length() + " caracteres");
        }
        
        
    } //Fin del main

} //Fin de la clase Ejercicio19
