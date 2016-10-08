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
public class Main {
    
    public static void main(String[]args){
    
//      PaisDaoImp dao = new PaisDaoImp();
//        for(Object obj : dao.getPaises()){
//            System.out.println( ((Pais)obj).getNombre());//la lista no tiene un generico por eso se castea
//        }
    
    //Usando singleton
    PaisDaoImp dao = PaisDaoImp.getInstancia(); //no se crea una instancia, se accede al metodo que devuelve la instancia
   
    for(Object obj : dao.getPaises()){
        System.out.println( ((Pais)obj).getNombre());//la lista no tiene un generico por eso se castea
    }
    
        System.out.println("------------");
    
    PaisDaoImp dao2 = PaisDaoImp.getInstancia(); //no se crea una instancia, se accede al metodo que devuelve la instancia
    for(Object obj : dao2.getPaises()){
        System.out.println( ((Pais)obj).getNombre());//la lista no tiene un generico por eso se castea
    }
    
    
    
    }
    
}
