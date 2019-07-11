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
public class ControladorAdminTarjeta_Crear implements ActionListener  {

    private VistaAdminTarjeta_Crear miVistaAdminTarjeta_Crear;

    ControladorAdminTarjeta_Crear(VistaAdminTarjeta_Crear aThis) {
        miVistaAdminTarjeta_Crear = aThis;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(miVistaAdminTarjeta_Crear.getBtnCrear())){
            miVistaAdminTarjeta_Crear.getMiModelo().btnAdminTarjeta_Crear_Crear();
        }
        if(e.getSource().equals(miVistaAdminTarjeta_Crear.getBtnVolver())){
            miVistaAdminTarjeta_Crear.getMiModelo().btnAdminTarjeta_Crear_Volver();
        }
    }
    
}
