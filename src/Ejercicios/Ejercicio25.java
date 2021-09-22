package Ejercicios;

import java.util.Scanner;

/**
*
@author CFGS
*/
public class Ejercicio25 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int x = sc.nextInt();
        int numero1 = 1;
        int resultado = x + numero1;
        if(x > 1){
            System.out.println("El resultado es de: " + resultado);
        } else{
            System.out.println("El numero es menor de 1"); 
        }
        
        sc.close();
        
        
    } //Fin del main

} //Fin de la clase Ejercicio25
