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
public class VistaAdminCuenta extends javax.swing.JFrame {

    private ControladorAdminCuenta miControl;
    private Modelo miModelo;

    public VistaAdminCuenta(Modelo m) {
        miModelo = m;
        initComponents();
        this.setLocationRelativeTo(null);
        capturareventos();
    }

    public ControladorAdminCuenta getMiControl() {
        if (miControl == null) {
            miControl = new ControladorAdminCuenta(this);
        }
        return miControl;
    }

    public void capturareventos() {
        getBtnVolver().addActionListener(getMiControl());
        getBtnCrearCuenta().addActionListener(getMiControl());
        getBtnEliminarCuenta().addActionListener(getMiControl());
    }

    public Modelo getMiModelo() {
        return miModelo;
    }

    public JButton getBtnCrearCuenta() {
        return btnCrearCuenta;
    }

    public JButton getBtnEliminarCuenta() {
        return btnEliminarCuenta;
    }

    public JButton getBtnVolver() {
        return btnVolver;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCrearCuenta = new javax.swing.JButton();
        btnEliminarCuenta = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCrearCuenta.setText("Crear cuenta");

        btnEliminarCuenta.setText("Consignar Saldo");

        btnVolver.setText("Volver");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminarCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCrearCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btnCrearCuenta)
                .addGap(53, 53, 53)
                .addComponent(btnEliminarCuenta)
                .addGap(55, 55, 55)
                .addComponent(btnVolver)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JButton btnEliminarCuenta;
    private javax.swing.JButton btnVolver;
    // End of variables declaration//GEN-END:variables
}
