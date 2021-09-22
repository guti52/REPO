package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author CFGS
 */
public class Ejercicio15 {

    public static void main(String[] args) {

        double total = 0;
        int ventas = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el precio de cada venta: ");
        String precioVentas = sc.nextLine();
        if (precioVentas.equals("*")) {
            System.out.println("No hay precio de ventas");
        }
        while (!precioVentas.equals("*")) {
            double importe = Double.parseDouble(precioVentas);
            total += importe;
            System.out.print("Introduce el precio de cada venta: ");
            precioVentas = sc.nextLine();
            ventas++;
        }
        System.out.println("El precio total de las ventas es de: " + total);
        System.out.println("El numero total de ventas es de: " + ventas);
    } //Fin del main

} //Fin de la clase Ejercicio15
