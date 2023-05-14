package modelo;

public class Modelo {

    private Partida partida;

    public void actualizar(Partida partida) {
        this.partida = partida;
    }

    public Partida obtenerModelo() {
        return this.partida;
    }

    public void verificarJugada() {
        
    }

    public void terminarPartida() {
        if (partida.getIntentosFallidos() == 7) {
            //no la armaron los morros para las adivinanzas
        }

    }
    
    public void actualizarPartidaJugadores() {

    }
    
    public void enviarModelo(){
        
    }
}
