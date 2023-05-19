
package eventosJugador;

import comunicacion.CanalSaJ;
import comunicacion.Observer;
import modeloJugador.Modelo;
import modeloJugador.PartidaJugador;
import modeloSupervisor.PartidaSup;

public class ReceptorEventos implements Observer{
    
    private CanalSaJ canal;
    private Object evento;
    
    public ReceptorEventos() {
        this.canal = CanalSaJ.obtenerCanal();
    }
    
    public void RecibirEventoModelo(){
        PartidaSup partidaRecibida = (PartidaSup)evento;
        Modelo.obtenerModelo().actualizar(new PartidaJugador(partidaRecibida.getPalabraJuego(), partidaRecibida.getListaJugadores(), partidaRecibida.getPista(), partidaRecibida.getIndiceImagen(), partidaRecibida.isWin(), partidaRecibida.isLose()));
    }

    @Override
    public void update() {
        this.evento = canal.consumirEvento();
        RecibirEventoModelo();
    }

    
    
}
