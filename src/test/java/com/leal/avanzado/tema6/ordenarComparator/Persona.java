/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leal.avanzado.tema6.ordenarComparator;

 
/**
 *
 * @author Santiago
 */
public class Persona implements Comparable<Persona> {
    private int id;
    private String nombre;
    private int edad;

    public Persona(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int compareTo(Persona p) {
        //return this.edad-p.getEdad(); //ordena por edad
        //return p.getEdad()-this.edad; //ordena por edad descendente
        return this.nombre.compareTo(p.getNombre());//compara Strings
    }
    
    
}
