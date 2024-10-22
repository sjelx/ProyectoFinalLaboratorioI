/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package VistasInternas;

import AccesoADatos.MesaData;
import Entidades.Mesa;
import javax.swing.JOptionPane;

/**
 *
 * @author matiSqui
 */
public class InternalMesas extends javax.swing.JInternalFrame {
    private MesaData meData = new MesaData();
    private Mesa mesaActual = null;
    
    
    /**
     * Creates new form InternalMesas
     */
    public InternalMesas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jtNumeroMesa = new javax.swing.JTextField();
        jtCapacidad = new javax.swing.JTextField();
        cbxEstado = new javax.swing.JCheckBox();
        btNuevo = new javax.swing.JButton();
        btGuardar = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        btBuscar = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        jLabel1.setText("Aca podras crear o modificar las mesas del salon");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/manejoMesas.PNG"))); // NOI18N

        jLabel4.setText("Numero de mesa:");

        jLabel5.setText("Capacidad:");

        jLabel6.setText("Estado:");
        jLabel6.setToolTipText("");

        cbxEstado.setText("Activo/Inactivo");

        btNuevo.setText("Nuevo");

        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtNumeroMesa)
                            .addComponent(jtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87)
                        .addComponent(btBuscar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btGuardar)
                        .addComponent(cbxEstado)))
                .addGap(63, 63, 63))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(btNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSalir)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtNumeroMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbxEstado))
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNuevo)
                    .addComponent(btGuardar)
                    .addComponent(btSalir))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed

        try{
        Integer numMesa = Integer.parseInt(jtNumeroMesa.getText());
        
        mesaActual = meData.buscarMesa(numMesa);
        
            if (mesaActual!= null) {
                
            jtCapacidad.setText(String.valueOf(mesaActual.getCapacidad()));
            cbxEstado.setSelected(mesaActual.isEstado());
            
            
            }
        
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(this,"Debe ingresar un numero valido");
        }

    }//GEN-LAST:event_btBuscarActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btSalirActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed

        try{
        
        Integer numMesa = Integer.parseInt(jtNumeroMesa.getText());
        Integer capMesa = Integer.parseInt(jtCapacidad.getText());
        boolean estadoSel = cbxEstado.isSelected();
        
            if (numMesa == null || capMesa == null) {
                
                JOptionPane.showMessageDialog(this, "No puede dejar campos vacios");
                return;
            }
        
            Mesa mesaN = null;
            
            if (mesaActual == null) {
                
                mesaN = new Mesa(numMesa, capMesa, estadoSel);
                meData.cargarMesa(mesaN);
            } else {
                
                mesaN.setNumeroMesa(numMesa);
                mesaN.setCapacidad(capMesa);
                mesaN.setEstado(estadoSel);
                
                //Modigicarmesa: 
            }
            
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "debe ingresar un numero de mesa valido");
        }


    }//GEN-LAST:event_btGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btNuevo;
    private javax.swing.JButton btSalir;
    private javax.swing.JCheckBox cbxEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jtCapacidad;
    private javax.swing.JTextField jtNumeroMesa;
    // End of variables declaration//GEN-END:variables
}