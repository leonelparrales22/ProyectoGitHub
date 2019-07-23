/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import controlador.ControladorUsuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leonel
 */
public class Main {
    
    public static void main(String[] args) throws SQLException {
        Connection cnx;
            Statement st;
            ResultSet rs;
            PreparedStatement pst = null;
            cnx = ConexionDB.getConneccion();
            st = cnx.createStatement();
            st.executeUpdate("INSERT INTO USUARIO VALUES (NULL,'Diego','Gonzalez','1725670390','dgonzalezq2@est.ups.edu.ec','12345','1')");
        
    }
    
}
