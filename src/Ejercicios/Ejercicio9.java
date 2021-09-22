package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author CFGS
 */
public class Ejercicio9 {

    public static void main(String[] args) {

        final int IVA = 21;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un precio: ");
        double precio = sc.nextDouble();
        double precioTotal = (precio * IVA / 100) + precio;
        System.out.println(precioTotal);
        sc.close();
    } //Fin del main

} //Fin de la clase Ejercicio9
