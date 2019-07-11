/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Logica.Cuenta;
import Logica.Tarjeta;
import Logica.Usuario;
import Persistencia.Conector;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ldani
 */
public class Modelo {

    private VistaAdminUsuario miVistaAdminUsuario;
    private VistaAdminUsuario_CrearUsuario miVistaAdminUsuario_CrearUsuario;

    private VistaAdminCuenta miVistaAdminCuenta;
    private VistaAdminCuenta_CrearCuenta miVistaAdminCuenta_CrearCuenta;
    private VistaAdminCuenta_EliminarCuenta miVistaAdminCuenta_EliminarCuenta;

    private VistaAdminTarjeta miVistaAdminTarjeta;
    private VistaAdminTarjeta_Crear miVistaAdminTarjeta_Crear;
    private VistaAdminTarjeta_Bloquear miVistaAdminTarjeta_Bloquear;

    private VistaInicio miVistaInicio;

    public void iniciar() {
        getMiVistaInicio().setVisible(true);
    }

    public void salir() {
        System.exit(0);
    }

    public VistaInicio getMiVistaInicio() {
        if (miVistaInicio == null) {
            miVistaInicio = new VistaInicio(this);

        }
        return miVistaInicio;
    }

    public VistaAdminUsuario getMiVistaAdminUsuario() {
        if (miVistaAdminUsuario == null) {
            miVistaAdminUsuario = new VistaAdminUsuario(this);

        }
        return miVistaAdminUsuario;
    }

    public VistaAdminUsuario_CrearUsuario getMiVistaAdminUsuario_CrearUsuario() {
        if (miVistaAdminUsuario_CrearUsuario == null) {
            miVistaAdminUsuario_CrearUsuario = new VistaAdminUsuario_CrearUsuario(this);

        }
        return miVistaAdminUsuario_CrearUsuario;
    }

    public VistaAdminCuenta getMiVistaAdminCuenta() {
        if (miVistaAdminCuenta == null) {
            miVistaAdminCuenta = new VistaAdminCuenta(this);

        }
        return miVistaAdminCuenta;
    }

    public VistaAdminCuenta_CrearCuenta getMiVistaAdminCuenta_CrearCuenta() {
        if (miVistaAdminCuenta_CrearCuenta == null) {
            miVistaAdminCuenta_CrearCuenta = new VistaAdminCuenta_CrearCuenta(this);

        }
        return miVistaAdminCuenta_CrearCuenta;
    }

    public VistaAdminCuenta_EliminarCuenta getMiVistaAdminCuenta_EliminarCuenta() {
        if (miVistaAdminCuenta_EliminarCuenta == null) {
            miVistaAdminCuenta_EliminarCuenta = new VistaAdminCuenta_EliminarCuenta(this);

        }
        return miVistaAdminCuenta_EliminarCuenta;
    }

    public VistaAdminTarjeta getMiVistaAdminTarjeta() {
        if (miVistaAdminTarjeta == null) {
            miVistaAdminTarjeta = new VistaAdminTarjeta(this);

        }
        return miVistaAdminTarjeta;
    }

    public VistaAdminTarjeta_Crear getMiVistaAdminTarjeta_Crear() {
        if (miVistaAdminTarjeta_Crear == null) {
            miVistaAdminTarjeta_Crear = new VistaAdminTarjeta_Crear(this);

        }
        return miVistaAdminTarjeta_Crear;
    }

    public VistaAdminTarjeta_Bloquear getMiVistaAdminTarjeta_Bloquear() {
        if (miVistaAdminTarjeta_Bloquear == null) {
            miVistaAdminTarjeta_Bloquear = new VistaAdminTarjeta_Bloquear(this);

        }
        return miVistaAdminTarjeta_Bloquear;
    }

    //MENU DE INICIO
    void btnInicio_AdminUsuario_Volver() {
        getMiVistaAdminUsuario().dispose();
        getMiVistaInicio().setVisible(true);
    }

    void btnInicio_AdminCuenta_Volver() {
        getMiVistaAdminCuenta().dispose();
        getMiVistaInicio().setVisible(true);
    }

    void btnInicio_AdminTarjeta_Volver() {
        getMiVistaAdminTarjeta().dispose();
        getMiVistaInicio().setVisible(true);
    }

    void btnAdminUsuario() {
        getMiVistaInicio().dispose();
        getMiVistaAdminUsuario().setVisible(true);
    }

    void btnAdminCuenta() {
        getMiVistaInicio().dispose();
        getMiVistaAdminCuenta().setVisible(true);
    }

    void btnAdminTarjeta() {
        getMiVistaInicio().dispose();
        getMiVistaAdminTarjeta().setVisible(true);
    }

    //ADMINISTRACION DE USUARIOS
    void btnAdminUsuario_CrearUsuario() {
        getMiVistaAdminUsuario().dispose();
        getMiVistaAdminUsuario_CrearUsuario().setVisible(true);
    }

    void btnAdminUsuario_CrearUsuario_Confirmar() {
        int cedula = Integer.parseInt(getMiVistaAdminUsuario_CrearUsuario().getTxtIdentificacion().getText());
        String nombre = getMiVistaAdminUsuario_CrearUsuario().getTxtNombre().getText();
        String apellido = getMiVistaAdminUsuario_CrearUsuario().getTxtApellido().getText();
        Usuario u = new Usuario(cedula, nombre, apellido);
        Conector con = new Conector();
        con.connect();
        con.guardarCliente(u);
        con.close();
        JOptionPane.showMessageDialog(null, "Se ha creado un usuario");
    }

    void btnAdminUsuario_CrearUsuario_Volver() {
        getMiVistaAdminUsuario_CrearUsuario().dispose();
        getMiVistaAdminUsuario().setVisible(true);
    }

    void btnAdminUsuario_ModificarUsuario_ConfirmarCambios() {
        JOptionPane.showMessageDialog(null, "Se ha modificado el usuario");
    }

    //ADMINISTRACION DE CUENTAS
    void btnAdminCuenta_CrearCuenta() {
        getMiVistaAdminCuenta().dispose();
        getMiVistaAdminCuenta_CrearCuenta().setVisible(true);

    }

    void btnAdminCuenta_EliminarCuenta() {
        getMiVistaAdminCuenta().dispose();
        getMiVistaAdminCuenta_EliminarCuenta().setVisible(true);
    }

    void btnAdminCuenta_CrearCuenta_Confirmar() {
        int saldo = Integer.parseInt(getMiVistaAdminCuenta_CrearCuenta().getTxtSaldo().getText());
        int cedula = Integer.parseInt(getMiVistaAdminCuenta_CrearCuenta().getTxtCedula().getText());
        Cuenta u = new Cuenta(saldo,cedula);
        Conector con = new Conector();
        con.connect();
        con.guardarCuenta(u);
        con.close();
        JOptionPane.showMessageDialog(null, "Se ha creado una cuenta");
    }

    void btnAdminCuenta_CrearCuenta_Volver() {
        getMiVistaAdminCuenta_CrearCuenta().dispose();
        getMiVistaAdminCuenta().setVisible(true);
    }

    void btnAdminCuenta_EliminarCuenta_Eliminar() {
        int valor = Integer.parseInt(getMiVistaAdminCuenta_EliminarCuenta().getTxtValor().getText());
        int id = Integer.parseInt(getMiVistaAdminCuenta_EliminarCuenta().getTxtID().getText());
        Conector con = new Conector();
        con.connect();
        con.consignar(valor, id);
        con.close();
        JOptionPane.showMessageDialog(null, "Se ha registrado la transaccion");
    }

    void btnAdminCuenta_EliminarCuenta_Volver() {
        getMiVistaAdminCuenta_EliminarCuenta().dispose();
        getMiVistaAdminCuenta().setVisible(true);
    }

    //ADMINISTRACION DE TARJETAS
    void btnAdminTarjeta_Bloquear() {
        getMiVistaAdminTarjeta().dispose();
        getMiVistaAdminTarjeta_Bloquear().setVisible(true);
    }

    void btnAdminTarjeta_Crear() {
        getMiVistaAdminTarjeta().dispose();
        getMiVistaAdminTarjeta_Crear().setVisible(true);
    }

    void btnAdminTarjeta_Crear_Crear() {
        String contra = getMiVistaAdminTarjeta_Crear().getTxtContra().getText();
        int id = Integer.parseInt(getMiVistaAdminTarjeta_Crear().getTxtID().getText());
        Tarjeta u = new Tarjeta();
        u.setClave(contra);
        u.setId_cuenta(id);
        Conector con = new Conector();
        con.connect();
        con.crearTarjeta(u);
        con.close();
        JOptionPane.showMessageDialog(null, "Tarjeta creada");
    }

    void btnAdminTarjeta_Crear_Volver() {
        getMiVistaAdminTarjeta_Crear().dispose();
        getMiVistaAdminTarjeta().setVisible(true);
    }

    void btnAdminTarjeta_Bloquear_CambiarEstado() {
        JOptionPane.showMessageDialog(null, "Tarjeta Bloqueada o activada");
    }

    void btnAdminTarjeta_Bloquear_Volver() {
        getMiVistaAdminTarjeta_Bloquear().dispose();
        getMiVistaAdminTarjeta().setVisible(true);
    }

}
