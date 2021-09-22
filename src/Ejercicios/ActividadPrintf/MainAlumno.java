package Ejercicios.ActividadPrintf;

/**
*
@author CFGS
*/
public class MainAlumno {

    public static void main(String[] args){

        Alumno alumno1 = new Alumno(1, "Frankz", "Bañon", Alumno.sacarNotaAleatoria());
        Alumno alumno2 = new Alumno(2, "Carlos", "Bermejo", Alumno.sacarNotaAleatoria());
        Alumno alumno3 = new Alumno(3, "Diego", "Caceres", Alumno.sacarNotaAleatoria());
        Alumno alumno4 = new Alumno(4, "Victor", "Caja", Alumno.sacarNotaAleatoria());
        Alumno alumno5 = new Alumno(5, "Constantin", "Carabut", Alumno.sacarNotaAleatoria());
        Alumno alumno6 = new Alumno(6, "Victor Manuel", "De Pablo", Alumno.sacarNotaAleatoria());
        Alumno alumno7 = new Alumno(7, "Jorge", "Gonzalez", Alumno.sacarNotaAleatoria());
        Alumno alumno8 = new Alumno(8, "Sergio", "Gutierrez", Alumno.sacarNotaAleatoria());
        Alumno alumno9 = new Alumno(9, "Miguel Angel", "Martin", Alumno.sacarNotaAleatoria());
        Alumno alumno10 = new Alumno(10, "Alejandro", "Plaza", Alumno.sacarNotaAleatoria());
        Alumno alumno11 = new Alumno(11, "Eizan", "Rosa", Alumno.sacarNotaAleatoria());
        Alumno alumno12 = new Alumno(12, "Pedro Enrique", "Vidal", Alumno.sacarNotaAleatoria());
        
        System.out.println("ID\t Apellidos\t Nombre\t          Nota");
        
        System.out.println("----------------------------------------------");
        
        while(alumno1.getId()<12){
        System.out.printf("%-2d\t %-9s\t %-13s\t %5.2f \n", alumno1.getId(), alumno1.getApellido(), alumno1.getNombre(), alumno1.getNota());
        System.out.printf("%-2d\t %-9s\t %-13s\t %5.2f \n", alumno2.getId(), alumno2.getApellido(), alumno2.getNombre(), alumno2.getNota());
        System.out.printf("%-2d\t %-9s\t %-13s\t %5.2f \n", alumno3.getId(), alumno3.getApellido(), alumno3.getNombre(), alumno3.getNota());
        System.out.printf("%-2d\t %-9s\t %-13s\t %5.2f \n", alumno4.getId(), alumno4.getApellido(), alumno4.getNombre(), alumno4.getNota());
        System.out.printf("%-2d\t %-9s\t %-13s\t %5.2f \n", alumno5.getId(), alumno5.getApellido(), alumno5.getNombre(), alumno5.getNota());
        System.out.printf("%-2d\t %-9s\t %-13s\t %5.2f \n", alumno6.getId(), alumno6.getApellido(), alumno6.getNombre(), alumno6.getNota());
        System.out.printf("%-2d\t %-9s\t %-13s\t %5.2f \n", alumno7.getId(), alumno7.getApellido(), alumno7.getNombre(), alumno7.getNota());
        System.out.printf("%-2d\t %-9s\t %-13s\t %5.2f \n", alumno8.getId(), alumno8.getApellido(), alumno8.getNombre(), alumno8.getNota());
        System.out.printf("%-2d\t %-9s\t %-13s\t %5.2f \n", alumno9.getId(), alumno9.getApellido(), alumno9.getNombre(), alumno9.getNota());
        System.out.printf("%-2d\t %-9s\t %-13s\t %5.2f \n", alumno10.getId(), alumno10.getApellido(), alumno10.getNombre(), alumno10.getNota());
        System.out.printf("%-2d\t %-9s\t %-13s\t %5.2f \n", alumno11.getId(), alumno11.getApellido(), alumno11.getNombre(), alumno11.getNota());
        System.out.printf("%-2d\t %-9s\t %-13s\t %5.2f \n", alumno12.getId(), alumno12.getApellido(), alumno12.getNombre(), alumno12.getNota());
            break;
        } 
        
    } //Fin del main

} //Fin de la clase MainAlumno
