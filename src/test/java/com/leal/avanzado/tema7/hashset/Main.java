/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leal.avanzado.tema7.hashset;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Santiago
 */
public class Main {
    
    public static void main(String[]args){
     
        //No agrega elementos duplicados
        Set<String> lista = new HashSet();
        lista.add("leal");
        lista.add("Lopez");
        lista.add("leal");
        lista.add("lopez");
        lista.add("otro");

        //No le importa el orden 
        for(String el : lista){
            System.out.println(el);
        }
        
        //Hashset de tipo Persona
        //Cuando se crea una nueva instancia, se crea un bloque de memoria, acepta repetidos
        //se debe sobreescribrir equeals u hashcode, NO ordena
        Set<Persona> lista2 = new HashSet();
        lista2.add(new Persona("Santiago", 25));
        lista2.add(new Persona("Otro nombre", 25));
        lista2.add(new Persona("Santiago", 25));
        
        for(Persona p : lista2){
            System.out.println("Edad: " + p.getEdad()+ "\tNombre: " + p.getNombre());
        }
        
    }
}
