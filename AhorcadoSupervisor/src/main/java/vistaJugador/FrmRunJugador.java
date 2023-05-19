
package vistaJugador;

import javax.swing.ImageIcon;
import modeloJugador.Modelo;
import controladorJugador.Controlador;

public class FrmRunJugador extends javax.swing.JFrame{

    private Modelo modelo;
    private Controlador control;
    private FrmMenuJugador frm;
    
    private ImageIcon fondo = new ImageIcon("src/main/java/IMG/Fondo1.png");
    private ImageIcon titulo = new ImageIcon("src/main/java/IMG/Title.png");
    private ImageIcon iniciar = new ImageIcon("src/main/java/IMG/StartBtn.png");
    private ImageIcon salir = new ImageIcon("src/main/java/IMG/ExitBtn.png");

    public FrmRunJugador() {
        initComponents();
        lblFondo.setIcon(fondo);
        lblTituloRun.setIcon(titulo);
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

        btnIniciar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblTituloRun = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 190, 50));

        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 190, 50));
        getContentPane().add(lblTituloRun, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 300, 90));
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        this.modelo = Modelo.obtenerModelo();
        this.control = new Controlador();
        this.modelo.setControl(control);
        this.control.setModelo(modelo);
        this.frm = new FrmMenuJugador(control, modelo);
        this.control.setVista(frm);
        this.frm.setControl(control);
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FrmRunJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrmRunJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrmRunJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrmRunJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        System.out.println(System.getProperty("java.class.path"));
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrmRunJugador().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblTituloRun;
    // End of variables declaration//GEN-END:variables
}
