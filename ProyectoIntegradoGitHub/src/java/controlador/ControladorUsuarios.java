/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import conexion.ConexionDB;
import modelo.Usuario;
import javax.servlet.http.HttpSession;

import conexion.Main;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;


/**
 *
 * @author Leonel
 */
@Named(value = "controladorUsuarios")
@RequestScoped
public class ControladorUsuarios {

    /**
     * Creates a new instance of ControladorUsuarios
     */
    
    private String email;
    private String contrasenia;
    private Usuario miUsuario;

    public Usuario getMiUsuario() {
        return miUsuario;
    }

    public void setMiUsuario(Usuario miUsuario) {
        this.miUsuario = miUsuario;
    }
   
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    public ControladorUsuarios() {

    }

    public String iniciarSesion() {

        String devolver = "";
        try {
            Connection cnx;
            Statement st;
            ResultSet rs;
            PreparedStatement pst = null;
            cnx = ConexionDB.getConneccion();
            st = cnx.createStatement();

//            rs = st.executeQuery("SELECT provincia.nombre_provincia, MAX(emcondise+emcondisp+omcondise+omcondisp+ehcondisp+ehcondise+ohcondisp+ohcondise) AS NUMERO_DISCAPACITADOS "
//                    + "FROM INFORMACION_EMPRESAS, PROVINCIA "
//                    + "WHERE INFORMACION_EMPRESAS.COD_PROV=PROVINCIA.COD_PROV "
//                    + "AND WGRUENC=2 "
//                    + "GROUP BY provincia.nombre_provincia");
            rs = st.executeQuery("SELECT * FROM USUARIO\n"
                    + "WHERE email='"+this.email+"'\n"
                    + "AND contrasenia='"+this.contrasenia+"'");

            //Nombre de las columnas:
            //ResultSetMetaData rsmd = rs.getMetaData();
            //System.out.println(rsmd.getColumnName(1) + "\t" + rsmd.getColumnName(2));
          

            //Registros
            while (rs.next()) {
                HttpSession hs = ControladorSession.getSession();
                hs.setAttribute("usuario", email);
                
                return "Usuario_Encontrado.xhtml";
            }

        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Usuario_No_Encontrado.xhtml";
    }
    
    public String registro() {

        String devolver = "";
        try {
            Connection cnx;
            Statement st;
            ResultSet rs;
            PreparedStatement pst = null;
            cnx = ConexionDB.getConneccion();
            st = cnx.createStatement();
            rs = st.executeQuery("INSERT INTO USUARIO VALUES (NULL,'"+miUsuario.getNombre()+"','"+miUsuario.getApellido()+"','+"+miUsuario.getCedula()+"','"+miUsuario.getEmail()+"','"+miUsuario.getContrasenia()+"','1');");

        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Registro_Completo.xhtml";
    }
    
    
}
