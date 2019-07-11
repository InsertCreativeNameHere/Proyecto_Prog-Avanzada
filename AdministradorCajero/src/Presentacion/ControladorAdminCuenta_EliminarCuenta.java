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
public class ControladorAdminCuenta_EliminarCuenta implements ActionListener {

    private VistaAdminCuenta_EliminarCuenta miVistaAdminCuenta_EliminarCuenta;

    ControladorAdminCuenta_EliminarCuenta(VistaAdminCuenta_EliminarCuenta aThis) {
        miVistaAdminCuenta_EliminarCuenta = aThis;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(miVistaAdminCuenta_EliminarCuenta.getBtnEliminar())){
            miVistaAdminCuenta_EliminarCuenta.getMiModelo().btnAdminCuenta_EliminarCuenta_Eliminar();
        }
        if(e.getSource().equals(miVistaAdminCuenta_EliminarCuenta.getBtnVolver())){
            miVistaAdminCuenta_EliminarCuenta.getMiModelo().btnAdminCuenta_EliminarCuenta_Volver();
        }
    }

}
