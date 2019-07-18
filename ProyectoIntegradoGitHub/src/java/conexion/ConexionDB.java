
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RICHARD
 */
public class ConexionDB {
    public static Connection getConneccion(){
     try {
          
            Class.forName("oracle.jdbc.driver.OracleDriver");  //DRIVER DE SQL DEVELOPER
            String myDB = "jdbc:oracle:thin:@172.17.42.63:1521:orclupsoltp";//URL DE SQL DEVELOPER
            String usuario="p54g3_oltp_hr";
            String password="g03_4263";
            Connection cnx = DriverManager.getConnection(myDB,usuario,password);
            return cnx;
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }  
   
    }

