/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneodetenis.modelo;

/**
 *
 * @author Santiago
 */
public class Ranking {
    private int id_Ranking;
    private Torneo torneo;
    private Jugador jugador;
    private float puntaje = 0;

    public Ranking(int id_Ranking, Torneo torneo, Jugador jugador) {
        this.id_Ranking = id_Ranking;
        this.torneo = torneo;
        this.jugador = jugador;
    }

    public Ranking(Torneo torneo, Jugador jugador) {
        this.torneo = torneo;
        this.jugador = jugador;
    }

    public Ranking() {
    }

    public int getId_Ranking() {
        return id_Ranking;
    }

    public void setId_Ranking(int id_Ranking) {
        this.id_Ranking = id_Ranking;
    }

    public Torneo getTorneo() {
        return torneo;
    }

    public void setTorneo(Torneo torneo) {
        this.torneo = torneo;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public float getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(float puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public String toString() {
        return "Ranking{" + "id_Ranking=" + id_Ranking + ", torneo=" + torneo + ", jugador=" + jugador + ", puntaje=" + puntaje + '}';
    }
    
    
}
