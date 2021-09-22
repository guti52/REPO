/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios.ActividadPrintf;

import java.util.Random;

/**
 *
 * @author CFGS
 */
public class Alumno {
    
    
    //Variables
    private int id;
    private String nombre;
    private String apellido;
    private double nota;

    //Constructor
    public Alumno(int id, String nombre, String apellido, double nota) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota = nota;
    }

    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    //Getters
    public int getId(){
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    public double getNota() {
        return nota;
    }

    public static double sacarNotaAleatoria() {
        double notaGenerada;
        notaGenerada = Math.random()*10;
        return notaGenerada;
    }
    
}
