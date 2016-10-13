/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leal.avanzado.tema6.oredenarCollec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Santiago
 */
public class Main {
    
    public static void main(String[]args){
        
        List<Integer> lista = new ArrayList();
        lista.add(25);
        lista.add(10000);
        lista.add(1);
        
        Collections.sort(lista);//ordena ascendente
        //System.out.println(lista);
        
        Collections.reverse(lista);//ordena descendente
        //System.out.println(lista);
        
        
        //Ordenar respecto a algo
        
        List<Persona> lisPer = new ArrayList();
        lisPer.add(new Persona(1,"juan", 10));
        lisPer.add(new Persona(6,"juan", 8));
        lisPer.add(new Persona(3,"juan", 20));
        
        
        
        
        
    }
    
}
