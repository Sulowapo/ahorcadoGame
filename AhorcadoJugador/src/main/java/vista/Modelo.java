
package vista;

public class Modelo {
    
    private Partida partida;
    
    public void actualizar(Partida partida){
        this.partida = partida;
    }
    
    public Partida obtenerPartida(){
        return this.partida;
    }
    
    public void enviarJugada(){
        //Aqui se envia el evento de la jugada al supervisor
    }
}
