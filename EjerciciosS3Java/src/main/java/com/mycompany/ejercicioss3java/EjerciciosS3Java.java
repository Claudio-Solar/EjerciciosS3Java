/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicioss3java;

/**
 *
 * @author victo
 */
public class EjerciciosS3Java {

    public static void main(String[] args) {
       // Ejercicio 1
       
        Alumno objetoalumno1=new Alumno();
        objetoalumno1.setNombre("Miguel");
        objetoalumno1.setApellido("Ramirez Perez");
        objetoalumno1.setEdad(31);

        System.out.println("INFORMACION DEL ALUMNO N1: "+"\n"+"Nombre: "+objetoalumno1.getNombre()+"\n"+"Apellido: "+objetoalumno1.getApellido()+"\n"+"Edad: "+objetoalumno1.getEdad());
        
        Alumno objetoalumno2=new Alumno();
        objetoalumno1.setNombre("Andres");
        objetoalumno1.setApellido("Sanches Vilela");
        objetoalumno1.setEdad(31);
        System.out.println("=====================================");
        System.out.println("INFORMACION DEL ALUMNO N2: "+"\n"+"Nombre: "+objetoalumno1.getNombre()+"\n"+"Apellido: "+objetoalumno1.getApellido()+"\n"+"Edad: "+objetoalumno1.getEdad());
        
       
        
    }
}
