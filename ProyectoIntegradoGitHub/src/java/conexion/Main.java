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
    
    public static void main(String[] args) {
        try {
            String email = "root";
            String contrasenia = "root";
            
            Connection cnx;
            Statement st;
            ResultSet rs;
            PreparedStatement pst = null;
            cnx = ConexionDB.getConneccion();
            st = cnx.createStatement();
            rs = st.executeQuery("SELECT * FROM USUARIO\n"
                    + "WHERE email='" + email + "'\n"
                    + "AND contrasenia='" + contrasenia + "'");
            
            while (rs.next()) {
                System.out.println(rs.getString(1) + rs.getString(2));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
