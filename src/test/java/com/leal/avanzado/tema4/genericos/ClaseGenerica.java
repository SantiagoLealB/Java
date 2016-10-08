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
public class ClaseGenerica<T> {
    
    private T objeto; //un objeto Generico, mas adelante se indica de que tipo
    
    public ClaseGenerica(T objeto){
        this.objeto= objeto;
    }
    
    public void mostrarTipo(){
        System.out.println("T es un: " + objeto.getClass().getName());    
    }
    
}   

