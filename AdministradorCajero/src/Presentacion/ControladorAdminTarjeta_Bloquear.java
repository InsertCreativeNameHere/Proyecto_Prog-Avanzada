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
public class ControladorAdminTarjeta_Bloquear implements ActionListener {

    private VistaAdminTarjeta_Bloquear miVistaAdminTarjeta_Bloquear;

    ControladorAdminTarjeta_Bloquear(VistaAdminTarjeta_Bloquear aThis) {
        miVistaAdminTarjeta_Bloquear = aThis;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(miVistaAdminTarjeta_Bloquear.getBtnCambiarEstado())){
            miVistaAdminTarjeta_Bloquear.getMiModelo().btnAdminTarjeta_Bloquear_CambiarEstado();
        }
         if(e.getSource().equals(miVistaAdminTarjeta_Bloquear.getBtnVolver())){
            miVistaAdminTarjeta_Bloquear.getMiModelo().btnAdminTarjeta_Bloquear_Volver();
        }
        
    }
    
}
