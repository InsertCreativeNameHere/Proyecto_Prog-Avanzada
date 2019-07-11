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
public class ControladorAdminUsuario_CrearUsuario implements ActionListener {
    private VistaAdminUsuario_CrearUsuario miVistaAdminUsuario_CrearUsuario;

    ControladorAdminUsuario_CrearUsuario(VistaAdminUsuario_CrearUsuario aThis) {
        miVistaAdminUsuario_CrearUsuario = aThis;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(miVistaAdminUsuario_CrearUsuario.getBtnConfirmar())){
            miVistaAdminUsuario_CrearUsuario.getMiModelo().btnAdminUsuario_CrearUsuario_Confirmar();
        }
        if(e.getSource().equals(miVistaAdminUsuario_CrearUsuario.getBtnVolver())){
            miVistaAdminUsuario_CrearUsuario.getMiModelo().btnAdminUsuario_CrearUsuario_Volver();
        }
    }
    
    
}
