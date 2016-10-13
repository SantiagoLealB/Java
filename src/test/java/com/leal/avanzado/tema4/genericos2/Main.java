/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leal.avanzado.tema4.genericos2;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Santiago
 */
public class Main {
    
    public static void main(String[]args){
        Main obj = new Main();
        
        Persona p1 = new Profesor("Profe Juan");
        Persona p2 = new Profesor("Profe Jose");
        Persona p3 = new Profesor("Profe Julian");
        
        List<Persona> lisPer = new ArrayList();
        lisPer.add(p1);
        lisPer.add(p2);
        lisPer.add(p3);
        obj.listarUpper(lisPer);
        
        System.out.println("--");
        
        List<Persona> lisPer2 = new ArrayList();
        lisPer2.add(new Alumno("Alumno Miguel"));
        lisPer2.add(new Alumno("Alumno Manuel"));
        lisPer2.add(new Alumno("Alumno Mauricio"));
        obj.listarUpper(lisPer2);
        
        obj.listarLower(lisPer);//prof
        obj.listarLower(lisPer2);//alumn

        
    }
    
    //Listar tipo uppperBounded, insertar en clases que hereden o implementen de una clase o interface en particular
    public void listarUpper(List<? extends Persona> lista){
        System.out.println("UpperBounded-------------");

        for(Persona p : lista){
            System.out.println(p.getNombre());
        }
    }
    
    //solo se aceptan las clases que son superclases de alumno(el padre de alumno), tambien las interfaces que implementa alumno
     public void listarLower(List<? super Alumno> lista){
         System.out.println("LowerBounded------------");
        for(Object obj : lista){
            System.out.println(( (Persona)obj).getNombre());//se debe castear, a persona o Alumno porque obj es tipo Object
        }
    }
}
