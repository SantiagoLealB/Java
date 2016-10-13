/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leal.avanzado.tema6.ordenarComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Santiago
 */
public class Main {
    
    public static void main(String[]args){
        
        //Ordenar respecto a algo
        
        List<Persona> lisPer = new ArrayList();
        lisPer.add(new Persona(1,"Manuel", 10));
        lisPer.add(new Persona(6,"Jose", 8));
        lisPer.add(new Persona(3,"Antonio", 20));
        
        /*
        //ordenar respecto a nombre, si se quiere ordenar respecto a edad se tiene ue crear un comparator
        Collections.sort(lisPer, new NombreComparator());
        
        for(Persona p: lisPer){
            System.out.println(p.getNombre());
        }
        
        //tamnien se puede hacer de forma directa, comparar por edad
        Collections.sort(lisPer, new Comparator<Persona>(){
            public int compare(Persona p1, Persona p2) {
                
                int estado = 0;  // 0 son iguales. 1 el primero es mayor, -1 es menor
                if(p1.getEdad() > p2.getEdad())
                    estado =1;
                else if(p1.getEdad() < p2.getEdad())
                    estado =-1;
               else
                    estado = 0;
                
                return estado;
            }
        });
        
        System.out.println(lisPer);*/
        
        
        //Ordenar utilizando la Interface omparable, se debe impCOmparable
        
        Collections.sort(lisPer); //como Persona imp  Comparable , ordena
        for(Persona p: lisPer){
            System.out.println(p.getNombre());
        }
    
    }
    
}
