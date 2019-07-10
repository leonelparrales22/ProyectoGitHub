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
//        try {
//            Connection cnx;
//            Statement st;
//            ResultSet rs;
//            PreparedStatement pst = null;
//            cnx = ConexionDB.getConneccion();
//            st = cnx.createStatement();
//
//            rs = st.executeQuery("SELECT provincia.nombre_provincia, MAX(emcondise+emcondisp+omcondise+omcondisp+ehcondisp+ehcondise+ohcondisp+ohcondise) AS NUMERO_DISCAPACITADOS "
//                    + "FROM INFORMACION_EMPRESAS, PROVINCIA "
//                    + "WHERE INFORMACION_EMPRESAS.COD_PROV=PROVINCIA.COD_PROV "
//                    + "AND WGRUENC=2 "
//                    + "GROUP BY provincia.nombre_provincia");
//
//            //Nombre de las columnas:
//            ResultSetMetaData rsmd = rs.getMetaData();
//            System.out.println(rsmd.getColumnName(1) + "\t" + rsmd.getColumnName(2));
//
//            //Registros
//            while (rs.next()) {
//                System.out.println(rs.getString(1) + "\t" + rs.getString(2));
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }

        ControladorUsuarios c=new ControladorUsuarios();
    
    }

}
