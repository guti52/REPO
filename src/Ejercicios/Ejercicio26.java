package Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author CFGS
 */
public class Ejercicio26 {

    public static void main(String[] args) {

        int clave = -1;
        int valor = 0;

        ArrayList<Integer> valores = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (valor != clave){
            if (valor != clave){
                System.out.print("Introduce numeros");
                valor = sc.nextInt();
                valores.add(valor);
            } else if (valor == clave){
                System.out.println("El numero es -1");
            } else {
                System.out.println("Numero invalido");
            }
        }
        System.out.println(valores);
        
    } //Fin del main

} //Fin de la clase Ejercicio26
