package com.leal.avanzado.leal.tema13.varios;

/**
 *
 * @author Santiago
 */
public class StringBuilderyBuffer {
    
    public static void main(String[]args){
        
        StringBuilder sb = new StringBuilder();
        //StringBuffer sbu = new StringBuffer();
        sb.append("Hola como estan");
        
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.reverse());
        //sb.setLength(0);//borrar elementos
        System.out.println(sb.toString());
        
        
        
        
    }
    
}
