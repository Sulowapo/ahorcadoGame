package modelo;

import com.rabbitmq.client.*;
import controlador.Controlador;
import java.io.IOException;
import java.util.List;
import vista.IVista;

public class Modelo {

    private Partida partida;
    private Controlador control;
    private IVista vista;

    public Modelo() {
    }

    public Modelo(Controlador control, IVista vista) throws IOException {
        this.partida = partida;
        this.control = control;
        this.vista = vista;
    }

    public boolean actualizar(Partida partida) {
        partida = partida;
        vista.actualizarPantalla();
        return this.partida == partida;
    }

    public Partida obtenerModelo() {
        if (partida == null) {
            return new Partida();
        } else {
            return partida;
        }
    }

    public void verificarJugada(String caracterRecibido) {
        List<String> palabraCompleta = partida.getPalabraCompleta();
        List<String> palabraJuego = partida.getPalabraJuego();
        int contador = 0;
        boolean letraCorrecta = false;
        for (String letra : palabraCompleta) {
            if (caracterRecibido == letra) {
                palabraJuego.set(contador, letra);
                letraCorrecta = true;
            }
        }
        if (letraCorrecta == false) {
            partida.setIndiceImagen(partida.getIndiceImagen() + 1);
            if (partida.getIndiceImagen()== 6) {
                terminarPartida(false);
            }
        }
        if (letraCorrecta == true) {
            boolean palabraTerminada = true;
            for (String letra : palabraJuego) {
                if (letra == "_") {
                    palabraTerminada = false;
                }
            }
            if (palabraTerminada == true) {

            }
        }
    }

    public void terminarPartida(boolean ganaron) {
        if (ganaron == true) {
            partida.setWin(true);
        } else {
            partida.setLose(true);
        }
        enviarModeloJugadores();
    }

    public void enviarModeloJugadores() {

    }

    public void setControl(Controlador control) {
        this.control = control;
    }

    public void setVista(IVista vista) {
        this.vista = vista;
    }

}
