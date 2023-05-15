
package modelo;

import java.util.ArrayList;
import java.util.List;

public class Partida {
    
    private List<String> palabraCompleta;
    private List<String> palabraJuego;
    private List<Jugador> listaJugadores;
    private List<String> ahorcado = new ArrayList<String>(); 
    private int indiceImagen;
    private String pista;
    private boolean win;
    private boolean lose;

    public Partida() {
    }
    
    public Partida(List<String> palabraCompleta, List<String> palabraJuego, List<Jugador> listaJugadores, int indiceImagen) {
        this.palabraCompleta = palabraCompleta;
        this.palabraJuego = palabraJuego;
        this.listaJugadores = listaJugadores;
        this.indiceImagen = indiceImagen;
        this.ahorcado.add("src/main/java/IMG/ahorcado/a1.png");
        this.ahorcado.add("src/main/java/IMG/ahorcado/a2.png");
        this.ahorcado.add("src/main/java/IMG/ahorcado/a3.png");
        this.ahorcado.add("src/main/java/IMG/ahorcado/a4.png");
        this.ahorcado.add("src/main/java/IMG/ahorcado/a5.png");
        this.ahorcado.add("src/main/java/IMG/ahorcado/a6.png");
        this.ahorcado.add("src/main/java/IMG/ahorcado/a7.png");
        this.pista = "";
        this.win = false;
        this.lose = false;
    }

    public Partida(List<String> palabraJuego, List<Jugador> listaJugadores, String pista, int indiceImagen, boolean win, boolean lose) {
        this.palabraJuego = palabraJuego;
        this.listaJugadores = listaJugadores;
        this.indiceImagen = indiceImagen;
        this.pista = pista;
    }
    
    public List<String> getPalabraCompleta() {
        return palabraCompleta;
    }

    public void setPalabraCompleta(List<String> palabraCompleta) {
        this.palabraCompleta = palabraCompleta;
    }

    public List<String> getPalabraJuego() {
        return palabraJuego;
    }

    public void setPalabraJuego(List<String> palabraJuego) {
        this.palabraJuego = palabraJuego;
    }

    public List<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(List<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public int getIndiceImagen() {
        return indiceImagen;
    }

    public void setIndiceImagen(int indiceImagen) {
        this.indiceImagen = indiceImagen;
    }

    public String getPista() {
        return pista;
    }

    public void setPista(String pista) {
        this.pista = pista;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public boolean isLose() {
        return lose;
    }

    public void setLose(boolean lose) {
        this.lose = lose;
    }

    public List<String> getAhorcado() {
        return ahorcado;
    }
    
    
}
