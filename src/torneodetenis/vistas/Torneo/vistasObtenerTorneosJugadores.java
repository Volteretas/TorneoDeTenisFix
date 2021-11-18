/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneodetenis.vistas.Torneo;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import torneodetenis.control.JugadorData;
import torneodetenis.control.RankingData;
import torneodetenis.control.TorneoData;
import torneodetenis.modelo.Conexion;
import torneodetenis.modelo.Jugador;
import torneodetenis.modelo.Torneo;

/**
 *
 * @author Santiago
 */
public class vistasObtenerTorneosJugadores extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo;
    /**
     * Creates new form vistasObtenerTorneosJugadores
     */
    public vistasObtenerTorneosJugadores() {
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
        jcJugadores = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTorneos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Torneos");

        jcJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcJugadoresActionPerformed(evt);
            }
        });

        jtTorneos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtTorneos);

        jLabel2.setText("Jugador");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(33, 33, 33)
                        .addComponent(jcJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(235, 235, 235))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcJugadoresActionPerformed
        // TODO add your handling code here:
        limpiarTabla();
        llenarTabla();
    }//GEN-LAST:event_jcJugadoresActionPerformed
    
    private void llenarItems(){
        try{
            Conexion conexion = new Conexion();
            JugadorData jd = new JugadorData(conexion);
        
            ArrayList<Jugador> jugadores = (ArrayList<Jugador>) jd.obtenerJugadores();
        
            for(Jugador j : jugadores){
                jcJugadores.addItem(j);
            }
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Error en la conexion " + ex);
        }
    }
    
    private void armarCabecera(){
        ArrayList<Object> titulos = new ArrayList<>();
        
        titulos.add("Torneo ID");
        titulos.add("Nombre");
        titulos.add("Fecha Inicio");
        titulos.add("Fecha Fin");
        
        for(Object titulo:titulos){
            modelo.addColumn(titulo);
        }
        jtTorneos.setModel(modelo);
    }
    
    private void limpiarTabla(){
        int filas=modelo.getRowCount()-1;
        for(int i=filas;i>=0;i--){
            modelo.removeRow(i);
        }
    }
    
    private void llenarTabla(){
        
        try{
            Conexion conexion = new Conexion();
            JugadorData jd = new JugadorData(conexion);
            RankingData rd = new RankingData(conexion);
        
            Jugador j = (Jugador) jcJugadores.getSelectedItem();
            ArrayList<Torneo> torneos = (ArrayList<Torneo>) rd.obtenerTorneosJugador(j.getId_jugador());
        
            for(Torneo t : torneos){
            modelo.addRow(new Object[]{t.getId_torneo(), t.getNombre_torneo(), t.getFecha_inicio().toString(), t.getFecha_fin().toString()});
            }
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Error en la conexion " + ex);
        }catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Error en la conexion " + ex);
        }
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Jugador> jcJugadores;
    private javax.swing.JTable jtTorneos;
    // End of variables declaration//GEN-END:variables
}
