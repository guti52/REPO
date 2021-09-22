package Ejercicios;

import java.util.Random;
import java.util.Scanner;

/**
*
@author CFGS
*/
public class Ejercicio18 {

    public static void main(String[] args){

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un primer numero");
        int numero1 = sc.nextInt();
        System.out.println("Introduce un segundo numero");
        int numero2 = sc.nextInt();
        int contador = 0;
        
        while (contador < 50){
            int x = random.nextInt((numero1 - numero2) +1);
            System.out.println(x);
            contador++;
        }
        
    } //Fin del main

} //Fin de la clase Ejercicio18
