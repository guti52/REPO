package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author CFGS
 */
public class Ejercicio13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero de ventas: ");
        int numeroVentas = sc.nextInt();
        int contador = 0;
        while (numeroVentas > contador) {
            Scanner sc1 = new Scanner(System.in);
            System.out.print("Introduce el precio de cada venta: ");
            double precioVentas = sc.nextDouble();
            contador++;
        }
        sc.close();
    } //Fin del main

} //Fin de la clase Ejercicio13
