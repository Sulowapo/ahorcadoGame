
package modelo;

public class Jugador {
    
    private String nombre;
    private Boolean turnoJuego;

    public Jugador(String nombre, Boolean turnoJuego) {
        this.nombre = nombre;
        this.turnoJuego = turnoJuego;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getTurnoJugador() {
        return turnoJuego;
    }

    public void setTurnoJugador(Boolean turnoJugador) {
        this.turnoJuego = turnoJugador;
    }
    
    
    
}
