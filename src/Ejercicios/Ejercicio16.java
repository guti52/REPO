package Ejercicios;

import java.util.Scanner;

/**
*
@author CFGS
*/
public class Ejercicio16 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String contrasenia = "admin";
        final int INTENTOS = 3;
        boolean acierto = false;
        
        String password;
        
        for (int i = 0; i < INTENTOS && !acierto; i++){
            System.out.println("Introduce la contraseña");
            password = sc.next();
            
            if(password.equals(contrasenia)){
                System.out.println("Has acertado");
                acierto = true;
            }
        }
            if (acierto == false){
                System.out.println("Has agotado los 3 intentos. No has acertado");
            }
        
        
    } //Fin del main

} //Fin de la clase Ejercicio16
