/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import Sesion3.*;

/**
 *
 * @author jordic
 */
public class SalpicaderoGUI extends javax.swing.JPanel {
    public void actualizarVista(Salpicadero sal){
        velocimetro.setText(String.valueOf(sal.getVelocidad()));
        rpm.setText(String.valueOf(sal.getRevoluciones()));
        contreciente.setText(String.valueOf(sal.getReciente()));
        contotal.setText(String.valueOf(sal.getTotal()));
         
        repaint();
        revalidate();
    }
    
    public SalpicaderoGUI() {
        initComponents(); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        velocimetro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        contreciente = new javax.swing.JTextField();
        contotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rpm = new javax.swing.JTextField();

        jLabel1.setText("Salpicadero");

        velocimetro.setText("0.0");
        velocimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                velocimetroActionPerformed(evt);
            }
        });

        jLabel2.setText("Velocímetro");

        jLabel3.setText("Cuentakilómetros");

        contreciente.setText("0.0");
        contreciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrecienteActionPerformed(evt);
            }
        });

        contotal.setText("0.0");
        contotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contotalActionPerformed(evt);
            }
        });

        jLabel4.setText("Cuentarrevoluciones");

        rpm.setText("0.0");
        rpm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rpmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(velocimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(contreciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(rpm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(232, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(velocimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contreciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rpm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void velocimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_velocimetroActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_velocimetroActionPerformed

    private void contrecienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrecienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contrecienteActionPerformed

    private void rpmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rpmActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_rpmActionPerformed

    private void contotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contotalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contotal;
    private javax.swing.JTextField contreciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField rpm;
    private javax.swing.JTextField velocimetro;
    // End of variables declaration//GEN-END:variables
}
