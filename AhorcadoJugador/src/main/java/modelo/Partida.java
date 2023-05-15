
package modelo;

import java.util.ArrayList;
import java.util.List;

public class Partida {
    
    private List<String> palabra;
    private List<Jugador> listaJugadores;
    private int indiceImagen;
    private List<String> ahorcado = new ArrayList<String>(); 
    private String pista;
    private boolean win = false;
    private boolean lose = false;

    public Partida(List<String> palabra, List<Jugador> listaJugadores) {
        this.palabra = palabra;
        this.listaJugadores = listaJugadores;
        this.indiceImagen = 0;
        this.ahorcado.add("src/main/java/IMG/ahorcado/a1.png");
        this.ahorcado.add("src/main/java/IMG/ahorcado/a2.png");
        this.ahorcado.add("src/main/java/IMG/ahorcado/a3.png");
        this.ahorcado.add("src/main/java/IMG/ahorcado/a4.png");
        this.ahorcado.add("src/main/java/IMG/ahorcado/a5.png");
        this.ahorcado.add("src/main/java/IMG/ahorcado/a6.png");
        this.ahorcado.add("src/main/java/IMG/ahorcado/a7.png");
        this.pista = "";
    }

    public List<String> getPalabra() {
        return palabra;
    }

    public List<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public int getIndiceImagen() {
        return indiceImagen;
    }

    public List<String> getAhorcado() {
        return ahorcado;
    }

    public String getPista() {
        return pista;
    }

    public boolean isWin() {
        return win;
    }

    public boolean isLose() {
        return lose;
    }

}
