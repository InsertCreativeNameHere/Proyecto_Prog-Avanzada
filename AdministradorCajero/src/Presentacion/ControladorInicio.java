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
public class ControladorInicio implements ActionListener {

    private VistaInicio miVistaInicio;

    ControladorInicio(VistaInicio aThis) {
        miVistaInicio = aThis;
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(miVistaInicio.getBtnAdminCuenta())) {
            miVistaInicio.getMiModelo().btnAdminCuenta();
        }
        
        if (e.getSource().equals(miVistaInicio.getBtnAdminTarjeta())) {
            miVistaInicio.getMiModelo().btnAdminTarjeta();
        }

        if (e.getSource().equals(miVistaInicio.getBtnAdminUsuario())) {
            miVistaInicio.getMiModelo().btnAdminUsuario();
        }
        if(e.getSource().equals(miVistaInicio.getBtnSalir())){
            miVistaInicio.getMiModelo().salir();
        }

    }
}
