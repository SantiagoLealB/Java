/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOConexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Santiago
 */
public class Conexion {
    protected Connection conexion;
    //JDBC driver nombre y bd URL
    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost/almacen";
    //credenciales de la  bd
    private final String USER = "root";
    private final String PASS = "coleccionista45";
    
    //Abrir la conexion de la bd
    public void conectar() throws SQLException, ClassNotFoundException{
        try{
          conexion = DriverManager.getConnection(DB_URL, USER, PASS);
          Class.forName(JDBC_DRIVER);
        }
        catch(SQLException ex){
            //System.out.println("ERROR al conectar");
            ex.printStackTrace();
        }
        catch(ClassNotFoundException ex){
            //System.out.println("ERROR al conectar");
            ex.printStackTrace();
        }
    }
    
    //cerrar la conexxion
    
    public void cerrar() throws SQLException{
        if(conexion != null){//si esta llena
            if(conexion.isClosed()){//si esta abierta
                conexion.close();
            }
        }
    }
}
