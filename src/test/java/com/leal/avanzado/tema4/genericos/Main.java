/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leal.avanzado.tema4.genericos;

/**
 *
 * @author Santiago
 */
public class Main {
    
    public static void main(String[]args){
        
        ClaseGenerica<String> cg = new ClaseGenerica<String>("Hola");
        cg.mostrarTipo();
        ClaseGenerica<Integer> cg2 = new ClaseGenerica<Integer>(21);
        cg2.mostrarTipo();
    }
}
