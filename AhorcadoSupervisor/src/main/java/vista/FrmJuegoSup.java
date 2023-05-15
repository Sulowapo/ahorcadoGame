
package vista;

import controlador.Controlador;
import java.util.List;
import javax.swing.ImageIcon;
import modelo.Modelo;
import modelo.Partida;

public class FrmJuegoSup extends javax.swing.JFrame implements IVista{

    private Controlador control;
    private Modelo modelo;
    private Partida partida;
    
    public FrmJuegoSup(Controlador control, Modelo modelo,String palabraCompleta) {
        initComponents();
    }

    public void setControl(Controlador control) {
        this.control = control;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }   

    @Override
    public void actualizarPantalla() {
        partida = modelo.obtenerModelo();
        String palabra = "";
        for(String letra : partida.getPalabraCompleta()){
            palabra += letra;
        }
        lblPalabraCompleta.setText(palabra);
        palabra = "";
        for(String letra: partida.getPalabraJuego()){
            palabra += letra;
            palabra += " ";
        }
        List<String> listaImagenes = partida.getAhorcado();
        lblPalabraJuego.setText(palabra);
        imgAhorcado.setIcon(new ImageIcon(listaImagenes.get(partida.getIndiceImagen())));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnB = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btnF = new javax.swing.JButton();
        btnG = new javax.swing.JButton();
        bthH = new javax.swing.JButton();
        btnI = new javax.swing.JButton();
        btnJ = new javax.swing.JButton();
        btnK = new javax.swing.JButton();
        btnL = new javax.swing.JButton();
        btnM = new javax.swing.JButton();
        btnA = new javax.swing.JButton();
        btnÑ = new javax.swing.JButton();
        btnO = new javax.swing.JButton();
        btnP = new javax.swing.JButton();
        btnQ = new javax.swing.JButton();
        btnR = new javax.swing.JButton();
        btnS = new javax.swing.JButton();
        btnT = new javax.swing.JButton();
        btnU = new javax.swing.JButton();
        btnV = new javax.swing.JButton();
        btnX = new javax.swing.JButton();
        btnW = new javax.swing.JButton();
        btnY = new javax.swing.JButton();
        btnZ = new javax.swing.JButton();
        btnN = new javax.swing.JButton();
        imgAhorcado = new javax.swing.JLabel();
        lblProgreso = new javax.swing.JLabel();
        lblTurno = new javax.swing.JLabel();
        lblJugador1Nombre = new javax.swing.JLabel();
        lblImagenJugador1 = new javax.swing.JLabel();
        lblJugador2Nombre = new javax.swing.JLabel();
        lblImagenJugador2 = new javax.swing.JLabel();
        lblJugador3Nombre = new javax.swing.JLabel();
        lblImagenJugador3 = new javax.swing.JLabel();
        lblJugador4Nombre = new javax.swing.JLabel();
        lblImagenJugador4 = new javax.swing.JLabel();
        lblReloj = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JLabel();
        lblPalabraCompleta = new javax.swing.JLabel();
        lblPalabraJuego = new javax.swing.JLabel();
        btnPista = new javax.swing.JLabel();
        lblPista = new javax.swing.JLabel();
        btnFinalizar = new javax.swing.JLabel();
        lblFinalizarPartida = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ahorcado juego");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnB.setBackground(new java.awt.Color(215, 209, 227));
        btnB.setFont(new java.awt.Font("Kristen ITC", 1, 30)); // NOI18N
        btnB.setForeground(new java.awt.Color(0, 0, 0));
        btnB.setText("B");
        getContentPane().add(btnB, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 62, 62));

        btnC.setBackground(new java.awt.Color(215, 209, 227));
        btnC.setFont(new java.awt.Font("Kristen ITC", 1, 30)); // NOI18N
        btnC.setForeground(new java.awt.Color(0, 0, 0));
        btnC.setText("C");
        getContentPane().add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, 62, 62));

        btnD.setBackground(new java.awt.Color(215, 209, 227));
        btnD.setFont(new java.awt.Font("Kristen ITC", 1, 30)); // NOI18N
        btnD.setForeground(new java.awt.Color(0, 0, 0));
        btnD.setText("D");
        getContentPane().add(btnD, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 70, 62, 62));

        btnE.setBackground(new java.awt.Color(215, 209, 227));
        btnE.setFont(new java.awt.Font("Kristen ITC", 1, 30)); // NOI18N
        btnE.setForeground(new java.awt.Color(0, 0, 0));
        btnE.setText("E");
        getContentPane().add(btnE, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 62, 62));

        btnF.setBackground(new java.awt.Color(215, 209, 227));
        btnF.setFont(new java.awt.Font("Kristen ITC", 1, 30)); // NOI18N
        btnF.setForeground(new java.awt.Color(0, 0, 0));
        btnF.setText("F");
        getContentPane().add(btnF, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 62, 62));

        btnG.setBackground(new java.awt.Color(215, 209, 227));
        btnG.setFont(new java.awt.Font("Kristen ITC", 1, 30)); // NOI18N
        btnG.setForeground(new java.awt.Color(0, 0, 0));
        btnG.setText("G");
        getContentPane().add(btnG, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 62, 62));

        bthH.setBackground(new java.awt.Color(215, 209, 227));
        bthH.setFont(new java.awt.Font("Kristen ITC", 1, 30)); // NOI18N
        bthH.setForeground(new java.awt.Color(0, 0, 0));
        bthH.setText("H");
        getContentPane().add(bthH, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 62, 62));

        btnI.setBackground(new java.awt.Color(215, 209, 227));
        btnI.setFont(new java.awt.Font("Kristen ITC", 1, 30)); // NOI18N
        btnI.setForeground(new java.awt.Color(0, 0, 0));
        btnI.setText("I");
        getContentPane().add(btnI, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, 62, 62));

        btnJ.setBackground(new java.awt.Color(215, 209, 227));
        btnJ.setFont(new java.awt.Font("Kristen ITC", 1, 30)); // NOI18N
        btnJ.setForeground(new java.awt.Color(0, 0, 0));
        btnJ.setText("J");
        getContentPane().add(btnJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 130, 62, 62));

        btnK.setBackground(new java.awt.Color(215, 209, 227));
        btnK.setFont(new java.awt.Font("Kristen ITC", 1, 30)); // NOI18N
        btnK.setForeground(new java.awt.Color(0, 0, 0));
        btnK.setText("K");
        getContentPane().add(btnK, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 62, 62));

        btnL.setBackground(new java.awt.Color(215, 209, 227));
        btnL.setFont(new java.awt.Font("Kristen ITC", 1, 30)); // NOI18N
        btnL.setForeground(new java.awt.Color(0, 0, 0));
        btnL.setText("L");
        getContentPane().add(btnL, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 62, 62));

        btnM.setBackground(new java.awt.Color(215, 209, 227));
        btnM.setFont(new java.awt.Font("Kristen ITC", 1, 30)); // NOI18N
        btnM.setForeground(new java.awt.Color(0, 0, 0));
        btnM.setText("M");
        getContentPane().add(btnM, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 62, 62));

        btnA.setBackground(new java.awt.Color(215, 209, 227));
        btnA.setFont(new java.awt.Font("Kristen ITC", 1, 30)); // NOI18N
        btnA.setForeground(new java.awt.Color(0, 0, 0));
        btnA.setText("A");
        getContentPane().add(btnA, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 62, 62));

        btnÑ.setBackground(new java.awt.Color(215, 209, 227));
        btnÑ.setFont(new java.awt.Font("Kristen ITC", 1, 30)); // NOI18N
        btnÑ.setForeground(new java.awt.Color(0, 0, 0));
        btnÑ.setText("Ñ");
        getContentPane().add(btnÑ, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 190, 62, 62));

        btnO.setBackground(new java.awt.Color(215, 209, 227));
        btnO.setFont(new java.awt.Font("Kristen ITC", 1, 30)); // NOI18N
        btnO.setForeground(new java.awt.Color(0, 0, 0));
        btnO.setText("O");
        getContentPane().add(btnO, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 190, 62, 62));

        btnP.setBackground(new java.awt.Color(215, 209, 227));
        btnP.setFont(new java.awt.Font("Kristen ITC", 1, 30)); // NOI18N
        btnP.setForeground(new java.awt.Color(0, 0, 0));
        btnP.setText("P");
        getContentPane().add(btnP, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 62, 62));

        btnQ.setBackground(new java.awt.Color(215, 209, 227));
        btnQ.setFont(new java.awt.Font("Kristen ITC", 1, 30)); // NOI18N
        btnQ.setForeground(new java.awt.Color(0, 0, 0));
        btnQ.setText("Q");
        getContentPane().add(btnQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 62, 62));

        btnR.setBackground(new java.awt.Color(215, 209, 227));
        btnR.setFont(new java.awt.Font("Kristen ITC", 1, 30)); // NOI18N
        btnR.setForeground(new java.awt.Color(0, 0, 0));
        btnR.setText("R");
        getContentPane().add(btnR, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 62, 62));

        btnS.setBackground(new java.awt.Color(215, 209, 227));
        btnS.setFont(new java.awt.Font("Kristen ITC", 1, 30)); // NOI18N
        btnS.setForeground(new java.awt.Color(0, 0, 0));
        btnS.setText("S");
        getContentPane().add(btnS, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, 62, 62));

        btnT.setBackground(new java.awt.Color(215, 209, 227));
        btnT.setFont(new java.awt.Font("Kristen ITC", 1, 30)); // NOI18N
        btnT.setForeground(new java.awt.Color(0, 0, 0));
        btnT.setText("T");
        getContentPane().add(btnT, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 250, 62, 62));

        btnU.setBackground(new java.awt.Color(215, 209, 227));
        btnU.setFont(new java.awt.Font("Kristen ITC", 1, 30)); // NOI18N
        btnU.setForeground(new java.awt.Color(0, 0, 0));
        btnU.setText("U");
        getContentPane().add(btnU, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 250, 62, 62));

        btnV.setBackground(new java.awt.Color(215, 209, 227));
        btnV.setFont(new java.awt.Font("Kristen ITC", 1, 30)); // NOI18N
        btnV.setForeground(new java.awt.Color(0, 0, 0));
        btnV.setText("V");
        getContentPane().add(btnV, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 62, 62));

        btnX.setBackground(new java.awt.Color(215, 209, 227));
        btnX.setFont(new java.awt.Font("Kristen ITC", 1, 30)); // NOI18N
        btnX.setForeground(new java.awt.Color(0, 0, 0));
        btnX.setText("X");
        getContentPane().add(btnX, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, 62, 62));

        btnW.setBackground(new java.awt.Color(215, 209, 227));
        btnW.setFont(new java.awt.Font("Kristen ITC", 1, 30)); // NOI18N
        btnW.setForeground(new java.awt.Color(0, 0, 0));
        btnW.setText("W");
        getContentPane().add(btnW, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 62, 62));

        btnY.setBackground(new java.awt.Color(215, 209, 227));
        btnY.setFont(new java.awt.Font("Kristen ITC", 1, 30)); // NOI18N
        btnY.setForeground(new java.awt.Color(0, 0, 0));
        btnY.setText("Y");
        getContentPane().add(btnY, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, 62, 62));

        btnZ.setBackground(new java.awt.Color(215, 209, 227));
        btnZ.setFont(new java.awt.Font("Kristen ITC", 1, 30)); // NOI18N
        btnZ.setForeground(new java.awt.Color(0, 0, 0));
        btnZ.setText("Z");
        getContentPane().add(btnZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 310, 62, 62));

        btnN.setBackground(new java.awt.Color(215, 209, 227));
        btnN.setFont(new java.awt.Font("Kristen ITC", 1, 30)); // NOI18N
        btnN.setForeground(new java.awt.Color(0, 0, 0));
        btnN.setText("N");
        getContentPane().add(btnN, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, 62, 62));

        imgAhorcado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ahorcado.png"))); // NOI18N
        getContentPane().add(imgAhorcado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 350, 339));

        lblProgreso.setFont(new java.awt.Font("Kristen ITC", 1, 22)); // NOI18N
        lblProgreso.setForeground(new java.awt.Color(0, 0, 0));
        lblProgreso.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(lblProgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 370, -1));

        lblTurno.setFont(new java.awt.Font("Kristen ITC", 1, 24)); // NOI18N
        lblTurno.setForeground(new java.awt.Color(0, 0, 0));
        lblTurno.setText("TURNO:");
        getContentPane().add(lblTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));

        lblJugador1Nombre.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        lblJugador1Nombre.setForeground(new java.awt.Color(0, 0, 0));
        lblJugador1Nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblJugador1Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, 110, -1));

        lblImagenJugador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/avatar.png"))); // NOI18N
        getContentPane().add(lblImagenJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, 70, 80));

        lblJugador2Nombre.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        lblJugador2Nombre.setForeground(new java.awt.Color(0, 0, 0));
        lblJugador2Nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblJugador2Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, 120, -1));

        lblImagenJugador2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/avatar.png"))); // NOI18N
        getContentPane().add(lblImagenJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 70, 80));

        lblJugador3Nombre.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        lblJugador3Nombre.setForeground(new java.awt.Color(0, 0, 0));
        lblJugador3Nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblJugador3Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 490, 110, -1));

        lblImagenJugador3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/avatar.png"))); // NOI18N
        getContentPane().add(lblImagenJugador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 510, 70, 80));

        lblJugador4Nombre.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        lblJugador4Nombre.setForeground(new java.awt.Color(0, 0, 0));
        lblJugador4Nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblJugador4Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 490, 110, -1));

        lblImagenJugador4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/avatar.png"))); // NOI18N
        getContentPane().add(lblImagenJugador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 510, 70, 80));

        lblReloj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/reloj.png"))); // NOI18N
        getContentPane().add(lblReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 70, 70));

        lblTiempo.setFont(new java.awt.Font("Kristen ITC", 1, 48)); // NOI18N
        lblTiempo.setForeground(new java.awt.Color(0, 0, 0));
        lblTiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTiempo.setText("25");
        getContentPane().add(lblTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 70, 60));

        lblPalabraCompleta.setFont(new java.awt.Font("Kristen ITC", 1, 24)); // NOI18N
        lblPalabraCompleta.setForeground(new java.awt.Color(102, 102, 255));
        lblPalabraCompleta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPalabraCompleta.setText("ARQUITECTURA DE SOFTWARE");
        getContentPane().add(lblPalabraCompleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 770, -1));

        lblPalabraJuego.setFont(new java.awt.Font("Kristen ITC", 1, 24)); // NOI18N
        lblPalabraJuego.setForeground(new java.awt.Color(0, 0, 0));
        lblPalabraJuego.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPalabraJuego.setText("A _ _ U I _ E _ C _ U _ A    _ E    _ O _ _ _ A _ E");
        getContentPane().add(lblPalabraJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 770, -1));

        btnPista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/PISTA.png"))); // NOI18N
        btnPista.setText("jLabel7");
        getContentPane().add(btnPista, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 80, 90, 90));

        lblPista.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        lblPista.setForeground(new java.awt.Color(0, 0, 0));
        lblPista.setText("DAR PISTA");
        getContentPane().add(lblPista, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 190, -1, -1));

        btnFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/finalizar.png"))); // NOI18N
        btnFinalizar.setText("jLabel7");
        getContentPane().add(btnFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 340, 90, 90));

        lblFinalizarPartida.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        lblFinalizarPartida.setForeground(new java.awt.Color(0, 0, 0));
        lblFinalizarPartida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFinalizarPartida.setText("FINALIZAR PARTIDA");
        getContentPane().add(lblFinalizarPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 430, 230, 50));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/FondoSup.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bthH;
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnF;
    private javax.swing.JLabel btnFinalizar;
    private javax.swing.JButton btnG;
    private javax.swing.JButton btnI;
    private javax.swing.JButton btnJ;
    private javax.swing.JButton btnK;
    private javax.swing.JButton btnL;
    private javax.swing.JButton btnM;
    private javax.swing.JButton btnN;
    private javax.swing.JButton btnO;
    private javax.swing.JButton btnP;
    private javax.swing.JLabel btnPista;
    private javax.swing.JButton btnQ;
    private javax.swing.JButton btnR;
    private javax.swing.JButton btnS;
    private javax.swing.JButton btnT;
    private javax.swing.JButton btnU;
    private javax.swing.JButton btnV;
    private javax.swing.JButton btnW;
    private javax.swing.JButton btnX;
    private javax.swing.JButton btnY;
    private javax.swing.JButton btnZ;
    private javax.swing.JButton btnÑ;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel imgAhorcado;
    private javax.swing.JLabel lblFinalizarPartida;
    private javax.swing.JLabel lblImagenJugador1;
    private javax.swing.JLabel lblImagenJugador2;
    private javax.swing.JLabel lblImagenJugador3;
    private javax.swing.JLabel lblImagenJugador4;
    private javax.swing.JLabel lblJugador1Nombre;
    private javax.swing.JLabel lblJugador2Nombre;
    private javax.swing.JLabel lblJugador3Nombre;
    private javax.swing.JLabel lblJugador4Nombre;
    private javax.swing.JLabel lblPalabraCompleta;
    private javax.swing.JLabel lblPalabraJuego;
    private javax.swing.JLabel lblPista;
    private javax.swing.JLabel lblProgreso;
    private javax.swing.JLabel lblReloj;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JLabel lblTurno;
    // End of variables declaration//GEN-END:variables

}
