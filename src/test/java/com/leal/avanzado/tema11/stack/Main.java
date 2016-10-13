package com.leal.avanzado.tema11.stack;

import java.util.Stack;

/**
 *
 * @author Santiago
 */
public class Main {
    
    public static void main(String[]args) throws InterruptedException{
    
        Stack<String> pila = new Stack();
        pila.push("1-leal");
        pila.push("2-leal1");
        pila.push("3-leal3");
        pila.push("4-leal4");
        
        for(String elem : pila){
            System.out.println(elem);//oreden en lo que estan
        
        }
        
        
        System.out.println("Tope" + pila.peek());//saber cual es el elemento en el tope
        System.out.println("posicion de 3-leal3:  " + pila.search("3-leal3"));//aBusca unelemnto y devuelve su posicion, -1 si no existe en la pila
        
        while(!pila.isEmpty()){
            System.out.println("Atendiendo a:"+ pila.pop());//orden como salen, elimina elemento de la pila
            Thread.sleep(1000);//parar un segundo
        }
        
        
        //crear pila de Personas
        
        Stack<Persona> pilaP = new Stack();
        pilaP.push(new Persona ("Juan", 20));
        pilaP.push(new Persona ("Jose", 15));
        pilaP.push(new Persona ("Maria", 25));
        pilaP.push(new Persona ("Luis", 30));
        
        System.out.println("Tope" + pilaP.peek());//saber cual es el elemento en el tope
        System.out.println("posicion :  " + pilaP.search(new Persona("Maria",25)));
        
        for(Persona p : pilaP){
            System.out.println(p);
        }
        
        
       
    }
    
}
