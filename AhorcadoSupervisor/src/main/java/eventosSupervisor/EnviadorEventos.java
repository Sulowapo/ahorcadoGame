
package eventosSupervisor;

import comunicacion.CanalSaJ;

public class EnviadorEventos {
    
    public static void EventoActualizarModelo(Object evento){
        CanalSaJ.obtenerCanal().PublicarEvento(evento);
    }

}
