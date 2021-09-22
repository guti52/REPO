package Ejercicios;

import java.util.Scanner;

/**
*
@author CFGS
*/
public class Ejercicio7 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número de caracter ASCII: ");
        int num=sc.nextInt();
        char caracter=(char) num;
        System.out.println(caracter);
        sc.close();
    } //Fin del main

} //Fin de la clase Ejercicio7
