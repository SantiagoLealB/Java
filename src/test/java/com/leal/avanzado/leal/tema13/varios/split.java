package com.leal.avanzado.leal.tema13.varios;

/**
 *
 * @author Santiago
 */
public class split {
    public static void main(String[]args){
    
        String cadena = "Hola,como,estan,todos, jaja";
        //String cadena = "Hola,como,estan,todos";

       //el segundo param es opcional
        String[]extraccion = cadena.split(",",3);//convertir cadenaa en arreglo, de acuerdo a la expersion reg,en este caso,
        //String[]extraccion = cadena.split("\\|, 3");// una expReg y segundo valor un entoro(No. de veces que se va a evaluar)
        
        for (int i = 0; i < extraccion.length; i++) {
            System.out.println(extraccion[i]);
        }
        
    }
}
