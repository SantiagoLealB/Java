/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leal.avanzado.tema6.ordenarComparator;

import java.util.Comparator;

/**
 *
 * @author Santiago
 */
public class NombreComparator implements Comparator <Persona> {

    public int compare(Persona p1, Persona p2) {
        return p1.getNombre().compareTo(p2.getNombre());//compara para ordenar
    }
    
}
