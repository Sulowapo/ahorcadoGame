/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrancador;

import vistaJugador.FrmRunJugador;
import vistaSupervisor.FrmRun;

public class Arrancador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Instancia un supervisor
        FrmRun supervisor = new FrmRun();
        //Instancia dos jugadores
        FrmRunJugador jugador1 = new FrmRunJugador();
        
        supervisor.setVisible(true);
        jugador1.setVisible(true);
        
    }
    
}
