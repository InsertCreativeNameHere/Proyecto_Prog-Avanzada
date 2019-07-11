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
public class ControladorAdminCuenta_CrearCuenta implements ActionListener{
    
    private VistaAdminCuenta_CrearCuenta miVistaAdminCuenta_CrearCuenta;

    ControladorAdminCuenta_CrearCuenta(VistaAdminCuenta_CrearCuenta aThis) {
        miVistaAdminCuenta_CrearCuenta = aThis;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(miVistaAdminCuenta_CrearCuenta.getBtnConfirmar())){
            miVistaAdminCuenta_CrearCuenta.getMiModelo().btnAdminCuenta_CrearCuenta_Confirmar();
        }
         if(e.getSource().equals(miVistaAdminCuenta_CrearCuenta.getBtnVolver())){
            miVistaAdminCuenta_CrearCuenta.getMiModelo().btnAdminCuenta_CrearCuenta_Volver();
        }
        
    }
}
