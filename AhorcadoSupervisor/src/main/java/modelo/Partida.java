
package modelo;

import java.util.List;

public class Partida {
    
    private List<String> palabraCompleta;
    private List<String> palabtaJuego;
    private List<Jugador> listaJugadores;
    private int intentosFallidos;

    public Partida(List<String> palabraCompleta, List<String> palabtaJuego, List<Jugador> listaJugadores, int intentosFallidos) {
        this.palabraCompleta = palabraCompleta;
        this.palabtaJuego = palabtaJuego;
        this.listaJugadores = listaJugadores;
        this.intentosFallidos = intentosFallidos;
    }

    public List<String> getPalabraCompleta() {
        return palabraCompleta;
    }

    public void setPalabraCompleta(List<String> palabraCompleta) {
        this.palabraCompleta = palabraCompleta;
    }

    public List<String> getPalabtaJuego() {
        return palabtaJuego;
    }

    public void setPalabtaJuego(List<String> palabtaJuego) {
        this.palabtaJuego = palabtaJuego;
    }

    public List<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(List<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public int getIntentosFallidos() {
        return intentosFallidos;
    }

    public void setIntentosFallidos(int intentosFallidos) {
        this.intentosFallidos = intentosFallidos;
    }
    
    
    
}
