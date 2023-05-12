
package vista;

public class Jugador {
    
    private String nombre;
    private Boolean turnoJugador;

    public Jugador(String nombre, Boolean turnoJugador) {
        this.nombre = nombre;
        this.turnoJugador = turnoJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getTurnoJugador() {
        return turnoJugador;
    }

    public void setTurnoJugador(Boolean turnoJugador) {
        this.turnoJugador = turnoJugador;
    }
    
    
    
}
