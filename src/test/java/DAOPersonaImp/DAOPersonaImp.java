/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOPersonaImp;
import DAOConexion.*;
import DAOModelo.*;
import DAOPersona.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Santiago
 */
public class DAOPersonaImp extends Conexion implements DAOPersona {
    
    @Override
    public void registrar(Persona p) throws Exception {
        try {
            this.conectar();
            PreparedStatement ps =this.conexion.prepareStatement("INSERT into usuario(nombre, pass) VALUES (?,?)");
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getPass());
            ps.executeUpdate();//ejecutar la consulta
        }
        catch(Exception ex){
            System.out.println("No registro");
        }
        finally{
            this.cerrar();
        }
    }
    @Override
    public void modificar(Persona p) throws Exception {
        try {
            this.conectar();
            PreparedStatement ps =this.conexion.prepareStatement("UPDATE usuario SET nombre = ? , pass = ?  WHERE id_usuario = ? ");
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getPass());
            ps.setInt(3, p.getId()); //en el orden que aparecen los ?

            ps.executeUpdate();//ejecutar la consulta
        }
        catch(Exception ex){
        }
        finally{
            this.cerrar();
        }
    }

    public void eliminar(int id) throws Exception {
        try {
            this.conectar();
            PreparedStatement ps =this.conexion.prepareStatement("DELETE FROM usuario WHERE id_usuario = ?");
            ps.setInt(1, id) ;
            ps.executeUpdate();//ejecutar la consulta
        }
        catch(Exception ex){
        }
        finally{
            this.cerrar();
        }
    }

    public List listar() throws Exception {
        List <Persona>lista = null;
        try {
            this.conectar();
            PreparedStatement ps =this.conexion.prepareStatement("SELECT * FROM Usuario");
            ResultSet consulta = ps.executeQuery();//ejecutar la consulta
            lista = new ArrayList();
            
            while(consulta.next()){
                Persona p = new Persona();
                p.setId(consulta.getInt(1));
                p.setNombre(consulta.getString(2));
                p.setPass(consulta.getString(3));
                
                lista.add(p);
            }
        }
        catch(Exception ex){
        }
        finally{
            this.cerrar();
        }
        return lista;
    }

  
    
}
