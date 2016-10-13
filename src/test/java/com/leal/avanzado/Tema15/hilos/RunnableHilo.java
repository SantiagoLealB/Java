package com.leal.avanzado.Tema15.hilos;

/**
 *
 * @author Santiago
 */
public class RunnableHilo implements Runnable {

    private int n;

    public RunnableHilo(int n) {
        this.n = n;
    }
    
     public void run(){
        
        for (int i = 0; i < 10; i++) {
            
            System.out.println("[Runnable] Ejecutando id : " + n);
            
        }
    
    }
}
