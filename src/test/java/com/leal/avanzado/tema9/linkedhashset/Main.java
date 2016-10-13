/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leal.avanzado.tema9.linkedhashset;
 
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Santiago
 */
public class Main {
    
    public static void main(String[]args){
     
        //No agrega elementos duplicados
        Set<String> lista = new LinkedHashSet();
        lista.add("leal");
        lista.add("barragan");
         lista.add("leal");
        lista.add("a");
        
        for(String l : lista){
            System.out.println(l);
        }
     
        //de tipo personab
        
        Set<Persona> listaP = new TreeSet();
        listaP.add(new Persona("Jose",20));
        listaP.add(new Persona("Luis",25));
        listaP.add(new Persona("Antonio",28));
        listaP.add(new Persona("Juan",22));
        listaP.add(new Persona("Luis",25));
        
        //necesita la interface Comparable par ordenar, equals, hashcode
       //Ordena y muestra solo valores que no se repiten
        for(Persona l : listaP){
            System.out.println("Edad:" + l.getEdad() + "\tNombre: " + l.getNombre());
        }
    }
}
