/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioss3java;

/**
 *
 * @author victo
 */
public class Cancion {
    
    private String titulo;
    private String autor;

    public Cancion() {
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String dameTitulo() {
        return titulo;
    }

    public void ponTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String dameAutor() {
        return autor;
    }

    public void ponAutor(String autor) {
        this.autor = autor;
    }
    
    
}
