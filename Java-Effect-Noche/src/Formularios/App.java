
package Formularios;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;


public class App extends javax.swing.JFrame {

    
    public App() {
        initComponents();
        this.setLocationRelativeTo(null);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
       // this.setLocation(dim.width/2-this.getSize().width, dim.height/2-this.getSize().height);
        this.setBackground(new Color(0,0,0,0));
        APP.setBackground(new Color(0,0,0,0));
        APP.setFocusable(true);
        selector01.setVisible(false);
        selector02.setVisible(false);
        selector03.setVisible(false);
        selector04.setVisible(false);
        selector05.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        APP = new javax.swing.JPanel();
        btnminimizar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btncerrar = new javax.swing.JLabel();
        selector05 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        selector01 = new javax.swing.JLabel();
        selector02 = new javax.swing.JLabel();
        selector03 = new javax.swing.JLabel();
        selector04 = new javax.swing.JLabel();
        btncaja = new javax.swing.JLabel();
        btnprovedores = new javax.swing.JLabel();
        btncliente = new javax.swing.JLabel();
        btnvender = new javax.swing.JLabel();
        btntablero = new javax.swing.JLabel();
        btnhome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        APP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnminimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/minimizar_1.png"))); // NOI18N
        btnminimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnminimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnminimizarMouseClicked(evt);
            }
        });
        APP.add(btnminimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 30, 20, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-perfil.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        APP.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 282, 49));

        btncerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar_1.png"))); // NOI18N
        btncerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncerrarMouseClicked(evt);
            }
        });
        APP.add(btncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1062, 20, 20, 30));

        selector05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/selector premiun.png"))); // NOI18N
        selector05.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        APP.add(selector05, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 480, 30, 49));

        jPanel1.setBackground(new java.awt.Color(250, 252, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/texto bienvenida.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        APP.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 60, 803, 630));

        selector01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/selector premiun.png"))); // NOI18N
        selector01.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        APP.add(selector01, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 200, 30, 49));

        selector02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/selector premiun.png"))); // NOI18N
        selector02.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        APP.add(selector02, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 270, 30, 49));

        selector03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/selector premiun.png"))); // NOI18N
        selector03.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        APP.add(selector03, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 340, 30, 49));

        selector04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/selector premiun.png"))); // NOI18N
        selector04.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        APP.add(selector04, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 410, 30, 49));

        btncaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-caja.png"))); // NOI18N
        btncaja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncajaMouseClicked(evt);
            }
        });
        APP.add(btncaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 282, 49));

        btnprovedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-provedores.png"))); // NOI18N
        btnprovedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnprovedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnprovedoresMouseClicked(evt);
            }
        });
        APP.add(btnprovedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 410, 280, 49));

        btncliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-cliente.png"))); // NOI18N
        btncliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnclienteMouseClicked(evt);
            }
        });
        APP.add(btncliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 282, 49));

        btnvender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-vender.png"))); // NOI18N
        btnvender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnvender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnvenderMouseClicked(evt);
            }
        });
        APP.add(btnvender, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 270, 280, 49));

        btntablero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-tablero.png"))); // NOI18N
        btntablero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btntablero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btntableroMouseClicked(evt);
            }
        });
        APP.add(btntablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 280, 49));

        btnhome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnhomeMouseClicked(evt);
            }
        });
        APP.add(btnhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 46, 110, 20));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_1.png"))); // NOI18N
        APP.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 740));

        getContentPane().add(APP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnminimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnminimizarMouseClicked
     this.setExtendedState(ICONIFIED); 
    }//GEN-LAST:event_btnminimizarMouseClicked

    private void btncerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrarMouseClicked
     System.exit( 0 ); 
    }//GEN-LAST:event_btncerrarMouseClicked

    private void btntableroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntableroMouseClicked
        selector01.setVisible(true);
        selector02.setVisible(false);
        selector03.setVisible(false);
        selector04.setVisible(false);
        selector05.setVisible(false);
    }//GEN-LAST:event_btntableroMouseClicked

    private void btnvenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnvenderMouseClicked
        selector01.setVisible(false);
        selector02.setVisible(true);
        selector03.setVisible(false);
        selector04.setVisible(false);
        selector05.setVisible(false);
    }//GEN-LAST:event_btnvenderMouseClicked

    private void btnclienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnclienteMouseClicked
        selector01.setVisible(false);
        selector02.setVisible(false);
        selector03.setVisible(true);
        selector04.setVisible(false);
        selector05.setVisible(false);
    }//GEN-LAST:event_btnclienteMouseClicked

    private void btnprovedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnprovedoresMouseClicked
        selector01.setVisible(false);
        selector02.setVisible(false);
        selector03.setVisible(false);
        selector04.setVisible(true);
        selector05.setVisible(false);
    }//GEN-LAST:event_btnprovedoresMouseClicked

    private void btncajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncajaMouseClicked
        selector01.setVisible(false);
        selector02.setVisible(false);
        selector03.setVisible(false);
        selector04.setVisible(false);
        selector05.setVisible(true);
    }//GEN-LAST:event_btncajaMouseClicked

    private void btnhomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhomeMouseClicked
        
    }//GEN-LAST:event_btnhomeMouseClicked

 
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel APP;
    private javax.swing.JLabel btncaja;
    private javax.swing.JLabel btncerrar;
    private javax.swing.JLabel btncliente;
    private javax.swing.JLabel btnhome;
    private javax.swing.JLabel btnminimizar;
    private javax.swing.JLabel btnprovedores;
    private javax.swing.JLabel btntablero;
    private javax.swing.JLabel btnvender;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel selector01;
    private javax.swing.JLabel selector02;
    private javax.swing.JLabel selector03;
    private javax.swing.JLabel selector04;
    private javax.swing.JLabel selector05;
    // End of variables declaration//GEN-END:variables
}
