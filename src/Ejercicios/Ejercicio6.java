package Ejercicios;

import java.util.Scanner;

/**
*
@author CFGS
*/
public class Ejercicio6 {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la longitud del radio del círculo: ");
        double numero =sc.nextDouble();
        double radio = Math.PI * Math.pow(numero, 2);
        System.out.println(radio);
        sc.close();
        
    } //Fin del main

} //Fin de la clase Ejercicio6
