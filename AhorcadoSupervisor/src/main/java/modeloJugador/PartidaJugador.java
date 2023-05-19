
package modeloJugador;

import interfaces.IPartida;
import java.util.ArrayList;
import java.util.List;
import modeloSupervisor.Jugador;

public class PartidaJugador implements IPartida{
    
    private List<String> palabraJuego;
    private List<Jugador> listaJugadores;
    private List<String> ahorcado = new ArrayList<String>(); 
    private int indiceImagen;
    private String pista;
    private String teclaIngresada;
    private boolean win;
    private boolean lose;
    private List<String> listaDePalabrasIngresadas;
    
    public PartidaJugador(List<String> palabraJuego, List<Jugador> listaJugadores) {
        this.palabraJuego = palabraJuego;
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
        this.win = false;
        this.lose = false;
    }
    
    public PartidaJugador() {
        this.indiceImagen = 0;
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

    public PartidaJugador(List<String> palabraJuego, List<Jugador> listaJugadores, String pista, int indiceImagen, boolean win, boolean lose) {
        this.palabraJuego = palabraJuego;
        this.listaJugadores = listaJugadores;
        this.indiceImagen = indiceImagen;
        this.pista = pista;
    }

    public List<String> getPalabraJuego() {
        return palabraJuego;
    }

    public List<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public List<String> getAhorcado() {
        return ahorcado;
    }

    public int getIndiceImagen() {
        return indiceImagen;
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

    public void setPalabraJuego(List<String> palabraJuego) {
        this.palabraJuego = palabraJuego;
    }

    public void setListaJugadores(List<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public void setAhorcado(List<String> ahorcado) {
        this.ahorcado = ahorcado;
    }

    public void setIndiceImagen(int indiceImagen) {
        this.indiceImagen = indiceImagen;
    }

    public void setPista(String pista) {
        this.pista = pista;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public void setLose(boolean lose) {
        this.lose = lose;
    }

    public String getTeclaIngresada() {
        return teclaIngresada;
    }

    public void setTeclaIngresada(String teclaIngresada) {
        this.teclaIngresada = teclaIngresada;
    }
    
}
