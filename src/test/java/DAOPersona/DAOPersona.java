/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOPersona;
import DAOModelo.*;
import java.util.List;

/**
 *
 * @author Santiago
 */
public interface DAOPersona {
    public void registrar(Persona p)throws Exception;
    public void modificar(Persona p)throws Exception;
    public void eliminar(int id)throws Exception;
    public List<Persona> listar()throws Exception;
}
