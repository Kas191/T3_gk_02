/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package proyecto.vista;

public class form_restablecerContraNew extends javax.swing.JDialog {

    /**
     * Creates new form form_restablecerContraNew
     */
    public form_restablecerContraNew(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_correo = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        btnValidar = new javax.swing.JButton();
        lblRestablerContrasena = new javax.swing.JLabel();
        btnMostrar = new javax.swing.JButton();
        btnMostrar1 = new javax.swing.JButton();
        btnMostrar2 = new javax.swing.JButton();
        txtCorreo = new javax.swing.JTextField();
        txtpasscontrasena = new javax.swing.JTextField();
        lblcontrasena = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        txtrpassconfircontra = new javax.swing.JPasswordField();
        lblconficontrasena = new javax.swing.JLabel();

        txt_correo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 48, 146)));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Restablecer Contraseña");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnValidar.setBackground(new java.awt.Color(0, 48, 146));
        btnValidar.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        btnValidar.setForeground(new java.awt.Color(255, 255, 255));
        btnValidar.setText("Validar");
        btnValidar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 255), new java.awt.Color(0, 0, 153), new java.awt.Color(102, 102, 255), new java.awt.Color(0, 0, 51)));
        btnValidar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarActionPerformed(evt);
            }
        });
        jPanel1.add(btnValidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 240, 30));

        lblRestablerContrasena.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        lblRestablerContrasena.setForeground(new java.awt.Color(0, 48, 146));
        lblRestablerContrasena.setText("Restablecer Contraseña");
        jPanel1.add(lblRestablerContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 320, 60));

        btnMostrar.setBackground(new java.awt.Color(0, 48, 146));
        btnMostrar.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        btnMostrar.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrar.setText("◕◕");
        btnMostrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 255), new java.awt.Color(0, 0, 153), new java.awt.Color(102, 102, 255), new java.awt.Color(0, 0, 51)));
        btnMostrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 40, 40));

        btnMostrar1.setBackground(new java.awt.Color(0, 48, 146));
        btnMostrar1.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        btnMostrar1.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrar1.setText("◕◕");
        btnMostrar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 255), new java.awt.Color(0, 0, 153), new java.awt.Color(102, 102, 255), new java.awt.Color(0, 0, 51)));
        btnMostrar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMostrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 40, 40));

        btnMostrar2.setBackground(new java.awt.Color(0, 48, 146));
        btnMostrar2.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        btnMostrar2.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrar2.setText("◕◕");
        btnMostrar2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 255), new java.awt.Color(0, 0, 153), new java.awt.Color(102, 102, 255), new java.awt.Color(0, 0, 51)));
        btnMostrar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMostrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrar2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 40, 40));

        txtCorreo.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 48, 146)));
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 240, 40));

        txtpasscontrasena.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtpasscontrasena.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 48, 146)));
        txtpasscontrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasscontrasenaActionPerformed(evt);
            }
        });
        jPanel1.add(txtpasscontrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 240, 40));

        lblcontrasena.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        lblcontrasena.setForeground(new java.awt.Color(102, 102, 102));
        lblcontrasena.setText("Contraseña");
        jPanel1.add(lblcontrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 100, -1));

        lblCorreo.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(102, 102, 102));
        lblCorreo.setText("Correo");
        jPanel1.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 50, -1));

        txtrpassconfircontra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 48, 146)));
        jPanel1.add(txtrpassconfircontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 240, 40));

        lblconficontrasena.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        lblconficontrasena.setForeground(new java.awt.Color(102, 102, 102));
        lblconficontrasena.setText("Confirmar Contraseña");
        jPanel1.add(lblconficontrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 160, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 420));

        setSize(new java.awt.Dimension(364, 427));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtpasscontrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasscontrasenaActionPerformed
       
    }//GEN-LAST:event_txtpasscontrasenaActionPerformed

    private void btnValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarActionPerformed
        
    }//GEN-LAST:event_btnValidarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
   
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnMostrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrar1ActionPerformed
     
       
    }//GEN-LAST:event_btnMostrar1ActionPerformed

    private void btnMostrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrar2ActionPerformed
      
    }//GEN-LAST:event_btnMostrar2ActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // Este método se dispara al presionar Enter en el campo de usuario.
        // La lógica de toggleAdminTokenVisibility ya está en KeyReleased para una mejor reactividad.

    }//GEN-LAST:event_txtCorreoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(form_restablecerContraNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_restablecerContraNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_restablecerContraNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_restablecerContraNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                form_restablecerContraNew dialog = new form_restablecerContraNew(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnMostrar1;
    private javax.swing.JButton btnMostrar2;
    private javax.swing.JButton btnValidar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblRestablerContrasena;
    private javax.swing.JLabel lblconficontrasena;
    private javax.swing.JLabel lblcontrasena;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JPasswordField txt_correo;
    private javax.swing.JTextField txtpasscontrasena;
    private javax.swing.JPasswordField txtrpassconfircontra;
    // End of variables declaration//GEN-END:variables
}
