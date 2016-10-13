/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leal.avanzado.tema10.map.hashmap;
 
 import java.util.HashMap;
import java.util.Iterator;
 import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Santiago
 */
public class Main {
    
    public static void main(String[]args){
     
        //
        Map <Integer, String> map1 = new HashMap();
        map1.put(1, "leal");
        map1.put(3, "barragan");
        map1.put(2, "leal");
        map1.put(4, "a");
        
//        //recorrer el map con iterador
//        Iterator i = map1.keySet().iterator();
//        while(i.hasNext()){
//            Integer clave = (Integer)i.next();
//            System.out.println("Clave: "+ clave  + " -> Valor : "+ map1.get(clave));
//        }
        
        //para un Objeto Persona,  clave:Persona, valor String
        Map<Persona, String> hm = new HashMap();//orden Aleatorio
        //Map<Persona, String> tm = new TreeMap();//ordena, 
        //Map<Persona, String> lhm = new LinkedHashMap()//Como llegan

                
        hm.put(new Persona("Manuel", 22),"Guzman");
        hm.put(new Persona("Jose2", 23),"Garcia");
        hm.put(new Persona("Jose3", 20),"Lopez");
        hm.put(new Persona("Jose3", 20), "Leal");
        hm.put(new Persona("Jose", 20),"Leal");
        
        //RECORRER CON UN ITERATOR
        Iterator i2 = hm.keySet().iterator();
        System.out.println("Nombre\tEdad\tApellido");

        while(i2.hasNext()){
            Persona clave = (Persona)i2.next();
            System.out.printf( "%s\t%d\t%s\n", clave.getNombre(), clave.getEdad(),  hm.get(clave));
        }
        
        //RECORRER CON FOREACH
        for(Entry <Persona, String> ent: hm.entrySet()){ 
            System.out.println("Clave: " + ent.getKey().getNombre()+ " " + ent.getKey().getEdad() + "-> Valor: "+ ent.getValue());
        
        }
     
         //recorrer con foreach
         
         //for(Entry>Persona){}
        
        
    }
}
