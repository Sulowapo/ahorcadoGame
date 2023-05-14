/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.ImageIcon;

/**
 *
 * @author Kevin
 */
public class FrmMenuJugador extends javax.swing.JFrame {

    ImageIcon fondo = new ImageIcon("C:\\Users\\Kevin\\Documents\\GitHub\\ahorcadoGame\\AhorcadoJugador\\src\\main\\java\\IMG/Fondo2.png");
    ImageIcon titulo = new ImageIcon("C:\\Users\\Kevin\\Documents\\GitHub\\ahorcadoGame\\AhorcadoJugador\\src\\main\\java\\IMG/Title.png");
    ImageIcon iniciar = new ImageIcon("C:\\Users\\Kevin\\Documents\\GitHub\\ahorcadoGame\\AhorcadoJugador\\src\\main\\java\\IMG/IniciarJuego.png");
    ImageIcon salir = new ImageIcon("C:\\Users\\Kevin\\Documents\\GitHub\\ahorcadoGame\\AhorcadoJugador\\src\\main\\java\\IMG/SalirJuego.png");

    public FrmMenuJugador() {
        initComponents();
        lblFondo.setIcon(fondo);
        lblTitulo.setIcon(titulo);
        btnIniciar.setIcon(iniciar);
        btnSalir.setIcon(salir);
        btnIniciar.setOpaque(false);
        btnIniciar.setContentAreaFilled(false);
        btnIniciar.setBorderPainted(false);
        btnSalir.setOpaque(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setBorderPainted(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblTxtNombre = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();
        lblNombreJugador = new javax.swing.JLabel();
        nombreJugTXT = new javax.swing.JTextField();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(641, 517));
        setSize(new java.awt.Dimension(641, 517));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 330, 110));

        lblTxtNombre.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTxtNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblTxtNombre.setText("Ingresa tu Nombre");
        getContentPane().add(lblTxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 160, 50));

        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 160, 50));

        lblNombreJugador.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNombreJugador.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreJugador.setText("Jugador");
        getContentPane().add(lblNombreJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, -1, -1));
        getContentPane().add(nombreJugTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 160, -1));
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
        FrmRun frm = new FrmRun();
        frm.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        
    }//GEN-LAST:event_btnIniciarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblNombreJugador;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTxtNombre;
    private javax.swing.JTextField nombreJugTXT;
    // End of variables declaration//GEN-END:variables
}