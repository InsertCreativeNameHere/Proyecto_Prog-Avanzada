/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import javax.swing.JButton;

/**
 *
 * @author ldani
 */
public class VistaAdminTarjeta extends javax.swing.JFrame {

    private ControladorAdminTarjeta miControl;
    private Modelo miModelo;

    public VistaAdminTarjeta(Modelo m) {
        miModelo = m;
        initComponents();
        this.setLocationRelativeTo(null);
        capturareventos();
    }

    public ControladorAdminTarjeta getMiControl() {
        if (miControl == null) {
            miControl = new ControladorAdminTarjeta(this);
        }
        return miControl;
    }

    public void capturareventos() {
        getBtnVolver().addActionListener(getMiControl());
        getBtnCrear().addActionListener(getMiControl());      
    }

    public Modelo getMiModelo() {
        return miModelo;
    }

    public JButton getBtnCrear() {
        return btnCrear;
    }

    public JButton getBtnVolver() {
        return btnVolver;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCrear = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCrear.setText("Crear");

        btnVolver.setText("Volver");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(btnCrear)
                .addGap(67, 67, 67)
                .addComponent(btnVolver)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnVolver;
    // End of variables declaration//GEN-END:variables
}
