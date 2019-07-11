/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Logica.Cuenta;
import Logica.Tarjeta;
import Logica.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author javie
 */
public class Conector {
    
    String url = "C:\\xampp\\htdocs\\Cajero\\banco.db";
    Connection connect;
    
    public void connect(){
    try {
        connect = DriverManager.getConnection("jdbc:sqlite:"+url);
        if (connect!=null) {
            System.out.println("Conectado");
        }
        }catch (SQLException ex) {
            System.err.println("No se ha podido conectar a la base de datos\n"+ex.getMessage());
        }
    }
    
    
    public void close(){
        try {
            connect.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    
    
    public void guardarCliente(Usuario usuario){
        try {
            PreparedStatement st = connect.prepareStatement("insert into Usuario (cedula,nombre, apellido) values (?,?,?)");
            st.setInt(1, usuario.getCedula());
            st.setString(2, usuario.getNombre());
            st.setString(3, usuario.getApellido());
            st.execute();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

    }
    
    public void guardarCuenta(Cuenta cuenta){
        try {
            PreparedStatement st = connect.prepareStatement("insert into Cuenta (saldo, cedula_cliente) values (?,?)");
            st.setInt(1, cuenta.getSaldo());
            st.setInt(2, cuenta.getId_cliente());
            st.execute();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

    }
    
    public void consignar(int valor, int id){
        try {
            PreparedStatement st = connect.prepareStatement("UPDATE Cuenta SET saldo = saldo + (?) WHERE id=(?)");
            st.setInt(1, valor);
            st.setInt(2, id);
            st.execute();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    
   public void crearTarjeta(Tarjeta t){
        try {
            PreparedStatement st = connect.prepareStatement("insert into Tarjeta (nombre, clave,id_cuenta,estado) values (?,?,?,?)");
            st.setString(1, t.getNombre());
            st.setString(2, t.getClave());
            st.setInt(3, t.getId_cuenta());
            st.setString(4, t.getEstado());
            st.execute();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
}
