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
public class ControladorAdminTarjeta implements ActionListener {

    private VistaAdminTarjeta miVistaAdminTarjeta;

    ControladorAdminTarjeta(VistaAdminTarjeta aThis) {
        miVistaAdminTarjeta = aThis;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(miVistaAdminTarjeta.getBtnCrear())){
            miVistaAdminTarjeta.getMiModelo().btnAdminTarjeta_Crear();
        }
        if(e.getSource().equals(miVistaAdminTarjeta.getBtnVolver())){
            miVistaAdminTarjeta.getMiModelo().btnInicio_AdminTarjeta_Volver();
        }
    }
    
}
