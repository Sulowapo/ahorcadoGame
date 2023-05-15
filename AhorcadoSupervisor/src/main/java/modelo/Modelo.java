package modelo;

import javax.swing.JOptionPane;

public class Modelo {

    private Partida partida;

    public void actualizar(Partida partida) {
        this.partida = partida;
    }

    public Partida obtenerModelo() {
        return this.partida;
    }

    public void verificarJugada() {
        for (int i = 0; i < 10; i++) {
            
        }
    }

    public void terminarPartida() {
        if (partida.getIntentosFallidos() == 7) {
        }

    }

    public void actualizarPartidaJugadores() {

    }

    public void enviarModelo() {

    }
}
