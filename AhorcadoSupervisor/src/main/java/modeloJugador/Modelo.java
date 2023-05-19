package modeloJugador;

import comunicacion.CanalSaJ;
import controladorJugador.Controlador;
import java.io.IOException;
import vistaJugador.IVista;
import eventosJugador.*;

public class Modelo {

    private PartidaJugador partida;
    private Controlador control;
    private IVista vista;
    private static Modelo modelo;

    private Modelo() {
        this.partida = new PartidaJugador();
        CanalSaJ.obtenerCanal().enlazarConsumidor(new ReceptorEventos());
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

    public void actualizar(PartidaJugador partida) {
        this.partida.setIndiceImagen(partida.getIndiceImagen());
        this.partida.setListaJugadores(partida.getListaJugadores());
        this.partida.setPista(partida.getPista());
        this.partida.setWin(partida.isWin());
        System.out.println(partida.isWin());
        this.partida.setLose(partida.isLose());
        System.out.println(partida.isLose());
        this.partida.setPalabraJuego(partida.getPalabraJuego());
        this.partida.setTeclaIngresada(partida.getTeclaIngresada());
        this.control.actualizarVista();
    }

    public PartidaJugador obtenerPartida() {
        if (partida == null) {
            return new PartidaJugador();
        } else {
            return partida;
        }
    }

    public void enviarJugada(Object jugada) {
        EnviadorEventos.EventoEnviarJugada(jugada);
    }
    
    public void unirsePartida(String usuario){
        EnviadorEventos.EventoUnirsePartida(usuario);
    }

    public void setControl(Controlador control) {
        this.control = control;
    }
}
