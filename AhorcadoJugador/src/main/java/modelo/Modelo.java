
package modelo;

import controlador.Controlador;
import vista.IVista;

public class Modelo {
    
    private Partida partida;
    private Controlador control;
    private Jugador jugador;
    private IVista vista;
    private static Modelo modelo;

    public Modelo() {
        
    }
    
    public void actualizar(Partida partida){
        this.partida = partida;
    }
    
    public Partida obtenerPartida(){
        return this.partida;
    }
    
    //Aqui se envia el evento de la jugada al supervisor 
    public void enviarJugada(){
       
    }
        
}
