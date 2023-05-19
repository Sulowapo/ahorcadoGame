package controladorSupervisor;

import modeloSupervisor.Modelo;
import modeloSupervisor.PartidaSup;
import vistaSupervisor.IVista;

public class Controlador {

    private IVista vista;
    private Modelo modelo;

    public Controlador() {
    }
    
    public Controlador(IVista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }
    
    public void actualizarModelo(PartidaSup partida){
        modelo.actualizar(partida);
        vista.actualizarPantalla();
    }
    
    public void actualizarVista(){
        vista.actualizarPantalla();
    }

    public void setVista(IVista vista) {
        this.vista = vista;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
}
