
package eventosJugador;

import comunicacion.CanalJaS;

public class EnviadorEventos {
    
    public static void EventoEnviarJugada(Object evento){
        CanalJaS.obtenerCanal().PublicarEvento(evento);
    }
    
    public static void EventoUnirsePartida(String evento){
        CanalJaS.obtenerCanal().PublicarEvento(evento);
    }

}
