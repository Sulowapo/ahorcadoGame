
package vistaJugador;

import controladorJugador.Controlador;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modeloJugador.*;
import modeloSupervisor.Jugador;

public class FrmJuegoJugador extends javax.swing.JFrame implements IVista{

    private Controlador control;
    private Modelo modelo;
    private PartidaJugador partida;
    
    public FrmJuegoJugador(Controlador control, Modelo modelo) {
        initComponents();
        fondo.setIcon(new ImageIcon("src/main/java/IMG/FondoSup.png"));
        this.control = control;
        this.modelo = modelo;
        actualizarPantalla();
        this.setEnabled(false);
    }

    public void setControl(Controlador control) {
        this.control = control;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }   

    @Override
    public void actualizarPantalla() {
        partida = modelo.obtenerPartida();
        if(partida != null){
        String palabra = "";
        if(partida.getPalabraJuego() != null){
        for(String letra: partida.getPalabraJuego()){
            palabra += letra;
            palabra += "  ";
        }
        habilitarJugada();
        }
        List<String> listaImagenes = partida.getAhorcado();
        lblPalabraJuego.setText(palabra);
        imgAhorcado.setIcon(new ImageIcon(listaImagenes.get(partida.getIndiceImagen())));
        lblPistaTexto.setText(partida.getPista());
        List<Jugador> listaJugadores = partida.getListaJugadores();
        if(listaJugadores != null){
            if(listaJugadores.size() > 0){
                lblImagenJugador1.setIcon(new ImageIcon("src/main/java/IMG/avatar.png"));
                lblJugador1Nombre.setText(listaJugadores.get(0).getNombre());
            }if(listaJugadores.size() > 2){
                lblImagenJugador2.setIcon(new ImageIcon("src/main/java/IMG/avatar.png"));
                lblJugador2Nombre.setText(listaJugadores.get(1).getNombre());
            }if(listaJugadores.size() > 3){
                lblImagenJugador3.setIcon(new ImageIcon("src/main/java/IMG/avatar.png"));
                lblJugador3Nombre.setText(listaJugadores.get(2).getNombre());
            }if(listaJugadores.size() > 4){
                lblImagenJugador4.setIcon(new ImageIcon("src/main/java/IMG/avatar.png"));
                lblJugador4Nombre.setText(listaJugadores.get(3).getNombre());
            }
            for(Jugador jugador : listaJugadores){
                if(jugador.getTurnoJugador() == true){
                    lblTurno.setText("TURNO: " + jugador.getNombre());
                }
            }
            if(partida.isWin() == true){
                JOptionPane.showMessageDialog(this, "Ganaste la partida");
                this.dispose();
            }
            if(partida.isLose() == true){
                JOptionPane.showMessageDialog(this, "Perdiste la partida");
                this.dispose();
            }
        }
        }
    }
    
    public void habilitarJugada(){
        this.setEnabled(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imgAhorcado = new javax.swing.JLabel();
        lblPistaTexto = new javax.swing.JLabel();
        lblTurno = new javax.swing.JLabel();
        lblJugador1Nombre = new javax.swing.JLabel();
        lblImagenJugador1 = new javax.swing.JLabel();
        lblJugador2Nombre = new javax.swing.JLabel();
        lblImagenJugador2 = new javax.swing.JLabel();
        lblJugador3Nombre = new javax.swing.JLabel();
        lblImagenJugador3 = new javax.swing.JLabel();
        lblJugador4Nombre = new javax.swing.JLabel();
        lblImagenJugador4 = new javax.swing.JLabel();
        lblPalabraJuego = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ahorcado juego");
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(810, 640));
        setMinimumSize(new java.awt.Dimension(810, 640));
        setPreferredSize(new java.awt.Dimension(810, 640));
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(imgAhorcado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 350, 339));

        lblPistaTexto.setFont(new java.awt.Font("Kristen ITC", 1, 22)); // NOI18N
        lblPistaTexto.setForeground(new java.awt.Color(0, 0, 0));
        lblPistaTexto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(lblPistaTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 370, -1));

        lblTurno.setFont(new java.awt.Font("Kristen ITC", 1, 24)); // NOI18N
        lblTurno.setForeground(new java.awt.Color(0, 0, 0));
        lblTurno.setText("TURNO:");
        getContentPane().add(lblTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, -1));

        lblJugador1Nombre.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        lblJugador1Nombre.setForeground(new java.awt.Color(0, 0, 0));
        lblJugador1Nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblJugador1Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, 110, -1));
        getContentPane().add(lblImagenJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, 70, 80));

        lblJugador2Nombre.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        lblJugador2Nombre.setForeground(new java.awt.Color(0, 0, 0));
        lblJugador2Nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblJugador2Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, 120, -1));
        getContentPane().add(lblImagenJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 70, 80));

        lblJugador3Nombre.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        lblJugador3Nombre.setForeground(new java.awt.Color(0, 0, 0));
        lblJugador3Nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblJugador3Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 490, 110, -1));
        getContentPane().add(lblImagenJugador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 510, 70, 80));

        lblJugador4Nombre.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        lblJugador4Nombre.setForeground(new java.awt.Color(0, 0, 0));
        lblJugador4Nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblJugador4Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 490, 110, -1));
        getContentPane().add(lblImagenJugador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 510, 70, 80));

        lblPalabraJuego.setFont(new java.awt.Font("Kristen ITC", 1, 24)); // NOI18N
        lblPalabraJuego.setForeground(new java.awt.Color(0, 0, 0));
        lblPalabraJuego.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPalabraJuego.setText("A _ _ U I _ E _ C _ U _ A    _ E    _ O _ _ _ A _ E");
        getContentPane().add(lblPalabraJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 770, -1));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here
        if(Character.isLetter(evt.getKeyChar())){
        modelo.enviarJugada(evt);}
    }//GEN-LAST:event_formKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel imgAhorcado;
    private javax.swing.JLabel lblImagenJugador1;
    private javax.swing.JLabel lblImagenJugador2;
    private javax.swing.JLabel lblImagenJugador3;
    private javax.swing.JLabel lblImagenJugador4;
    private javax.swing.JLabel lblJugador1Nombre;
    private javax.swing.JLabel lblJugador2Nombre;
    private javax.swing.JLabel lblJugador3Nombre;
    private javax.swing.JLabel lblJugador4Nombre;
    private javax.swing.JLabel lblPalabraJuego;
    private javax.swing.JLabel lblPistaTexto;
    private javax.swing.JLabel lblTurno;
    // End of variables declaration//GEN-END:variables

}
