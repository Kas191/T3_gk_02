package proyecto.vista; // Asegúrate de que este es el paquete correcto para tu archivo.

// Importa las clases necesarias de tus paquetes
import proyecto.controlador.LoginController;
import proyecto.controlador.UsuarioController;
import proyecto.modelo.Usuario; // Para el objeto Usuario que se devuelve al autenticar
import proyecto.util.Mensajes; // Para mostrar mensajes estandarizados
import javax.swing.JFileChooser; // Necesario para el selector de archivos
import javax.swing.JOptionPane; // Para mensajes de diálogo
import java.io.BufferedReader; // Para leer el archivo de token
import java.io.File; // Para manejar archivos
import java.io.FileReader; // Para leer el archivo de token
import java.io.IOException; // Para manejar excepciones de I/O
import java.awt.event.KeyEvent; // Necesario para KeyListener
import java.awt.event.KeyListener; // Necesario para KeyListener

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author User0
 */
public class form_login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public form_login() {

        initComponents(); // Método generado por NetBeans para inicializar los componentes visuales

        // Inicializa los controladores después de que los componentes de la UI se han creado
        // Inicializa los controladores después de que los componentes de la UI se han creado
        usuarioController = new UsuarioController(); // Esto carga los usuarios desde usuarios.txt o los inicializa
        loginController = new LoginController(usuarioController);

        // **Configuración inicial de los campos de token: OCULTOS por defecto en el CÓDIGO**
        // Estas líneas aseguran que txtTokenAdmin y lblTokenAdmin estén ocultos al inicio.
        // Asegúrate de que 'txtTokenAdmin' y 'lblTokenAdmin' estén creados en el diseñador.
        txtTokenAdmin.setVisible(false);
        lblTokenAdmin.setVisible(false);

        // Ajustar el texto del botón "Subir Tk" para que sea más descriptivo
        btnSubirTk.setText("Subir Token Admin");

    
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JLayeredPane();
        lblLogin = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        txtUsuario = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        btnSubirTk = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnOlvideContrasena = new javax.swing.JButton();
        btnIngresar2 = new javax.swing.JButton();
        lblTokenAdmin = new javax.swing.JLabel();
        jPasswordFieldA1 = new javax.swing.JPasswordField();
        txtTokenAdmin = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de sesión - MULTITEC D&J");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusable(false);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setToolTipText("");
        bg.setOpaque(true);
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogin.setFont(new java.awt.Font("Yu Gothic", 1, 50)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(0, 48, 146));
        lblLogin.setText("LOGIN");
        bg.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 200, 80));

        jLayeredPane1.setBackground(new java.awt.Color(0, 48, 146));
        jLayeredPane1.setOpaque(true);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        bg.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 440));

        txtUsuario.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 48, 146)));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        bg.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 210, 40));

        lblUsuario.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(102, 102, 102));
        lblUsuario.setText("Usuario");
        bg.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 50, -1));

        lblContraseña.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(102, 102, 102));
        lblContraseña.setText("Contraseña");
        bg.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 100, -1));

        btnSubirTk.setBackground(new java.awt.Color(0, 48, 146));
        btnSubirTk.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        btnSubirTk.setForeground(new java.awt.Color(255, 255, 255));
        btnSubirTk.setText("Subir Token");
        btnSubirTk.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 255), new java.awt.Color(0, 0, 153), new java.awt.Color(102, 102, 255), new java.awt.Color(0, 0, 51)));
        btnSubirTk.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSubirTk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirTkActionPerformed(evt);
            }
        });
        bg.add(btnSubirTk, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 220, 30));

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
        bg.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 40, 40));

        btnOlvideContrasena.setBackground(new java.awt.Color(0, 48, 146));
        btnOlvideContrasena.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        btnOlvideContrasena.setForeground(new java.awt.Color(255, 255, 255));
        btnOlvideContrasena.setText("Olvide Contraseña");
        btnOlvideContrasena.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 255), new java.awt.Color(0, 0, 153), new java.awt.Color(102, 102, 255), new java.awt.Color(0, 0, 51)));
        btnOlvideContrasena.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOlvideContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOlvideContrasenaActionPerformed(evt);
            }
        });
        bg.add(btnOlvideContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 210, 30));

        btnIngresar2.setBackground(new java.awt.Color(0, 48, 146));
        btnIngresar2.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        btnIngresar2.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar2.setText("Ingresar");
        btnIngresar2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 255), new java.awt.Color(0, 0, 153), new java.awt.Color(102, 102, 255), new java.awt.Color(0, 0, 51)));
        btnIngresar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIngresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresar2ActionPerformed(evt);
            }
        });
        bg.add(btnIngresar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 210, 30));

        lblTokenAdmin.setText("Token Admin");
        bg.add(lblTokenAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 90, 30));

        jPasswordFieldA1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 48, 146)));
        jPasswordFieldA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldA1ActionPerformed(evt);
            }
        });
        bg.add(jPasswordFieldA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 210, 40));
        bg.add(txtTokenAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 120, -1));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 440));

        setSize(new java.awt.Dimension(682, 448));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void addEventHandlers() {
        btnSubirTk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirTkActionPerformed(evt);
            }
        });

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt); // Este método está vacío por ahora, puedes usarlo si necesitas
            }
        });

        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnOlvideContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOlvideContrasenaActionPerformed(evt);
            }
        });

        btnIngresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresar2ActionPerformed(evt);
            }
        });

        // Listener para el campo de usuario para controlar la visibilidad del token
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() { // Usa KeyAdapter para KeyListener
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                toggleAdminTokenVisibility();
            }
        });
    }

    private void toggleAdminTokenVisibility() {
        boolean isAdmin = txtUsuario.getText().trim().equalsIgnoreCase("admin");
        lblTokenAdmin.setVisible(isAdmin);
        txtTokenAdmin.setVisible(isAdmin);

        // Opcional: Limpiar el campo de token si se oculta
        if (!isAdmin) {
            txtTokenAdmin.setText("");
            loadedAdminToken = null; // Reiniciar el token cargado
        }
        // Revalidar y repintar el panel para que los cambios de visibilidad se apliquen
        bg.revalidate();
        bg.repaint();
    }

    // Listener para el botón "Subir Token Admin" (btnSubirTk)
    // Este método abrirá el JFileChooser para seleccionar el archivo de token.
    private void btnSubirTkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirTkActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Seleccionar archivo de Token de Administrador");

        // Opcional: Filtrar para mostrar solo archivos de texto
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Archivos de Texto (*.txt)", "txt"));

        int userSelection = fileChooser.showOpenDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToLoad = fileChooser.getSelectedFile();
            try (BufferedReader br = new BufferedReader(new FileReader(fileToLoad))) {
                loadedAdminToken = br.readLine(); // Leer la primera línea del archivo como el token
                if (loadedAdminToken != null && !loadedAdminToken.trim().isEmpty()) {
                    loadedAdminToken = loadedAdminToken.trim(); // Limpiar espacios en blanco
                    Mensajes.mostrarInfo("Token cargado exitosamente desde: " + fileToLoad.getName());
                    // Mostrar el token en el campo de texto (si está visible)
                    if (txtTokenAdmin.isVisible()) {
                        txtTokenAdmin.setText(loadedAdminToken);
                    }
                } else {
                    loadedAdminToken = null;
                    Mensajes.mostrarAdvertencia("El archivo de token está vacío o no contiene un token válido.");
                }
            } catch (IOException ex) {
                Mensajes.mostrarError("Error al leer el archivo de token: " + ex.getMessage());
                loadedAdminToken = null;
            }
        }
    }//GEN-LAST:event_btnSubirTkActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
       


    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        if (jPasswordFieldA1.getEchoChar() == '•') { // Carácter por defecto para ocultar contraseña
            jPasswordFieldA1.setEchoChar((char) 0); // Mostrar texto (el caracter 0 no oculta)
        } else {
            jPasswordFieldA1.setEchoChar('•'); // Ocultar texto
        }
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnOlvideContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOlvideContrasenaActionPerformed
        // Abrir la ventana de "Olvidé mi Contraseña" (form_restablecercontra.java)
        Mensajes.mostrarInfo("Abriendo formulario de 'Olvidé mi Contraseña'.");
        java.awt.Frame parent = (java.awt.Frame) this.getParent();
        form_restablecerContraNew restablecerContra = new form_restablecerContraNew(parent, true);
        restablecerContra.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnOlvideContrasenaActionPerformed

    private void btnIngresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresar2ActionPerformed
        String username = txtUsuario.getText().trim();
        String password = new String(jPasswordFieldA1.getPassword()).trim(); // Obtener la contraseña como String

        // Validar que los campos de usuario y contraseña no estén vacíos
        if (username.isEmpty() || password.isEmpty()) {
            Mensajes.mostrarError("Por favor, ingresa usuario y contraseña.");
            return;
        }

        Usuario loggedInUser = null;

        // Comprobar si el usuario intenta loguearse como administrador
        if (username.equalsIgnoreCase("admin")) {
            // Para el administrador, se requiere un token cargado desde archivo
            if (loadedAdminToken == null || loadedAdminToken.isEmpty()) {
                Mensajes.mostrarError("Para el administrador, por favor, sube el archivo de Token Admin.");
                return;
            }
            // Intento de login del administrador con usuario, contraseña y token
            loggedInUser = loginController.autenticarAdminConToken(username, password, loadedAdminToken);
        } else {
            // Intento de login para otros roles (empleado, jefe) sin token
            loggedInUser = loginController.autenticar(username, password);
        }

        // Manejo del resultado del login
        if (loggedInUser != null) {
            Mensajes.mostrarInfo("¡Bienvenido, " + loggedInUser.getNombre() + "! Rol: " + loggedInUser.getRol());
            JOptionPane.showMessageDialog(this, "Login exitoso!\nRol: " + loggedInUser.getRol(), "Éxito", JOptionPane.INFORMATION_MESSAGE);

            // Cerrar la ventana de login
            this.dispose();

            // Redirigir según el rol del usuario
            if (loggedInUser.getRol().equalsIgnoreCase("Admin")) {
                // Abrir la ventana del Sistema Administrador de Usuarios
                form_SistemaAdmin sistemaAdmin = new form_SistemaAdmin();
                sistemaAdmin.setVisible(true);
            } else if (loggedInUser.getRol().equalsIgnoreCase("Jefe_Abastecimiento")) {
                Mensajes.mostrarInfo("Redirigiendo a la Interfaz de Jefe de Abastecimiento.");
                form_JefeAbasGestionInventario gestionInventario = new form_JefeAbasGestionInventario();
                gestionInventario.setVisible(true);
            } else if (loggedInUser.getRol().equalsIgnoreCase("Empleado")) {
                Mensajes.mostrarInfo("Redirigiendo a la Interfaz de Empleado (Ventas).");
                form_Empleado panelEmpleado = new form_Empleado();
                panelEmpleado.setVisible(true);
            }

        } else {
            Mensajes.mostrarError("Usuario, contraseña o token incorrectos.");
        }
    }//GEN-LAST:event_btnIngresar2ActionPerformed

    private void jPasswordFieldA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldA1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldA1ActionPerformed

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
            java.util.logging.Logger.getLogger(form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new UsuarioController();
                new form_login().setVisible(true);
            }
        });
    }

    private UsuarioController usuarioController;
    private LoginController loginController;
    private String loadedAdminToken = null;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane bg;
    private javax.swing.JButton btnIngresar2;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnOlvideContrasena;
    private javax.swing.JButton btnSubirTk;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPasswordField jPasswordFieldA1;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblTokenAdmin;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtTokenAdmin;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
