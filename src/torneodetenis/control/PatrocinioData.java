/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package torneodetenis.control;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import torneodetenis.modelo.Conexion;
import torneodetenis.modelo.Patrocinador;
import torneodetenis.modelo.Patrocinio;

/**
 *
 * @author sant
 */
public class PatrocinioData {
    private Connection con;
    private Conexion conexion;
    
    public PatrocinioData(Conexion conexion){
        try {
            this.conexion = conexion;
            con = conexion.getConexion();
            
        } catch (SQLException ex) {
            System.out.println("Error en la conexion ");
        }
    }
    
    public void agregarPatrocinio(Patrocinio patrocinio){
        String sql = "INSERT INTO `patrocinio`(`Id_jugador`, `Id_patrocinador`) VALUES (?,?);";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, patrocinio.getJugador().getId_jugador());
            ps.setInt(2, patrocinio.getPatrocinador().getId_patrocinador());
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Se agrego correctamente");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al agregar " + ex);
        }
    }
    
    public void actualizarPatrocinio(Patrocinio patrocinio){
        String sql = "UPDATE `patrocinio` SET `Id_jugador`=?,`Id_patrocinador`=? WHERE Id_patrocinio = ?;";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, patrocinio.getJugador().getId_jugador());
            ps.setInt(2, patrocinio.getPatrocinador().getId_patrocinador());
            ps.setInt(3, patrocinio.getId_patrocinio());
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Se actualizo correctamente");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al actualizar " + ex);
        }
    }
    
    public void borrarPatrocinio(int id){
        String sql = "DELETE FROM `patrocinio` WHERE Id_patrocinio = ?;";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Se borro correctamente");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al borrar " + ex);
        }
    }
    
    public Patrocinio obtenerPatrocinio(int id){
        String sql = "SELECT * FROM patrocinio WHERE Id_patrocinio = ?";
        Patrocinio patrocinio = null;
        try{
            JugadorData jd = new JugadorData(conexion);
            PatrocinadorData pd = new PatrocinadorData(conexion);
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                patrocinio = new Patrocinio();
                patrocinio.setId_patrocinio(rs.getInt("Id_patrocinio"));
                patrocinio.setJugador(jd.obtenerJugador(rs.getInt("Id_jugador")));
                patrocinio.setPatrocinador(pd.obtenerPatrocinador(rs.getInt(2)));
            }
            ps.close();
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al agregar partido " + ex);
        }
        return patrocinio;
    }
    
    public List<Patrocinio> obtenerPatrocinios(){
        String sql = "SELECT * FROM patrocinio";
        List<Patrocinio> patrocinios = new ArrayList();
        Patrocinio patrocinio = null;
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                patrocinio = this.obtenerPatrocinio(rs.getInt("Id_patrocinio"));
                patrocinios.add(patrocinio);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al agregar partido " + ex);
        }
        return patrocinios;
    }
    
    public List<Patrocinio> obtenerPatrociniosDeUnJugador(int idJugador){
        String sql = "SELECT * FROM patrocinio WHERE Id_Jugador = ?";
        List<Patrocinio> patrocinios = new ArrayList();
        Patrocinio patrocinio = null;
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idJugador);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                patrocinio = this.obtenerPatrocinio(rs.getInt("Id_patrocinio"));
                patrocinios.add(patrocinio);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al agregar partido " + ex);
        }
        return patrocinios;
    }
    
    public int obtenerNumeroDePatrociniosDeUnJugador(int idJugador){
        String sql = "SELECT * FROM patrocinio WHERE Id_Jugador = ?";
        List<Patrocinio> patrocinios = new ArrayList();
        Patrocinio patrocinio = null;
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idJugador);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                patrocinio = this.obtenerPatrocinio(rs.getInt("Id_patrocinio"));
                patrocinios.add(patrocinio);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al agregar partido " + ex);
        }
        return patrocinios.size();
    }
    
    public List<Patrocinador> obtenerPatrociniosPosibles(int idJugador){
        String sql = "SELECT * FROM patrocinador WHERE Id_patrocinador NOT IN (SELECT Id_patrocinador FROM patrocinio WHERE Id_jugador = ?)";
        List<Patrocinador> patrocinios = new ArrayList();
        Patrocinador patrocinio = null;
        try{
            PatrocinadorData pd = new PatrocinadorData(conexion);
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idJugador);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                patrocinio = pd.obtenerPatrocinador(rs.getInt("Id_Patrocinador"));
                patrocinios.add(patrocinio);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al agregar partido " + ex);
        }
        return patrocinios;
    }
    
    public List<Patrocinio> obtenerPatrocinioJugador(int id){
        String sql = "SELECT * FROM patrocinio WHERE Id_jugador = ?";
        List<Patrocinio> patrocinios = new ArrayList();
        Patrocinio patrocinio = null;
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                patrocinio = this.obtenerPatrocinio(rs.getInt("Id_patrocinio"));
                patrocinios.add(patrocinio);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al agregar partido " + ex);
        }
        return patrocinios;
    }
    
    
    
}
