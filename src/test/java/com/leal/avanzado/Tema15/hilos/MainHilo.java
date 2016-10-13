package com.leal.avanzado.Tema15.hilos;

/**
 *
 * @author Santiago
 */
public class MainHilo {
    
    
    public static void main(String...leal) throws InterruptedException{
        
        THilo hilo1 = new THilo(1);//hilo con thread
        THilo hilo2 = new THilo(2);//""

        hilo1.start(); //empieza a ejecutar el hilo 1
       // hilo1.sleep(1000);
        hilo2.start(); //empieza a ejecutar el hilo 1
       // hilo2.sleep(1000);
        
        //Hilo con Runnable
        Thread hilo3 = new Thread(new RunnableHilo(5));
        hilo3.start();
        //Hilo de main 
        for (int i = 0; i < 10; i++) {
            System.out.println("Hilo MAIN : " + i);
            Thread.sleep(500);
        }
        
        //crear un hilo con una clase anonima,imp sus metodos ya que no se puedden crear obd.  de las interf
        //hilo anonimo
        Runnable r = new Runnable(){
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("[H ANONIMO] ejecutandose : " + i);
                }
            }
        };
        
        Thread hilo4 = new Thread(r);
        hilo4.start();
    
    }
}
