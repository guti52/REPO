package Ejercicios;

import java.util.Scanner;

/**
*
@author CFGS
*/
public class Ejercicio24 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer operando");
        int operando1 = sc.nextInt();
        System.out.println("Introduce el segundo operando");
        int operando2 = sc.nextInt();
        System.out.println("Introduce un signo aritmetico");
        String signo = sc.next();
        
        if(signo.equals("+")){
            System.out.println("El resultado es: " + (operando1 + operando2));
        } else if (signo.equals("-")){
            System.out.println("El resultado es: " + (operando1 - operando2));
        } else if (signo.equals("*")){
            System.out.println("El resultado es: " + (operando1 * operando2));
        } else if (signo.equals("/")){
            System.out.println("El resultado es: " + (operando1 / operando2));
        } else if (signo.equals("^")){
            System.out.println("El resultado es: " + (operando1 ^ operando2));
        } else if (signo.equals("%")){
            System.out.println("El resultado es: " + (operando1 % operando2));
        }
        
        
        
    } //Fin del main

} //Fin de la clase Ejercicio24
