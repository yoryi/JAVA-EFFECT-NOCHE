
package Formularios;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;


public class PanelOpcion extends javax.swing.JFrame {

    
    public PanelOpcion() {
        initComponents();
        this.setLocationRelativeTo(null);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
       // this.setLocation(dim.width/2-this.getSize().width, dim.height/2-this.getSize().height);
        this.setBackground(new Color(0,0,0,0));
        APP.setBackground(new Color(0,0,0,0));
        APP.setFocusable(true);
        panelnoche.setVisible(false);
        btnnoche.setVisible(false);
        btnusuarionoche.setVisible(false);
        btnuseradminnoche.setVisible(false);
        btnadministradornoche.setVisible(false);
        activeadministradornoche.setVisible(false);
        activeuseradminnoche.setVisible(false);
        activeusuarionoche.setVisible(false);
        activeusuariodia.setVisible(false);
        activeadministradordia.setVisible(false);
        activeuseradmindia.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        APP = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        activeuseradmindia = new javax.swing.JLabel();
        activeadministradordia = new javax.swing.JLabel();
        activeusuariodia = new javax.swing.JLabel();
        btnusuariodia = new javax.swing.JLabel();
        btnadministradordia = new javax.swing.JLabel();
        btnuseradmindia = new javax.swing.JLabel();
        activeusuarionoche = new javax.swing.JLabel();
        activeuseradminnoche = new javax.swing.JLabel();
        activeadministradornoche = new javax.swing.JLabel();
        btnusuarionoche = new javax.swing.JLabel();
        btnuseradminnoche = new javax.swing.JLabel();
        btnadministradornoche = new javax.swing.JLabel();
        btnnoche = new javax.swing.JLabel();
        btndia = new javax.swing.JLabel();
        panelnoche = new javax.swing.JLabel();
        paneldia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        APP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        APP.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 76, 30, 10));

        activeuseradmindia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        activeuseradmindia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/active usuarioadmin dia.png"))); // NOI18N
        activeuseradmindia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        APP.add(activeuseradmindia, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 261, 230, 220));

        activeadministradordia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        activeadministradordia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/active dministrador dia.png"))); // NOI18N
        activeadministradordia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        APP.add(activeadministradordia, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 260, 230, 220));

        activeusuariodia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        activeusuariodia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/active usuario dia.png"))); // NOI18N
        activeusuariodia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        APP.add(activeusuariodia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 261, 230, 220));

        btnusuariodia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnusuariodia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-usuario.png"))); // NOI18N
        btnusuariodia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnusuariodia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnusuariodiaMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnusuariodiaMouseEntered(evt);
            }
        });
        APP.add(btnusuariodia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 261, 230, 220));

        btnadministradordia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnadministradordia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-administrador.png"))); // NOI18N
        btnadministradordia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnadministradordia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnadministradordiaMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnadministradordiaMouseEntered(evt);
            }
        });
        APP.add(btnadministradordia, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 260, 230, 220));

        btnuseradmindia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnuseradmindia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-usuarioadmin.png"))); // NOI18N
        btnuseradmindia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnuseradmindia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnuseradmindiaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnuseradmindiaMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnuseradmindiaMouseEntered(evt);
            }
        });
        APP.add(btnuseradmindia, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 261, 230, 220));

        activeusuarionoche.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        activeusuarionoche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/active-noche-usuario.png"))); // NOI18N
        activeusuarionoche.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        APP.add(activeusuarionoche, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 255, 230, 220));

        activeuseradminnoche.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        activeuseradminnoche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/active-noche-useradmin.png"))); // NOI18N
        activeuseradminnoche.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        APP.add(activeuseradminnoche, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 255, 230, 220));

        activeadministradornoche.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        activeadministradornoche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/active-noche-admin.png"))); // NOI18N
        activeadministradornoche.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        APP.add(activeadministradornoche, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 255, 230, 220));

        btnusuarionoche.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnusuarionoche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-usuario-noche.png"))); // NOI18N
        btnusuarionoche.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnusuarionoche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnusuarionocheMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnusuarionocheMouseEntered(evt);
            }
        });
        APP.add(btnusuarionoche, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 255, 230, 220));

        btnuseradminnoche.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnuseradminnoche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-usuarioadmin-noche.png"))); // NOI18N
        btnuseradminnoche.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnuseradminnoche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnuseradminnocheMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnuseradminnocheMouseEntered(evt);
            }
        });
        APP.add(btnuseradminnoche, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 255, 230, 220));

        btnadministradornoche.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnadministradornoche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-administrador-noche.png"))); // NOI18N
        btnadministradornoche.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnadministradornoche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnadministradornocheMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnadministradornocheMouseEntered(evt);
            }
        });
        APP.add(btnadministradornoche, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 255, 230, 220));

        btnnoche.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnnoche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-noche.png"))); // NOI18N
        btnnoche.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnnoche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnnocheMouseClicked(evt);
            }
        });
        APP.add(btnnoche, new org.netbeans.lib.awtextra.AbsoluteConstraints(1017, 37, -1, 40));

        btndia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btndia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-dia.png"))); // NOI18N
        btndia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btndia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndiaMouseClicked(evt);
            }
        });
        APP.add(btndia, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 37, -1, 40));

        panelnoche.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelnoche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/paneloscuro.png"))); // NOI18N
        APP.add(panelnoche, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 740));

        paneldia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paneldia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/panel claro.png"))); // NOI18N
        APP.add(paneldia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 740));

        getContentPane().add(APP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnocheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnocheMouseClicked
        panelnoche.setVisible(false);
        btndia.setVisible(true);
        paneldia.setVisible(true);
        btnnoche.setVisible(false);
        btnadministradordia.setVisible(true);
        btnusuariodia.setVisible(true);
        btnuseradmindia.setVisible(true);
        btnusuarionoche.setVisible(false);
        btnuseradminnoche.setVisible(false);
        btnadministradornoche.setVisible(false);
        
        
    }//GEN-LAST:event_btnnocheMouseClicked

    private void btndiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndiaMouseClicked
        btnadministradordia.setVisible(false);
        btnusuariodia.setVisible(false);
        btnuseradmindia.setVisible(false);
        paneldia.setVisible(false);
        panelnoche.setVisible(true);
        btndia.setVisible(false);
        btnnoche.setVisible(true);
        btnusuarionoche.setVisible(true);
        btnuseradminnoche.setVisible(true);
        btnadministradornoche.setVisible(true);
        
    }//GEN-LAST:event_btndiaMouseClicked

    private void btnadministradornocheMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnadministradornocheMouseEntered
        activeadministradornoche.setVisible(true);
    }//GEN-LAST:event_btnadministradornocheMouseEntered

    private void btnadministradornocheMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnadministradornocheMouseExited
        activeadministradornoche.setVisible(false);
    }//GEN-LAST:event_btnadministradornocheMouseExited

    private void btnuseradminnocheMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnuseradminnocheMouseEntered
        activeuseradminnoche.setVisible(true);
    }//GEN-LAST:event_btnuseradminnocheMouseEntered

    private void btnuseradminnocheMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnuseradminnocheMouseExited
        activeuseradminnoche.setVisible(false);
    }//GEN-LAST:event_btnuseradminnocheMouseExited

    private void btnusuarionocheMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnusuarionocheMouseEntered
        activeusuarionoche.setVisible(true);
    }//GEN-LAST:event_btnusuarionocheMouseEntered

    private void btnusuarionocheMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnusuarionocheMouseExited
       activeusuarionoche.setVisible(false);
    }//GEN-LAST:event_btnusuarionocheMouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       this.setExtendedState(ICONIFIED); 
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnusuariodiaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnusuariodiaMouseEntered
       activeusuariodia.setVisible(true);
    }//GEN-LAST:event_btnusuariodiaMouseEntered

    private void btnusuariodiaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnusuariodiaMouseExited
       activeusuariodia.setVisible(false);
    }//GEN-LAST:event_btnusuariodiaMouseExited

    private void btnuseradmindiaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnuseradmindiaMouseEntered
       activeuseradmindia.setVisible(true);
    }//GEN-LAST:event_btnuseradmindiaMouseEntered

    private void btnuseradmindiaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnuseradmindiaMouseExited
      activeuseradmindia.setVisible(false);
    }//GEN-LAST:event_btnuseradmindiaMouseExited

    private void btnadministradordiaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnadministradordiaMouseEntered
       activeadministradordia.setVisible(true);
    }//GEN-LAST:event_btnadministradordiaMouseEntered

    private void btnadministradordiaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnadministradordiaMouseExited
       activeadministradordia.setVisible(false);
    }//GEN-LAST:event_btnadministradordiaMouseExited

    private void btnuseradmindiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnuseradmindiaMouseClicked
            App G1 = new App();
            G1.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnuseradmindiaMouseClicked

 
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelOpcion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel APP;
    private javax.swing.JLabel activeadministradordia;
    private javax.swing.JLabel activeadministradornoche;
    private javax.swing.JLabel activeuseradmindia;
    private javax.swing.JLabel activeuseradminnoche;
    private javax.swing.JLabel activeusuariodia;
    private javax.swing.JLabel activeusuarionoche;
    private javax.swing.JLabel btnadministradordia;
    private javax.swing.JLabel btnadministradornoche;
    private javax.swing.JLabel btndia;
    private javax.swing.JLabel btnnoche;
    private javax.swing.JLabel btnuseradmindia;
    private javax.swing.JLabel btnuseradminnoche;
    private javax.swing.JLabel btnusuariodia;
    private javax.swing.JLabel btnusuarionoche;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel paneldia;
    private javax.swing.JLabel panelnoche;
    // End of variables declaration//GEN-END:variables
}
