/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leal.avanzado.tema3.Singleton;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Santiago
 */

//No es un DAO bien
public class PaisDaoImp {
    
    private List paises = null;
    private static PaisDaoImp instancia = null;
    
    //el constructor siempre debe se private en singleton para que no pueda ser instanciado
    private PaisDaoImp(){
    }
    
    //metodo que retorna la instancia, solo la crea una vez
    public static PaisDaoImp getInstancia(){
        if(instancia == null){
            instancia = new PaisDaoImp();
        }
        return instancia;
    }
    
    
    public  List getPaises(){
        if(paises == null){//solo se ejecuta una vez
            paises = new ArrayList(); 
            Pais p1 = new Pais("PERU"); 
            Pais p2 = new Pais("MEXICO"); 
            Pais p3 = new Pais("COLOMBIA"); 

            paises.add(p1);
            paises.add(p2);
            paises.add(p3);
        }
       return paises; //retorna la lista
    }
}
