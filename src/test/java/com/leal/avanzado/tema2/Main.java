/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leal.avanzado.tema2;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Santiago
 */ 
public class Main {
    
    private List canasta = new ArrayList();
     
    public static void main(String[]args){
//        String texto = new String("Texto");
//        
//        if(texto instanceof String){
//            System.out.println("Es una instancia de String");
//        }
//        
//        Alumno a = new Alumno();
//        if(a instanceof Alumno)
//            System.out.println("Es un Alumno");
//        
//        if(a instanceof Persona)
//            System.out.println("Es una Persona");
//   
     
        System.out.println("Ingresar solo frutas");
       
        Main obj = new Main();
        obj.verificar(new Manzana("Roja"));
        obj.verificar(new Manzana("Verde"));
        obj.verificar(new Naranja("Naranja"));
        obj.verificar(new Galleta("Galleta"));
    }
    
    private void verificar(Object obj){
        
        if(obj instanceof Fruta){
            canasta.add(obj);
            System.out.println("Fruta agregada: " + ((Fruta) obj).getNombre());
        }
        else{
            System.out.println("Elemento no permitido: "+ ((Galleta)obj).getNombre() );
        }
    
    }
}
