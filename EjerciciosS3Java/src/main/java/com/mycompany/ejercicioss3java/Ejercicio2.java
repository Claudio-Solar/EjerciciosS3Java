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
public class Ejercicio2 {
    public static void main(String[] args) { 
        
    //String tituloTeclado;
    //String autorTeclado;
    Scanner scTeclado= new Scanner(System.in);
    Cancion objetocancion= new Cancion();
    System.out.println("Ingrese el Titulo de la Cancion: ");
    
    //tituloTeclado=scTeclado.next();
    //objetocancion.ponTitulo(tituloTeclado);
        
   
    objetocancion.ponTitulo(scTeclado.next());
    
        System.out.println("Ingrese el Autor de la cancion: ");
        //autorTeclado=scTeclado.next();
        //objetocancion.ponAutor(autorTeclado);
        
        objetocancion.ponAutor(scTeclado.next());
        
        System.out.println("=====================================");
        
        System.out.println("Informacion del Titulo de la cancion: "+objetocancion.dameTitulo());
        System.out.println("Informacion del Autor de la cancion: "+objetocancion.dameAutor());
    
    }
}
