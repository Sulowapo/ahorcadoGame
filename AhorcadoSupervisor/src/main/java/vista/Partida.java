
package vista;

import java.util.List;

public class Partida {
    
    private List<Character> palabra;
    private List<Jugador> listaJugadores;
    private int intentosFallidos;

    public Partida(List<Character> palabra, List<Jugador> listaJugadores) {
        this.palabra = palabra;
        this.listaJugadores = listaJugadores;
    }

    public List<Character> getPalabra() {
        return palabra;
    }

    public void setPalabra(List<Character> palabra) {
        this.palabra = palabra;
    }

    public List<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(List<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }
    
}
