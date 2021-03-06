/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneodetenis.vistas.Estadio;

import javax.swing.JOptionPane;
import torneodetenis.control.EstadioData;
import torneodetenis.modelo.Conexion;
import torneodetenis.modelo.Estadio;

/**
 *
 * @author Martin
 */
public class vistaAgregarEstadio extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaAgregarJugador
     */
    public vistaAgregarEstadio() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jAgregarEstadio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jtNrident = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtDireccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtEstado = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jcCategoria = new javax.swing.JComboBox<>();
        jsCantidad = new javax.swing.JSpinner();
        jsAncho = new javax.swing.JSpinner();
        jsLargo = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jtCiudad1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jScrollPane1.setViewportView(jEditorPane1);

        setClosable(true);

        jAgregarEstadio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jAgregarEstadio.setText("Nuevo");
        jAgregarEstadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgregarEstadioActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Agregar Estadio");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtNrident.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jtNrident.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtNridentKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNridentKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Nr Identificacion");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Direccion");

        jtDireccion.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtDireccionKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Estado");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Largo");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Ancho");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Cantidad Espectadores");

        jtEstado.setEditable(false);
        jtEstado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtEstado.setText("Sin Usar");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Categoria");

        jcCategoria.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jcCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cemento", "Cesped", "Ladrillo" }));
        jcCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCategoriaActionPerformed(evt);
            }
        });

        jsCantidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jsCantidad.setModel(new javax.swing.SpinnerNumberModel(2000, 2000, 20000000, 1));
        jsCantidad.setMaximumSize(new java.awt.Dimension(20000000, 20000000));

        jsAncho.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jsAncho.setModel(new javax.swing.SpinnerNumberModel(1.0d, 1.0d, null, 1.0d));
        jsAncho.setMaximumSize(new java.awt.Dimension(20000000, 20000000));

        jsLargo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jsLargo.setModel(new javax.swing.SpinnerNumberModel(1.0d, 1.0d, null, 1.0d));
        jsLargo.setMaximumSize(new java.awt.Dimension(20000000, 20000000));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Ciudad");

        jtCiudad1.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jtCiudad1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtCiudad1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCiudad1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jsCantidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtEstado, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtNrident, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtDireccion, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jsAncho, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jsLargo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtCiudad1, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(100, 100, 100))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtNrident, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtCiudad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jsLargo, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jsAncho, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jsCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jcCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Agregar");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jAgregarEstadio, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(236, 236, 236)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAgregarEstadio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcCategoriaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            Conexion conexion = new Conexion();
            EstadioData ed = new EstadioData(conexion);
            Estadio e1 = new Estadio(Integer.parseInt(jtNrident.getText()), jtCiudad1.getText(), jtDireccion.getText(), jtEstado.getText(), String.valueOf(jcCategoria.getSelectedItem()), (double) jsLargo.getValue(), (double) jsAncho.getValue(), (int) jsCantidad.getValue());
            
            ed.agregarEstadio(e1);
            
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Error en la conexion " + ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jAgregarEstadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgregarEstadioActionPerformed
        // TODO add your handling code here:
        jtNrident.setText("");
        jtCiudad1.setText("");
        jtDireccion.setText("");
        jtEstado.setText("");
        jsLargo.setValue(1);
        jsAncho.setValue(1);
        jsCantidad.setValue(2000);
        jcCategoria.setSelectedIndex(1);
        activarBotonGuardar();
    }//GEN-LAST:event_jAgregarEstadioActionPerformed

    private void jtNridentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNridentKeyReleased
        // TODO add your handling code here:
        activarBotonGuardar();
    }//GEN-LAST:event_jtNridentKeyReleased

    private void jtCiudad1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCiudad1KeyReleased
        // TODO add your handling code here:
        activarBotonGuardar();
    }//GEN-LAST:event_jtCiudad1KeyReleased

    private void jtDireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDireccionKeyReleased
        // TODO add your handling code here:
        activarBotonGuardar();
    }//GEN-LAST:event_jtDireccionKeyReleased

    private void jtNridentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNridentKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if(caracter < '0' || caracter > '9'){
            evt.consume();
        }
    }//GEN-LAST:event_jtNridentKeyTyped

    private void jtCiudad1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCiudad1KeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if((caracter < 'a' || caracter > 'z') && (caracter < 'A' || caracter > 'Z')){
            evt.consume();
        }
    }//GEN-LAST:event_jtCiudad1KeyTyped
    
    private void activarBotonGuardar(){
       if(jtNrident.getText().isEmpty() || jtCiudad1.getText().isEmpty() || jtDireccion.getText().isEmpty() || jtEstado.getText().isEmpty()){
            jButton1.setEnabled(false);
        }else{
            jButton1.setEnabled(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAgregarEstadio;
    private javax.swing.JButton jButton1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcCategoria;
    private javax.swing.JSpinner jsAncho;
    private javax.swing.JSpinner jsCantidad;
    private javax.swing.JSpinner jsLargo;
    private javax.swing.JTextField jtCiudad1;
    private javax.swing.JTextField jtDireccion;
    private javax.swing.JTextField jtEstado;
    private javax.swing.JTextField jtNrident;
    // End of variables declaration//GEN-END:variables
}
