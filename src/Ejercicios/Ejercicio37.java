package Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

/**
*
@author CFGS
*/
public class Ejercicio37 {

    public static void main(String[] args){

        int clave = -1;
        int valor = 0;
        
        ArrayList<Integer> valores = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        
        while (valor != clave){
            if (valor != clave){
                System.out.println("Introduce un numero");
                valor = sc.nextInt();
                valores.add(valor);
            } else if (valor == clave){
                System.out.println(valores);
            }
        }
        
        
        
        
        
    } //Fin del main

} //Fin de la clase Ejercicio37
