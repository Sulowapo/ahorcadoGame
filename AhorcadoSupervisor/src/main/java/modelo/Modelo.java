package modelo;

import com.rabbitmq.client.*;
import controlador.Controlador;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import vista.IVista;

public class Modelo {

    private Partida partida;
    private Controlador control;
    private IVista vista;
    private static Modelo modelo;

    private Modelo() {
        this.partida = new Partida();
    }

    public static Modelo obtenerModelo() {
        if (modelo == null) {
            return new Modelo();
        } else {
            return modelo;
        }
    }

    public Modelo(Controlador control, IVista vista) throws IOException {
        this.control = control;
        this.vista = vista;
    }

    public void actualizar(Partida partida) {
        this.partida = partida;
        this.control.actualizarVista();
    }

    public Partida obtenerPartida() {
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
            if (partida.getIndiceImagen() == 6) {
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

    public void generarListaPalabras(String palabra) {
        List<String> palabraCompleta = new ArrayList<>();
        List<String> palabraJuego = new ArrayList<>();
        for (int i = 0; i < palabra.length(); i++) {
            String letra = String.valueOf(palabra.charAt(i));
            palabraCompleta.add(letra);
            if (letra.equals(" ")) {
                palabraJuego.add(letra);
            } else {
                palabraJuego.add("_");
            }
        }
        partida.setPalabraCompleta(palabraCompleta);
        partida.setPalabraJuego(palabraJuego);
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
}
