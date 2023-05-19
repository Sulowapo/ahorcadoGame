
package eventosSupervisor;

import comunicacion.CanalJaS;
import comunicacion.Observer;
import modeloSupervisor.Modelo;

public class ReceptorEventos implements Observer{
    
    private CanalJaS canal;
    private Object evento;
    
    public ReceptorEventos() {
        this.canal = CanalJaS.obtenerCanal();
    }
    
    public void RecibirEvento(){
        if(evento.getClass().equals(String.class)){
            Modelo.obtenerModelo().agregarJugador(String.valueOf(evento));
        } else {
            if(evento.getClass().equals(java.awt.event.KeyEvent.class)){
                Modelo.obtenerModelo().verificarJugada((java.awt.event.KeyEvent) evento);
            }
        }
    }

    @Override
    public void update() {
        this.evento = canal.consumirEvento();
        RecibirEvento();
    }

    
    
}
