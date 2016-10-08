/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOPrueba;

import DAOModelo.Persona;
import DAOPersona.DAOPersona;
import DAOPersonaImp.DAOPersonaImp;
import java.util.List;

/**
 *
 * @author Santiago
 */
public class Main {
    
    public static void main(String[] args) throws Exception{
        
        DAOPersona daoPer = new DAOPersonaImp();
        
        //listar
        /*try {     
            for (Persona p : daoPer.listar()){
                System.out.printf("Id: %d \t Nombre: %s \t Pass: %s \n", p.getId(), p.getNombre(), p.getPass());
            }
        }
        catch (Exception ex) {
        }*/

        //Insertar
        /*try {     
           daoPer.registrar(new Persona("Otro Usuario","abcdef"));
            System.out.println("Se inserto");
        }
        catch (Exception ex) {
            System.out.println("NO Se inserto");

        }*/

//        //Modficar
//        try {     
//           daoPer.modificar(new Persona(2, "Santiago9","123456"));
//        }
//        catch (Exception ex) {
//        }

//        //Eliminar
//        try {     
//           daoPer.eliminar(1);
//        }
//        catch (Exception ex) {
//        }
        
    }
}
