/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneodetenis.vistas.Partido;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import torneodetenis.control.EstadioData;
import torneodetenis.control.PartidoData;
import torneodetenis.control.RankingData;
import torneodetenis.control.TorneoData;
import torneodetenis.modelo.Conexion;
import torneodetenis.modelo.Estadio;
import torneodetenis.modelo.Jugador;
import torneodetenis.modelo.Partido;
import torneodetenis.modelo.Torneo;

/**
 *
 * @author Santiago
 */
public class vistaComenzarPartido extends javax.swing.JInternalFrame {

    /**
     * Creates new form vistaComenzarPartido
     */
    public vistaComenzarPartido() {
        initComponents();
        jcTorneo.removeAllItems();
        jcJugador1.removeAllItems();
        jcJugador2.removeAllItems();
        jcEstadio.removeAllItems();
        agregarItemTorneo();
        agregarItemJugador1();
        agregarItemJugador2();
        agregarItemEstadio();
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
        jPanel1 = new javax.swing.JPanel();
        jbBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jtID = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jcTorneo = new javax.swing.JComboBox<>();
        jcEstadio = new javax.swing.JComboBox<>();
        jcJugador1 = new javax.swing.JComboBox<>();
        jcJugador2 = new javax.swing.JComboBox<>();
        jdFecha = new com.toedter.calendar.JDateChooser();
        jtHoras = new javax.swing.JTextField();
        jtMinutos = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jtEstado = new javax.swing.JTextField();
        jtTorneo = new javax.swing.JTextField();
        jtJugador = new javax.swing.JTextField();
        jtJugador2 = new javax.swing.JTextField();
        jtEstadio = new javax.swing.JTextField();
        jbComenzar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Editar/Comenzar Partido");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jbBuscar.setText("Buscar");
        jbBuscar.setEnabled(false);
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("ID Partido");

        jtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtIDKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtIDKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbBuscar)
                    .addComponent(jLabel2)
                    .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setText("Torneo");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("Estadio");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setText("Hora");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setText("Fecha");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setText("Jugador 2");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setText("Minutos");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setText("Jugador 1");

        jcTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcTorneoActionPerformed(evt);
            }
        });

        jtHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtHorasActionPerformed(evt);
            }
        });
        jtHoras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtHorasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtHorasKeyTyped(evt);
            }
        });

        jtMinutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtMinutosActionPerformed(evt);
            }
        });
        jtMinutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtMinutosKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtMinutosKeyTyped(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel24.setText("Estado");

        jtEstado.setEditable(false);

        jtTorneo.setEditable(false);

        jtJugador.setEditable(false);

        jtJugador2.setEditable(false);

        jtEstadio.setEditable(false);
        jtEstadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEstadioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel21)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jdFecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                        .addComponent(jtHoras, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtJugador, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtMinutos, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jtEstadio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(jtJugador2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                        .addComponent(jtEstado, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtTorneo, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcJugador1, 0, 91, Short.MAX_VALUE)
                    .addComponent(jcEstadio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcJugador2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcTorneo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(105, 105, 105))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jtTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jtEstadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcEstadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20))
                    .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jtHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jtMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jtJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jtJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        jbComenzar.setText("Comenzar");
        jbComenzar.setEnabled(false);
        jbComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbComenzarActionPerformed(evt);
            }
        });

        jbEditar.setText("Editar");
        jbEditar.setEnabled(false);
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbBorrar.setText("Borrar");
        jbBorrar.setEnabled(false);
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(167, 167, 167))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbBorrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbComenzar)
                                .addContainerGap())))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbComenzar)
                    .addComponent(jbEditar)
                    .addComponent(jbBorrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtHorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtHorasActionPerformed

    private void jtMinutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtMinutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtMinutosActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
        try{
            Conexion conexion = new Conexion();
            PartidoData pd = new PartidoData(conexion);
            Partido p = pd.buscarPartido(Integer.parseInt(jtID.getText()));
            
            int anio = p.getFechayhora().getYear();
            int mes= p.getFechayhora().getMonthValue();
            int dia = p.getFechayhora().getDayOfMonth();
            int hora = p.getFechayhora().getHour();
            int minuto = p.getFechayhora().getMinute();
            
            LocalDate local = LocalDate.of(anio, mes, dia);
            
            jtTorneo.setText(p.getTorneo().getNombre_torneo());
            jtEstadio.setText(p.getEstadio().getCiudad());
            jtJugador.setText(p.getJugador1().toString());
            jtJugador2.setText(p.getJugador2().toString());
            jtHoras.setText(String.valueOf(hora));
            jtMinutos.setText(String.valueOf(minuto));
            jdFecha.setDate(java.sql.Date.valueOf(local));
            jtEstado.setText(p.getEstado());
            
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Error en la conexion " + ex);
        }catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Su elemento no existe " + ex);
        }
        activarBotonGuardar();
        activarBotonBuscar();
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jtEstadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtEstadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtEstadioActionPerformed

    private void jcTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcTorneoActionPerformed
        // TODO add your handling code here:
        jcJugador1.removeAllItems();
        jcJugador2.removeAllItems();
        agregarItemJugador1();
        agregarItemJugador2();
    }//GEN-LAST:event_jcTorneoActionPerformed

    private void jbComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbComenzarActionPerformed
        // TODO add your handling code here:
        try{
            Conexion conexion = new Conexion();
            PartidoData pd = new PartidoData(conexion);
            Partido partido = pd.buscarPartido(Integer.parseInt(jtID.getText()));
          
            if("Terminado".equals(partido.getEstado())){
                JOptionPane.showMessageDialog(null, "Su partido ya termino");
            }else{
                pd.comenzarPartido(partido);
            }
            
            
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Error en la conexion " + ex);
        }
    }//GEN-LAST:event_jbComenzarActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        // TODO add your handling code here:
        try{
            Conexion conexion = new Conexion();
            PartidoData pd = new PartidoData(conexion);
            Torneo t = (Torneo) jcTorneo.getSelectedItem();
            Estadio e = (Estadio) jcEstadio.getSelectedItem();
            Jugador j1 = (Jugador) jcJugador1.getSelectedItem();
            Jugador j2 = (Jugador) jcJugador2.getSelectedItem();
            
            int horas = Integer.parseInt(jtHoras.getText());
            int minutos = Integer.parseInt(jtMinutos.getText());
            
            Date date = jdFecha.getDate();
            LocalDate localda = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            
            LocalDateTime local = LocalDateTime.of(localda, LocalTime.of(horas, minutos));
            Partido p = new Partido(Integer.parseInt(jtID.getText()),t, e, local, j1, j2, jtEstado.getText(), "0-0 0-0 0-0");
            
            pd.actualizarPartido(p);
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Error en la conexion " + ex);
        }
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        // TODO add your handling code here:
        try{
            Conexion conexion = new Conexion();
            PartidoData pd = new PartidoData(conexion);
            pd.borrarPartido(Integer.parseInt(jtID.getText()));
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Error en la conexion " + ex);
        }
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jtHorasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtHorasKeyReleased
        // TODO add your handling code here:
        activarBotonGuardar();
    }//GEN-LAST:event_jtHorasKeyReleased

    private void jtMinutosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtMinutosKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if(caracter < '0' || caracter > '9'){
            evt.consume();
        }
    }//GEN-LAST:event_jtMinutosKeyTyped

    private void jtMinutosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtMinutosKeyReleased
        // TODO add your handling code here:
        activarBotonGuardar();
    }//GEN-LAST:event_jtMinutosKeyReleased

    private void jtIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIDKeyReleased
        // TODO add your handling code here:
        activarBotonGuardar();
        activarBotonBuscar();
    }//GEN-LAST:event_jtIDKeyReleased

    private void jtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIDKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if(caracter < '0' || caracter > '9'){
            evt.consume();
        }
    }//GEN-LAST:event_jtIDKeyTyped

    private void jtHorasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtHorasKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if(caracter < '0' || caracter > '9'){
            evt.consume();
        }
    }//GEN-LAST:event_jtHorasKeyTyped
    
    private void agregarItemTorneo(){
        try{
            Conexion conexion = new Conexion();
            TorneoData td = new TorneoData(conexion);
            
            ArrayList<Torneo> torneos = (ArrayList<Torneo>) td.obtenerTorneos();
            
            for(int i = 0; i < torneos.size(); i++){
                jcTorneo.addItem(torneos.get(i));
            }
            
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Error en la conexion " + ex);
        }
    }
    
    private void agregarItemJugador1(){
        try{
            Conexion conexion = new Conexion();
            RankingData rd = new RankingData(conexion);
            Torneo t = (Torneo) jcTorneo.getSelectedItem();
            ArrayList<Jugador> jugadores = (ArrayList<Jugador>) rd.obtenerJugadoresInscriptos(t.getId_torneo());
        
            for(int i = 0; i < jugadores.size(); i++){
                jcJugador1.addItem(jugadores.get(i));
            }
        
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Error en la conexion " + ex);
        }     
    }
    
    private void agregarItemJugador2(){
        try{
            Conexion conexion = new Conexion();
            RankingData rd = new RankingData(conexion);
            Torneo t = (Torneo) jcTorneo.getSelectedItem();
            ArrayList<Jugador> jugadores = (ArrayList<Jugador>) rd.obtenerJugadoresInscriptos(t.getId_torneo());
        
            for(int i = 0; i < jugadores.size(); i++){
                jcJugador2.addItem(jugadores.get(i));
            }
        
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Error en la conexion " + ex);
        }     
    }
    
    private void agregarItemEstadio(){
        try{
            Conexion conexion = new Conexion();
            EstadioData rd = new EstadioData(conexion);
            ArrayList<Estadio> jugadores = (ArrayList<Estadio>) rd.obtenerEstadios();
        
            for(int i = 0; i < jugadores.size(); i++){
                jcEstadio.addItem(jugadores.get(i));
            }
        
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Error en la conexion " + ex);
        }     
    }
    
    
    
    private void activarBotonGuardar(){
       if(jtID.getText().isEmpty() || jtHoras.getText().isEmpty() || jtMinutos.getText().isEmpty()){
            jbBorrar.setEnabled(false);
            jbComenzar.setEnabled(false);
            jbEditar.setEnabled(false);
        }else{
            jbBorrar.setEnabled(true);
            jbComenzar.setEnabled(true);
            jbEditar.setEnabled(true);
        }
    }
    
    private void activarBotonBuscar(){
       if(jtID.getText().isEmpty()){
            jbBuscar.setEnabled(false);
        }else{
            jbBuscar.setEnabled(true);
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbComenzar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JComboBox<Estadio> jcEstadio;
    private javax.swing.JComboBox<Jugador> jcJugador1;
    private javax.swing.JComboBox<Jugador> jcJugador2;
    private javax.swing.JComboBox<Torneo> jcTorneo;
    private com.toedter.calendar.JDateChooser jdFecha;
    private javax.swing.JTextField jtEstadio;
    private javax.swing.JTextField jtEstado;
    private javax.swing.JTextField jtHoras;
    private javax.swing.JTextField jtID;
    private javax.swing.JTextField jtJugador;
    private javax.swing.JTextField jtJugador2;
    private javax.swing.JTextField jtMinutos;
    private javax.swing.JTextField jtTorneo;
    // End of variables declaration//GEN-END:variables
}
