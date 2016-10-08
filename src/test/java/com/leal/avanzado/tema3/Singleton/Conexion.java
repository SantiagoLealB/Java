/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leal.avanzado.tema3.Singleton;

/**
 *
 * @author Santiago
 */
//Singleton, poseer una unica instancia de una clase
public class Conexion {
    
    private static Conexion instancia = null;
    
    public static Conexion getInstancia(){
        if(instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }
    
    //se debe crear un constructor privado,para que no se puedan crear mas objetos de la clase 
    private Conexion(){
    }
}
