/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOModelo;

/**
 *
 * @author Santiago
 */
public class Persona {
    private int id;
    private String nombre;
    private String pass;

    public Persona(int id, String nombre, String pass) {
        this.id = id;
        this.nombre = nombre;
        this.pass = pass;
       
    }

    public Persona() {
    }

    public Persona(String nombre, String pass) {
        this.nombre = nombre;
        this.pass = pass;
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

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
}
