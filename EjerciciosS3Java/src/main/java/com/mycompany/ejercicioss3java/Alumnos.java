/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioss3java;

/**
 *
 * @author victo
 */
public class Alumnos extends Persona{
    int grado;
    double nota1;
    double nota2;
    double nota3;
    double promedio;

    public Alumnos() {
    }

    public Alumnos(int grado, double nota1, double nota2, double nota3, double promedio, String nombre, String apellido) {
        super(nombre, apellido);
        this.grado = grado;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.promedio = promedio;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
        
    public void calculapromedio(){
    
        this.promedio=(this.nota1+this.nota2+this.nota3)/3;
    }
}
