/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneodetenis.vistas;

import com.formdev.flatlaf.FlatDarkLaf;
import torneodetenis.vistas.Estadio.vistaAgregarEstadio;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import torneodetenis.vistas.Estadio.vistaBuscarEstadio;
import torneodetenis.vistas.Estadio.vistaObtenerEstadios;
import torneodetenis.vistas.Jugador.vistaAgregarJugador;
import torneodetenis.vistas.Jugador.vistaBuscarJugador;
import torneodetenis.vistas.Jugador.vistaObtenerJugadores;
import torneodetenis.vistas.Partido.vistaAgregarPartido;
import torneodetenis.vistas.Partido.vistaComenzarPartido;
import torneodetenis.vistas.Partido.vistaTerminarPartido;
import torneodetenis.vistas.Partido.vistasObtenerPartidos;
import torneodetenis.vistas.Patrocinador.vistaAgregarPatrocinador;
import torneodetenis.vistas.Patrocinador.vistaBuscarPatrocinador;
import torneodetenis.vistas.Patrocinador.vistaObtenerPatrocinadores;
import torneodetenis.vistas.Patrocinio.vistaObtenerPatrocinios;
import torneodetenis.vistas.Patrocinio.vistaPatrocinioDeJugador;
import torneodetenis.vistas.Patrocinio.vistasAgregarPatrocinio;
import torneodetenis.vistas.Ranking.vistaObtenerRanking;
import torneodetenis.vistas.Ranking.vistaObtenerRankingTrabajo;
import torneodetenis.vistas.Torneo.vistaAgregarTorneo;
import torneodetenis.vistas.Torneo.vistaBuscarTorneo;
import torneodetenis.vistas.Torneo.vistaInscribirJugador;
import torneodetenis.vistas.Torneo.vistarObtenerTorneos;
import torneodetenis.vistas.Torneo.vistasObtenerJugadoresTorneo;
import torneodetenis.vistas.Torneo.vistasObtenerTorneosJugadores;

/**
 *
 * @author Martin
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        try{
        UIManager.setLookAndFeel(new FlatDarkLaf());
        }catch(Exception ex){
        ex.printStackTrace();
        }
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        try{
            URL url = new URL("https://i.imgur.com/FWtE5BZ.png");
            BufferedImage c = ImageIO.read(url);
            ImageIcon icon = new ImageIcon(c);
            Image image = icon.getImage();
            Escritorio = new javax.swing.JDesktopPane(){

                public void paintComponent(Graphics g){
                    g.drawImage(image,0,0,getWidth(),getHeight(),this);
                }

            };
        }catch(IOException ex){
            System.out.println(ex);
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        MostrarRanking = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 767, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 532, Short.MAX_VALUE)
        );

        jMenu2.setText("Estadio");

        jMenuItem1.setText("Agregar Estadio");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem4.setText("Editar Estadio");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Mostrar todos los estadios");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Jugador");

        jMenuItem6.setText("Agregar Jugador");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem7.setText("Editar Jugador");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem10.setText("Mostrar todos los Jugadores");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Partido");

        jMenuItem11.setText("Agregar Partido");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        jMenuItem9.setText("Mostrar todos los Partidos");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem12.setText("Comenzar Partido");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuItem13.setText("Terminar Partido");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem13);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Patrocinador");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem19.setText("Agregar Patrocinador");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem19);

        jMenuItem20.setText("Editar Patrocinador");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem20);

        jMenuItem23.setText("Mostrar todos los Patrocinadores");
        jMenuItem23.setToolTipText("");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem23);

        jMenuItem2.setText("Agregar Patrocinio");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuItem3.setText("Mostrar patrocinadores de jugador");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuBar1.add(jMenu4);

        jMenu6.setText("Torneo");

        jMenuItem29.setText("Agregar Torneo");
        jMenuItem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem29ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem29);

        jMenuItem30.setText("Editar Torneo");
        jMenuItem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem30ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem30);

        jMenuItem33.setText("Mostrar todos los Torneos");
        jMenuItem33.setToolTipText("");
        jMenuItem33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem33ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem33);

        jMenuItem8.setText("Inscribir Jugador");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem8);

        jMenuItem14.setText("Obtener Jugadores");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem14);

        jMenuItem15.setText("Obtener Torneos");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem15);

        jMenuBar1.add(jMenu6);

        jMenu5.setText("Ranking");

        MostrarRanking.setText("Ranking");
        MostrarRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarRankingActionPerformed(evt);
            }
        });
        jMenu5.add(MostrarRanking);

        jMenuItem16.setText("Ranking Torneo");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem16);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        vistaAgregarEstadio v4 =new vistaAgregarEstadio();
        v4.setVisible(true);
        Escritorio.add(v4);
        Escritorio.moveToFront(v4);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        vistaBuscarEstadio vbe = new vistaBuscarEstadio();
        
        Dimension escritorioSize = Escritorio.getSize();
        Dimension vfmSize = vbe.getSize();
        
        vbe.setLocation((escritorioSize.width - vfmSize.width)/2, (escritorioSize.height - vfmSize.height)/2);
        
        vbe.setVisible(true);
        Escritorio.add(vbe);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        vistaObtenerEstadios voe = new vistaObtenerEstadios();
        
        Dimension escritorioSize = Escritorio.getSize();
        Dimension vfmSize = voe.getSize();
        
        voe.setLocation((escritorioSize.width - vfmSize.width)/2, (escritorioSize.height - vfmSize.height)/2);
        
        voe.setVisible(true);
        Escritorio.add(voe);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        vistaAgregarPatrocinador vap = new vistaAgregarPatrocinador();
        
        Dimension escritorioSize = Escritorio.getSize();
        Dimension vfmSize = vap.getSize();
        
        vap.setLocation((escritorioSize.width - vfmSize.width)/2, (escritorioSize.height - vfmSize.height)/2);
        
        vap.setVisible(true);
        Escritorio.add(vap);
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        vistaBuscarPatrocinador vbp = new vistaBuscarPatrocinador();
        
        Dimension escritorioSize = Escritorio.getSize();
        Dimension vfmSize = vbp.getSize();
        
        vbp.setLocation((escritorioSize.width - vfmSize.width)/2, (escritorioSize.height - vfmSize.height)/2);
        
        vbp.setVisible(true);
        Escritorio.add(vbp);
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        vistaObtenerPatrocinadores vop = new vistaObtenerPatrocinadores();
        
        Dimension escritorioSize = Escritorio.getSize();
        Dimension vfmSize = vop.getSize();
        
        vop.setLocation((escritorioSize.width - vfmSize.width)/2, (escritorioSize.height - vfmSize.height)/2);
        
        vop.setVisible(true);
        Escritorio.add(vop);
    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jMenuItem30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem30ActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        vistaBuscarTorneo vbt = new vistaBuscarTorneo();
        
        Dimension escritorioSize = Escritorio.getSize();
        Dimension vfmSize = vbt.getSize();
        
        vbt.setLocation((escritorioSize.width - vfmSize.width)/2, (escritorioSize.height - vfmSize.height)/2);
        
        vbt.setVisible(true);
        Escritorio.add(vbt);
    }//GEN-LAST:event_jMenuItem30ActionPerformed

    private void jMenuItem29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem29ActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        vistaAgregarTorneo vat = new vistaAgregarTorneo();
        
        Dimension escritorioSize = Escritorio.getSize();
        Dimension vfmSize = vat.getSize();
        
        vat.setLocation((escritorioSize.width - vfmSize.width)/2, (escritorioSize.height - vfmSize.height)/2);
        
        vat.setVisible(true);
        Escritorio.add(vat);
    }//GEN-LAST:event_jMenuItem29ActionPerformed

    private void jMenuItem33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem33ActionPerformed
        // TODO add your handling code here:Escritorio.removeAll();
        Escritorio.repaint();
        vistarObtenerTorneos vot = new vistarObtenerTorneos();
        
        Dimension escritorioSize = Escritorio.getSize();
        Dimension vfmSize = vot.getSize();
        
        vot.setLocation((escritorioSize.width - vfmSize.width)/2, (escritorioSize.height - vfmSize.height)/2);  
        vot.setVisible(true);
        Escritorio.add(vot);
        
    }//GEN-LAST:event_jMenuItem33ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        Escritorio.repaint();
        vistaAgregarJugador vaj = new vistaAgregarJugador();
        
        Dimension escritorioSize = Escritorio.getSize();
        Dimension vfmSize = vaj.getSize();
        
        vaj.setLocation((escritorioSize.width - vfmSize.width)/2, (escritorioSize.height - vfmSize.height)/2);  
        vaj.setVisible(true);
        Escritorio.add(vaj);
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        Escritorio.repaint();
        vistaBuscarJugador vbj = new vistaBuscarJugador();
        
        Dimension escritorioSize = Escritorio.getSize();
        Dimension vfmSize = vbj.getSize();
        
        vbj.setLocation((escritorioSize.width - vfmSize.width)/2, (escritorioSize.height - vfmSize.height)/2);  
        vbj.setVisible(true);
        Escritorio.add(vbj);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        Escritorio.repaint();
        vistaObtenerJugadores voj = new vistaObtenerJugadores();
        
        Dimension escritorioSize = Escritorio.getSize();
        Dimension vfmSize = voj.getSize();
        
        voj.setLocation((escritorioSize.width - vfmSize.width)/2, (escritorioSize.height - vfmSize.height)/2);  
        voj.setVisible(true);
        Escritorio.add(voj);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        Escritorio.repaint();
        vistasAgregarPatrocinio vap = new vistasAgregarPatrocinio();
        
        Dimension escritorioSize = Escritorio.getSize();
        Dimension vfmSize = vap.getSize();
        
        vap.setLocation((escritorioSize.width - vfmSize.width)/2, (escritorioSize.height - vfmSize.height)/2);  
        vap.setVisible(true);
        Escritorio.add(vap);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        Escritorio.repaint();
        vistaAgregarPartido vap = new vistaAgregarPartido();
        
        Dimension escritorioSize = Escritorio.getSize();
        Dimension vfmSize = vap.getSize();
        
        vap.setLocation((escritorioSize.width - vfmSize.width)/2, (escritorioSize.height - vfmSize.height)/2);  
        vap.setVisible(true);
        Escritorio.add(vap);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        Escritorio.repaint();
        vistaInscribirJugador vij = new vistaInscribirJugador();
        
        Dimension escritorioSize = Escritorio.getSize();
        Dimension vfmSize = vij.getSize();
        
        vij.setLocation((escritorioSize.width - vfmSize.width)/2, (escritorioSize.height - vfmSize.height)/2);  
        vij.setVisible(true);
        Escritorio.add(vij);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        Escritorio.repaint();
        vistasObtenerPartidos vop = new vistasObtenerPartidos();
        
        Dimension escritorioSize = Escritorio.getSize();
        Dimension vfmSize = vop.getSize();
        
        vop.setLocation((escritorioSize.width - vfmSize.width)/2, (escritorioSize.height - vfmSize.height)/2);  
        vop.setVisible(true);
        Escritorio.add(vop);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        Escritorio.repaint();
        vistaComenzarPartido vcp = new vistaComenzarPartido();
        
        Dimension escritorioSize = Escritorio.getSize();
        Dimension vfmSize = vcp.getSize();
        
        vcp.setLocation((escritorioSize.width - vfmSize.width)/2, (escritorioSize.height - vfmSize.height)/2);  
        vcp.setVisible(true);
        Escritorio.add(vcp);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        Escritorio.repaint();
        vistaTerminarPartido vtp = new vistaTerminarPartido();
        
        Dimension escritorioSize = Escritorio.getSize();
        Dimension vfmSize = vtp.getSize();
        
        vtp.setLocation((escritorioSize.width - vfmSize.width)/2, (escritorioSize.height - vfmSize.height)/2);  
        vtp.setVisible(true);
        Escritorio.add(vtp);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        Escritorio.repaint();
        vistaPatrocinioDeJugador vmpj = new vistaPatrocinioDeJugador();
        
        Dimension escritorioSize = Escritorio.getSize();
        Dimension vfmSize = vmpj.getSize();
        
        vmpj.setLocation((escritorioSize.width - vfmSize.width)/2, (escritorioSize.height - vfmSize.height)/2);  
        vmpj.setVisible(true);
        Escritorio.add(vmpj);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void MostrarRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarRankingActionPerformed
        // TODO add your handling code here:
        Escritorio.repaint();
        vistaObtenerRanking vor = new vistaObtenerRanking();
        
        Dimension escritorioSize = Escritorio.getSize();
        Dimension vfmSize = vor.getSize();
        
        vor.setLocation((escritorioSize.width - vfmSize.width)/2, (escritorioSize.height - vfmSize.height)/2);  
        vor.setVisible(true);
        Escritorio.add(vor);
    }//GEN-LAST:event_MostrarRankingActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        Escritorio.repaint();
        vistasObtenerJugadoresTorneo vojt = new vistasObtenerJugadoresTorneo();
        
        Dimension escritorioSize = Escritorio.getSize();
        Dimension vfmSize = vojt.getSize();
        
        vojt.setLocation((escritorioSize.width - vfmSize.width)/2, (escritorioSize.height - vfmSize.height)/2);  
        vojt.setVisible(true);
        Escritorio.add(vojt);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
        Escritorio.repaint();
        vistasObtenerTorneosJugadores votj = new vistasObtenerTorneosJugadores();
        
        Dimension escritorioSize = Escritorio.getSize();
        Dimension vfmSize = votj.getSize();
        
        votj.setLocation((escritorioSize.width - vfmSize.width)/2, (escritorioSize.height - vfmSize.height)/2);  
        votj.setVisible(true);
        Escritorio.add(votj);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        // TODO add your handling code here:
        Escritorio.repaint();
        vistaObtenerRankingTrabajo vort = new vistaObtenerRankingTrabajo();
        
        Dimension escritorioSize = Escritorio.getSize();
        Dimension vfmSize = vort.getSize();
        
        vort.setLocation((escritorioSize.width - vfmSize.width)/2, (escritorioSize.height - vfmSize.height)/2);  
        vort.setVisible(true);
        Escritorio.add(vort);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenuItem MostrarRanking;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
