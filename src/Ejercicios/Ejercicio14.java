package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author CFGS
 */
public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Intoruce el valor de A: ");
        double a = sc.nextDouble();

        System.out.println("Intoruce el valor de B: ");
        double b = sc.nextDouble();

        System.out.println("Intoruce el valor de C: ");
        double c = sc.nextDouble();

        double despejar = Math.pow(b, 2) - 4 * a * c;

        if (despejar > 0) {
            double x1 = (-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
            double x2 = (-b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);

            System.out.println("El valor de x1 es: " + x1 + " el valor de x2 es: " + x2);
        } else if (despejar == 0) {
            double x = ((b * (-1)) + Math.sqrt(despejar) / (2 * a));
            System.out.println("La solucion es: " + x);
        } else {
            System.out.println("El resultado ha dado negativo");
        }
        sc.close();
    } //Fin del main

} //Fin de la clase Ejercicio14
