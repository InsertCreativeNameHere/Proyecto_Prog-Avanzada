/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ldani
 */
public class ControladorAdminUsuario implements ActionListener {

    private VistaAdminUsuario miVistaAdminUsuario;

    ControladorAdminUsuario(VistaAdminUsuario aThis) {
        miVistaAdminUsuario = aThis;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(miVistaAdminUsuario.getBtnCrearUsuario())) {
            miVistaAdminUsuario.getMiModelo().btnAdminUsuario_CrearUsuario();
        }
        if (e.getSource().equals(miVistaAdminUsuario.getBtnVolver())) {
            miVistaAdminUsuario.getMiModelo().btnInicio_AdminUsuario_Volver();
        }

    }
}
