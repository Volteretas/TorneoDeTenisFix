/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneodetenis.vistas.Patrocinio;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import torneodetenis.control.JugadorData;
import torneodetenis.control.PatrocinioData;
import torneodetenis.modelo.Conexion;
import torneodetenis.modelo.Jugador;
import torneodetenis.modelo.Patrocinio;
/**
 *
 * @author Martin
 */
public class vistaPatrocinioDeJugador extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo;
    /**
     * Creates new form vistaPatrocinioDeJugador
     */
    public vistaPatrocinioDeJugador() {
        initComponents();
        this.modelo= new DefaultTableModel();
        armarCabecera();
        limpiarTabla();
        llenarItems();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jJugadores = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Patrocinio de Jugador");

        jJugadores.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jJugadoresActionPerformed(evt);
            }
        });

        jtTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtTabla.setEnabled(false);
        jScrollPane1.setViewportView(jtTabla);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Jugador");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addGap(155, 155, 155))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jJugadoresActionPerformed
        // TODO add your handling code here:
        limpiarTabla();
        llenarTabla();
    }//GEN-LAST:event_jJugadoresActionPerformed

    private void armarCabecera(){
        ArrayList<Object> titulos = new ArrayList<>();
        
        titulos.add("Patrocinio ID");
        titulos.add("Marca");
        titulos.add("Indumentaria");
        
        for(Object titulo:titulos){
            modelo.addColumn(titulo);
        }
        jtTabla.setModel(modelo);
    }
    
    private void limpiarTabla(){
        int filas=modelo.getRowCount()-1;
        for(int i=filas;i>=0;i--){
            modelo.removeRow(i);
        }
    }
    
    private void llenarItems(){
        try{
            Conexion conexion = new Conexion();
            JugadorData jd = new JugadorData(conexion);
        
            ArrayList<Jugador> jugadores = (ArrayList<Jugador>) jd.obtenerJugadores();
        
            for(Jugador u : jugadores){
            jJugadores.addItem(u);
            }
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Error en la conexion " + ex);
        }
    }
    
    private void llenarTabla(){
        
        try{
            Conexion conexion = new Conexion();
            JugadorData jd = new JugadorData(conexion);
            PatrocinioData pd = new PatrocinioData(conexion);
        
            Jugador j1 = (Jugador) jJugadores.getSelectedItem();
            ArrayList<Patrocinio> patrocinios = (ArrayList<Patrocinio>) pd.obtenerPatrociniosDeUnJugador(j1.getId_jugador());
        
            for(Patrocinio u : patrocinios){
            modelo.addRow(new Object[]{u.getPatrocinador().getId_patrocinador(), u.getPatrocinador().getMarca(), u.getPatrocinador().getIndumentaria()});
            }
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Error en la conexion " + ex);
        }catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Error en la conexion " + ex);
        }
        
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Jugador> jJugadores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtTabla;
    // End of variables declaration//GEN-END:variables
}
