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
public class ControladorAdminCuenta implements ActionListener{

    private VistaAdminCuenta miVistaAdminCuenta;

    ControladorAdminCuenta(VistaAdminCuenta aThis) {
        miVistaAdminCuenta = aThis;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource().equals(miVistaAdminCuenta.getBtnCrearCuenta())){
           miVistaAdminCuenta.getMiModelo().btnAdminCuenta_CrearCuenta();
       }
       if(e.getSource().equals(miVistaAdminCuenta.getBtnEliminarCuenta())){
           miVistaAdminCuenta.getMiModelo().btnAdminCuenta_EliminarCuenta();
       }
       if(e.getSource().equals(miVistaAdminCuenta.getBtnVolver())){
           miVistaAdminCuenta.getMiModelo().btnInicio_AdminCuenta_Volver();
       }
    }
    
}
