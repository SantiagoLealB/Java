
package com.leal.avanzado.leal.tema12.queue; 

 
/**
 *
 * @author Santiago
 */
public class Persona implements Comparable<Persona>{
     private String nombre;
     private int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //ordena respecto a edad
    public int compareTo(Persona o) {
        return this.edad-o.getEdad();
    }

    
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }

    

    
    
}


