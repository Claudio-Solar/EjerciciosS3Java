/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioss3java;

import java.util.Scanner;

/**
 *
 * @author victo
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        String nombreTeclado, apellidoTeclado;
        int gradoTeclado;
        double nota1Teclado, nota2Teclado, nota3Teclado;
                
        Scanner scTeclado= new Scanner(System.in); 
        
        
        
        System.out.println("Ingrese el Nombre del Alumno: ");
        nombreTeclado=scTeclado.next();
        
        System.out.println("Ingrese el Apellido del Alumno: ");
        apellidoTeclado=scTeclado.next();
        
        System.out.println("Ingrese el Grado del Alumno: ");
        gradoTeclado=scTeclado.nextInt();
        
        System.out.println("Ingrese la nota 1 del Alumno: ");
        nota1Teclado=scTeclado.nextDouble();
        
        System.out.println("Ingrese la nota 2 del Alumno: ");
        nota2Teclado=scTeclado.nextDouble();
        
        System.out.println("Ingrese la nota 3 del Alumno: ");
        nota3Teclado=scTeclado.nextDouble();
        
        Alumnos objeto= new Alumnos(gradoTeclado,
                                    nota1Teclado, 
                                    nota2Teclado, 
                                    nota3Teclado, 
                                    0.0, 
                                    nombreTeclado, 
                                    apellidoTeclado);
       objeto.calculapromedio();
        System.out.println("El promedio de las notas es: "+objeto.getPromedio());
        
        
        
    }
}
