package com.leal.avanzado.leal.tema12.queue;
import java.util.PriorityQueue;
import java.util.Queue;
 
public class Main {
    
    public static void main(String[]args) throws InterruptedException{
    
        Queue<String> cola = new PriorityQueue();
        cola.offer("1-leal");
        cola.offer("2-leal1");
        cola.offer("3-leal3");
        cola.offer("4-leal4");
        
        while(!cola.isEmpty()){
            System.out.println("Atendiendo a: " + cola.peek());
            System.out.println("Quitando a: " + cola.poll());//
            Thread.sleep(1000);
        }
        
        //Cola de tipo Personas
        
        Queue<Persona> colaP = new PriorityQueue();
        colaP.offer(new Persona("Juan", 21));
        colaP.offer(new Persona("Juan2", 17));
        colaP.offer(new Persona("Juan3", 23));
        //obtiene respecto a la edad
        while(!colaP.isEmpty( )){
            System.out.println("Obteniendo a: " + colaP.peek());
            System.out.println("Quitando a: " + colaP.poll());
            Thread.sleep(1000);        
        }
        
    }
    
}
