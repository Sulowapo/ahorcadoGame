package modeloSupervisor;

import comunicacion.CanalJaS;
import controladorSupervisor.Controlador;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import vistaSupervisor.IVista;
import eventosSupervisor.*;

public class Modelo {

    private PartidaSup partida;
    private Controlador control;
    private IVista vista;
    private static Modelo modelo;
    int cont;

    private Modelo() {
        this.partida = new PartidaSup();
        CanalJaS.obtenerCanal().enlazarConsumidor(new ReceptorEventos());
    }

    public static Modelo obtenerModelo() {
        if (modelo == null) {
            modelo = new Modelo();
        }
        return modelo;
    }

    public Modelo(Controlador control, IVista vista) throws IOException {
        this.control = control;
        this.vista = vista;
    }

    public void actualizar(PartidaSup partida) {
        this.partida = partida;
        this.control.actualizarVista();
        enviarModeloJugadores();
    }

    public PartidaSup obtenerPartida() {
        if (partida == null) {
            return new PartidaSup();
        } else {
            return partida;
        }
    }
    
    public void agregarJugador(String usuario){
        this.partida.getListaJugadores().add(new Jugador(usuario, Boolean.FALSE));
        this.control.actualizarVista();
    }
    
    public void pasarTurno(){
        List<Jugador> jugadores = partida.getListaJugadores();
        if(cont >= jugadores.size()){ cont = 0; }
        if(cont > 0){
            jugadores.get(cont-1).setTurnoJugador(false);
        }
        jugadores.get(cont).setTurnoJugador(true);
        partida.setListaJugadores(jugadores);
        cont++;
    }
    
    public void verificarJugada(java.awt.event.KeyEvent evento) {
        List<String> palabraCompleta = partida.getPalabraCompleta();
        List<String> palabraJuego = partida.getPalabraJuego();
        int contador = 0;
        boolean letraCorrecta = false;
        for (String letra : palabraCompleta) {
            String letraIngresada = String.valueOf(evento.getKeyChar()).toLowerCase();
            if (letraIngresada.equals(letra.toLowerCase())) {
                palabraJuego.set(contador, letra);
                letraCorrecta = true;
            }
            contador ++;
        }
        partida.setPalabraJuego(palabraJuego);
        if (letraCorrecta == false) {
            partida.setIndiceImagen(partida.getIndiceImagen() + 1);
            if (partida.getIndiceImagen() == 6) {
                terminarPartida(false);
                return;
            }
        }
        if (letraCorrecta == true) {
            boolean palabraTerminada = true;
            for (String letra : palabraJuego) {
                if (letra.equals("_")) {
                    palabraTerminada = false;
                }
            }
            if (palabraTerminada == true) {
                terminarPartida(true);
            }
        }
        pasarTurno();
        actualizar(this.partida);
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
        actualizar(partida);
    }

    public void enviarModeloJugadores() {
        System.out.println(partida.isWin());
        System.out.println(partida.isLose());
        EnviadorEventos.EventoActualizarModelo(new PartidaSup(partida.getPalabraJuego(), partida.getListaJugadores(), partida.getPista(), partida.getIndiceImagen(), partida.isWin(), partida.isLose()));
    }

    public void setControl(Controlador control) {
        this.control = control;
    }
}
