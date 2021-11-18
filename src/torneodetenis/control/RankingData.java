/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneodetenis.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import torneodetenis.modelo.Conexion;
import torneodetenis.modelo.Jugador;
import torneodetenis.modelo.Partido;
import torneodetenis.modelo.Ranking;

/**
 *
 * @author Santiago
 */
public class RankingData {
    private Connection con;
    private Conexion conexion;
    
    public RankingData(Conexion conexion) {
        try{
            this.conexion = conexion;
            con = conexion.getConexion();
        }catch (SQLException ex){
            System.out.println("Error en la conexion " + ex);
        }
    }
    
    public void inscribirTorneo(Ranking ran){
        String sql = "INSERT INTO `ranking`(`Id_Torneo`, `Id_Jugador`, `Puntaje`) VALUES (?,?,?);";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ran.getTorneo().getId_torneo());
            ps.setInt(2, ran.getJugador().getId_jugador());
            ps.setInt(3, 0);
            ps.executeUpdate();
            ps.close();
        }catch (SQLException ex){
            System.out.println("Error en la conexion " + ex);
        }
    }
    
    public Ranking obtenerRanking(int id){
        String sql = "SELECT * FROM `ranking` WHERE Id_Ranking = ?;";
        Ranking ran = null;
        try{
            TorneoData td = new TorneoData(conexion);
            JugadorData jd = new JugadorData(conexion);
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                ran = new Ranking();
                ran.setId_Ranking(rs.getInt("Id_Ranking"));
                ran.setTorneo(td.obtenerTorneo(rs.getInt(2)));
                ran.setJugador(jd.obtenerJugador(rs.getInt(3)));
                ran.setPuntaje(rs.getFloat(4)); 
            }
            ps.close();
        }catch (SQLException ex){
            System.out.println("Error en la conexion " + ex);
        }
        return ran;
    }
    
    public Ranking obtenerRanking(int idjugador, int idtorneo){
        String sql = "SELECT * FROM `ranking` WHERE Id_jugador = ? AND  Id_Torneo = ?;";
        Ranking ran = null;
        try{
            TorneoData td = new TorneoData(conexion);
            JugadorData jd = new JugadorData(conexion);
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idjugador);
            ps.setInt(2, idtorneo);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                ran = new Ranking();
                ran.setId_Ranking(rs.getInt("Id_Ranking"));
                ran.setTorneo(td.obtenerTorneo(rs.getInt(2)));
                ran.setJugador(jd.obtenerJugador(rs.getInt(3)));
                ran.setPuntaje(rs.getFloat(4)); 
            }
            ps.close();
        }catch (SQLException ex){
            System.out.println("Error en la conexion " + ex);
        }
        return ran;
    }
    
    public List<Jugador> obtenerJugadoresNoInscriptos(int idTorneo){
        String sql = "SELECT * FROM jugadores WHERE Id_jugador NOT IN (SELECT Id_jugador FROM ranking WHERE Id_Torneo = ?);";
        List<Jugador> jugadores = new ArrayList();
        Jugador j = new Jugador();
        JugadorData jd = new JugadorData(conexion);
        try{
            PatrocinadorData pd = new PatrocinadorData(conexion);
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idTorneo);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                j = jd.obtenerJugador(rs.getInt("Id_jugador"));
                jugadores.add(j);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al agregar partido " + ex);
        }
        return jugadores;
    }
    
    public List<Jugador> obtenerJugadoresInscriptos(int idTorneo){
        String sql = "SELECT Id_jugador FROM ranking WHERE Id_Torneo = ?;";
        List<Jugador> jugadores = new ArrayList();
        Jugador j = new Jugador();
        JugadorData jd = new JugadorData(conexion);
        try{
            PatrocinadorData pd = new PatrocinadorData(conexion);
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idTorneo);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                j = jd.obtenerJugador(rs.getInt("Id_jugador"));
                jugadores.add(j);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al agregar partido " + ex);
        }
        return jugadores;
    }
    
    public List<Ranking>obtenerRanking(){
        List<Ranking> ranking = new ArrayList();
        Ranking ranking1 = null;
        String sql="SELECT * FROM ranking";

            try{
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    ranking1 = this.obtenerRanking(rs.getInt("Id_Ranking"));
                    ranking.add(ranking1);
                }
                ps.close();
            }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al conectar "+ex);
            }
        return ranking;
    }
    
    public void sumarPuntos(Ranking ran, int puntos){
        String sql = "UPDATE `ranking` SET `Puntaje`=Puntaje+? WHERE Id_Ranking =?;";
        try{
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, puntos);
            ps.setInt(2, ran.getId_Ranking());
            ps.executeUpdate();
            ps.close();
            
        }catch (SQLException ex){
            System.out.println("Error en la conexion " + ex);
        }
    }
    
    public void restarPuntos(Ranking ran, int puntos){
        String sql = "UPDATE `ranking` SET `Puntaje`= Puntaje - ? WHERE Id_Ranking = ?;";
        try{
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, puntos);
            ps.setInt(2, ran.getId_Ranking());
            
        }catch (SQLException ex){
            System.out.println("Error en la conexion " + ex);
        }
    }
    
}
