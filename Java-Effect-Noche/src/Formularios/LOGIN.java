
package Formularios;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import static javafx.scene.paint.Color.color;
import javax.swing.JOptionPane;


public class LOGIN extends javax.swing.JFrame {

    
    public LOGIN() {
        initComponents();
        this.setLocationRelativeTo(null);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
       // this.setLocation(dim.width/2-this.getSize().width, dim.height/2-this.getSize().height);
        this.setBackground(new Color(0,0,0,0));
        panellogin.setBackground(new Color(0,0,0,0));
        panellogin.setFocusable(true);
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        panellogin = new javax.swing.JPanel();
        btnentrar = new javax.swing.JLabel();
        btnminimizar = new javax.swing.JLabel();
        btncerrar = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();
        usuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panellogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnentrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn-entrar.png"))); // NOI18N
        btnentrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnentrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnentrarMouseClicked(evt);
            }
        });
        panellogin.add(btnentrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 260, 60));

        btnminimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/minimizar_1.png"))); // NOI18N
        btnminimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnminimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnminimizarMouseClicked(evt);
            }
        });
        panellogin.add(btnminimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 20, 20));

        btncerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar_1.png"))); // NOI18N
        btncerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncerrarMouseClicked(evt);
            }
        });
        panellogin.add(btncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 20, 30));

        contraseña.setFont(new java.awt.Font("Malayalam Sangam MN", 0, 15)); // NOI18N
        contraseña.setForeground(new java.awt.Color(92, 92, 92));
        contraseña.setText("Contraseña");
        contraseña.setBorder(null);
        contraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                contraseñaFocusLost(evt);
            }
        });
        contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contraseñaMouseClicked(evt);
            }
        });
        panellogin.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 251, 217, 25));

        usuario.setFont(new java.awt.Font("Myanmar Sangam MN", 0, 15)); // NOI18N
        usuario.setForeground(new java.awt.Color(92, 92, 92));
        usuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        usuario.setText("Usuario");
        usuario.setBorder(null);
        usuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                usuarioFocusLost(evt);
            }
        });
        usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuarioMouseClicked(evt);
            }
        });
        panellogin.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 199, 217, 25));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGIN.png"))); // NOI18N
        panellogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 340, 570));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGIN.png"))); // NOI18N
        panellogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 340, 570));

        getContentPane().add(panellogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioMouseClicked
                usuario.setText("");
    }//GEN-LAST:event_usuarioMouseClicked

    private void contraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseñaMouseClicked
                contraseña.setText("");
    }//GEN-LAST:event_contraseñaMouseClicked

    private void btnminimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnminimizarMouseClicked
                this.setExtendedState(ICONIFIED);      
    }//GEN-LAST:event_btnminimizarMouseClicked

    private void btncerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrarMouseClicked
                System.exit( 0 ); 
    }//GEN-LAST:event_btncerrarMouseClicked

    private void usuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usuarioFocusLost
        if(usuario.getText().equals("")){
        usuario.setText("Usuario");
    }//GEN-LAST:event_usuarioFocusLost
    }
    private void contraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contraseñaFocusLost
        if(contraseña.getText().equals("")){
        contraseña.setText("Contraseña");
        
    }//GEN-LAST:event_contraseñaFocusLost
    }
        
        
        
    private void btnentrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnentrarMouseClicked
        String user = "admin";
        String pass = "1234";
        
        if(usuario.getText().equals(user)&&contraseña.getText().equals(pass)){
        
            PanelOpcion G1 = new PanelOpcion();
            G1.setVisible(true);
            dispose();
            
        }
        else{
        
            JOptionPane.showMessageDialog(null, "intente de nuevo");
           
        
        }      
        
    }//GEN-LAST:event_btnentrarMouseClicked
    
  
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btncerrar;
    private javax.swing.JLabel btnentrar;
    private javax.swing.JLabel btnminimizar;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel panellogin;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
