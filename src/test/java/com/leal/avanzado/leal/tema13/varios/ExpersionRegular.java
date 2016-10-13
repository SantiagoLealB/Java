package com.leal.avanzado.leal.tema13.varios;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Santiago
 */
public class ExpersionRegular {
    
    public static void main(String... leal){
        Pattern pat = Pattern.compile("[abc]");
        
        Matcher m = pat.matcher("ana");
        System.out.println(m.matches());
        
    }
}
