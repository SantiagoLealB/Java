
package com.leal.avanzado.tema7.hashset;

/**
 *
 * @author Santiago
 */
public class Persona {
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

    
    //compara para que no haya valores repetidos
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (this.nombre != null ? this.nombre.hashCode() : 0);
        hash = 41 * hash + this.edad;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if ((this.nombre == null) ? (other.nombre != null) : !this.nombre.equals(other.nombre)) {
            return false;
        }
        return true;
    }
    
    
    
}


