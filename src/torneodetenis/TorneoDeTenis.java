/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneodetenis;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import javax.swing.JOptionPane;
import torneodetenis.control.EstadioData;
import torneodetenis.control.JugadorData;
import torneodetenis.control.PartidoData;
import torneodetenis.control.PatrocinadorData;
import torneodetenis.control.PatrocinioData;
import torneodetenis.control.RankingData;
import torneodetenis.control.TorneoData;
import torneodetenis.modelo.Conexion;
import torneodetenis.modelo.Estadio;
import torneodetenis.modelo.Jugador;
import torneodetenis.modelo.Partido;
import torneodetenis.modelo.Patrocinador;
import torneodetenis.modelo.Patrocinio;
import torneodetenis.modelo.Ranking;
import torneodetenis.modelo.Torneo;

/**
 *5
 * @author Santiago
 */
public class TorneoDeTenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try{
            Conexion conexion = new Conexion();
            TorneoData td = new TorneoData(conexion);
            JugadorData jd = new JugadorData(conexion);
            EstadioData ed = new EstadioData(conexion);
            PartidoData pd = new PartidoData(conexion);
            PatrocinadorData patrocinador = new PatrocinadorData(conexion);
            PatrocinioData patrocinio = new PatrocinioData(conexion);
            Estadio es1 = ed.obtenerEstadio(2);        
            Jugador jugador = jd.obtenerJugador(1);
            Jugador j2 = jd.obtenerJugador(2);
            Torneo t1 = td.obtenerTorneo(2);
//            Patrocinador p1 = patrocinador.obtenerPatrocinador(1);
//            Patrocinio p2 = new Patrocinio(jugador, p1);
//            Torneo t1 = new Torneo("Torneo1", LocalDate.of(2021, 11, 17), LocalDate.of(2021, 11, 25));
//            Partido partido = new Partido(t1, es1, LocalDateTime.now(), jugador, j2, "DesUso", "0-0 0-0 0-0");
            
            
//            RankingData rd = new RankingData(conexion);
//            
//            Ranking r = rd.obtenerRanking(1);
//            
//            rd.sumarPuntos(r, 3);
            
              //System.out.println(patrocinio.obtenerPatrocinioJugador(5));
              System.out.println(patrocinador.obtenerPatrocinador(4));
              System.out.println(patrocinador.obtenerPatrocinador(5));      
                    
                    
//           Partido p1 = new Partido(t1, es1, LocalDateTime.now(), jugador, j2, "Por jugar", "0-0 0-0 0-0");
//           pd.agregarPartido(p1);
            
            //td.agregarTorneo(t1);
            //jd.agregarJugador(j2);
            //patrocinador.agregarPatrocinador(p1);
            //patrocinio.agregarPatrocinio(p2);
            //pd.actualizarPartido(partido);
            String date = "2021-11-17T18:54:52.316999";      
            System.out.println(LocalDateTime.of(LocalDate.MAX, LocalTime.of(0, 0)));
            
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Hay mi madre el bicho");
        }
    }
}