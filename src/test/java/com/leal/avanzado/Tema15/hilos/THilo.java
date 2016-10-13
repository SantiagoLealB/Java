package com.leal.avanzado.Tema15.hilos;

/**
 *
 * @author Santiago
 */
public class THilo extends Thread{
    
    private int n;

    public THilo(int n) {
        this.n = n;
    }
    
    @Override
    public void run(){
        
        for (int i = 0; i < 10; i++) {
            
            System.out.println("[Thread] Ejecutando id : " + n);
            
        }
    
    }
    
}
