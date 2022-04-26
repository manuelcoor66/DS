/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import Sesion3.CadenaDeFiltros;
import Sesion3.SCACV;
import java.awt.Color;


/**
 *
 * @author Manuel
 */
public class SCACVGUI extends javax.swing.JPanel {
    private Boolean ON=false;
    private int estadoSCACV = 3; 
    private CadenaDeFiltros scacv= new CadenaDeFiltros();
    /**
     * Creates new form SCACV
     */
    public SCACVGUI() {
        initComponents();
    }
    

    public int getEstadoSCACV(){
        return estadoSCACV;
    }
    
    public void actualizarVista(double velocidadAlmacenada, double velocidadActual){
        
        double vel = 2.0*3.1416*0.15*velocidadActual*(60.0/1000.0);
        
        
        velAlmacenada.setText(String.valueOf(2.0*3.1416*0.15*velocidadAlmacenada*(60.0/1000.0)));
        
        
        radial2.setValueAnimated(vel);
        
        
        
        
        repaint();
        revalidate();
        
    }
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Acelerar = new javax.swing.JToggleButton();
        Mantener = new javax.swing.JToggleButton();
        Reiniciar = new javax.swing.JToggleButton();
        Apagar = new javax.swing.JToggleButton();
        EstadoSCACV = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        velAlmacenada = new javax.swing.JTextField();
        radial2 = new eu.hansolo.steelseries.gauges.Radial();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        Acelerar.setText("Acelerar");
        Acelerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcelerarActionPerformed(evt);
            }
        });

        Mantener.setText("Mantener");
        Mantener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MantenerActionPerformed(evt);
            }
        });

        Reiniciar.setText("Reiniciar");
        Reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReiniciarActionPerformed(evt);
            }
        });

        Apagar.setText("Apagar");
        Apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApagarActionPerformed(evt);
            }
        });

        EstadoSCACV.setText("Apagado");
        EstadoSCACV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadoSCACVActionPerformed(evt);
            }
        });

        jLabel1.setText("Velocidad Almacenada:");

        velAlmacenada.setText("0.0");
        velAlmacenada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                velAlmacenadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(EstadoSCACV, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                .addGap(225, 225, 225))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Mantener, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Acelerar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Reiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radial2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(velAlmacenada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(EstadoSCACV, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(Acelerar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Mantener)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Reiniciar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Apagar))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radial2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(velAlmacenada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void EstadoSCACVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadoSCACVActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_EstadoSCACVActionPerformed

    private void ReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReiniciarActionPerformed
        // TODO add your handling code here:
        
        
        if (Reiniciar.isSelected()){    
            if (ON == true){
                EstadoSCACV.setText("Encendido ---  Reiniciando");
                EstadoSCACV.setForeground(Color.green);
                Reiniciar.setText("Reiniciar");
                Reiniciar.setForeground(Color.red);
                estadoSCACV = 2;
                
            }
            else{
                Reiniciar.setText("Reiniciar");
                Reiniciar.setForeground(Color.black);
            }
        }
    }//GEN-LAST:event_ReiniciarActionPerformed

    private void AcelerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcelerarActionPerformed
        // TODO add your handling code here:
         
            
                if (Acelerar.isSelected()){
                    
                    ON=true;
                    EstadoSCACV.setText("Encendido ---  Acelerando");
                    EstadoSCACV.setForeground(Color.green);
                    Acelerar.setText("Acelerar");
                    Acelerar.setForeground(Color.red);
                    estadoSCACV=0;
                    //scacv.setEstadoSCACV(estadoSCACV);
                    
                }else{
                   
                    Acelerar.setText("Acelerar");
                    Acelerar.setForeground(Color.black);
                    
                }
            
        
    }//GEN-LAST:event_AcelerarActionPerformed

    private void MantenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MantenerActionPerformed
        // TODO add your handling code here:
        if (Mantener.isSelected()){
            if(ON == true){
                 EstadoSCACV.setText("Encendido ---  Manteniendo");
                 EstadoSCACV.setForeground(Color.green);
                 Mantener.setText("mantener");
                 Mantener.setForeground(Color.red);
                 estadoSCACV=1;
                 // scacv.setEstadoSCACV(estadoSCACV);
            } 
        }else{
            Mantener.setText("mantener");
            Mantener.setForeground(Color.black);
        
        }
    }//GEN-LAST:event_MantenerActionPerformed

    private void velAlmacenadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_velAlmacenadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_velAlmacenadaActionPerformed

    private void ApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApagarActionPerformed
        // TODO add your handling code here:
        if (Apagar.isSelected()){
            ON=false;
            EstadoSCACV.setText("Apagado");
            EstadoSCACV.setForeground(Color.black);
            Apagar.setText("Apagar");
            Apagar.setForeground(Color.black);
            estadoSCACV=3;
        
        
        }
    }//GEN-LAST:event_ApagarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Acelerar;
    private javax.swing.JToggleButton Apagar;
    private javax.swing.JTextField EstadoSCACV;
    private javax.swing.JToggleButton Mantener;
    private javax.swing.JToggleButton Reiniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private eu.hansolo.steelseries.gauges.Radial radial2;
    private javax.swing.JTextField velAlmacenada;
    // End of variables declaration//GEN-END:variables
}
