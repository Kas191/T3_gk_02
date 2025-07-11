/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package proyecto.vista;

import javax.swing.JOptionPane;
import proyecto.controlador.ProductoController;
import proyecto.modelo.Producto;

public class form_RegistraProducto extends javax.swing.JDialog {

    /**
     * Creates new form form_RegistraProducto
     */
    public form_RegistraProducto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtrpassconfircontra = new javax.swing.JPasswordField();
        lblconficontrasena = new javax.swing.JLabel();
        lblcontrasena = new javax.swing.JLabel();
        txtpasscontrasena = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblCorreo = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        cmbMarcaProducto = new javax.swing.JComboBox<>();
        lblCorreo1 = new javax.swing.JLabel();
        lblCorreo2 = new javax.swing.JLabel();
        txtModeloProducto = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnGuardarProducto = new javax.swing.JButton();
        lblSistemaAdminstrador = new javax.swing.JLabel();
        lblSistemaAdminstrador1 = new javax.swing.JLabel();
        txtPrecioProducto1 = new javax.swing.JTextField();
        lblCorreo3 = new javax.swing.JLabel();

        txtrpassconfircontra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 48, 146)));

        lblconficontrasena.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        lblconficontrasena.setForeground(new java.awt.Color(102, 102, 102));
        lblconficontrasena.setText("Confirmar Contraseña");

        lblcontrasena.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        lblcontrasena.setForeground(new java.awt.Color(102, 102, 102));
        lblcontrasena.setText("Contraseña");

        txtpasscontrasena.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtpasscontrasena.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 48, 146)));
        txtpasscontrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasscontrasenaActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Nuevo Producto");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCorreo.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(102, 102, 102));
        lblCorreo.setText("Stock");
        jPanel1.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 170, -1));

        txtStock.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtStock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 48, 146)));
        txtStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockActionPerformed(evt);
            }
        });
        jPanel1.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 240, 40));

        cmbMarcaProducto.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        cmbMarcaProducto.setForeground(new java.awt.Color(0, 0, 255));
        cmbMarcaProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Samsung", "Redmi", "Huawei", "Motorola", "POCO", "Honor", "ZTE", "LG", "Nokia", "Vivo", "Tecno", "Itel", "Meizu", "Etoway", "JTEl", "SPARK", "Lotn", "Snapnini", "Sky Rock", "Sole", "Very Kool", "Logic", "Verde", "Gol", "Movie" }));
        cmbMarcaProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        jPanel1.add(cmbMarcaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 240, 40));

        lblCorreo1.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        lblCorreo1.setForeground(new java.awt.Color(102, 102, 102));
        lblCorreo1.setText("Modelo de Producto");
        jPanel1.add(lblCorreo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 170, -1));

        lblCorreo2.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        lblCorreo2.setForeground(new java.awt.Color(102, 102, 102));
        lblCorreo2.setText("Marca del Producto");
        jPanel1.add(lblCorreo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 170, -1));

        txtModeloProducto.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtModeloProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 48, 146)));
        txtModeloProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloProductoActionPerformed(evt);
            }
        });
        jPanel1.add(txtModeloProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 240, 40));

        btnCancelar.setBackground(new java.awt.Color(0, 48, 146));
        btnCancelar.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 255), new java.awt.Color(0, 0, 153), new java.awt.Color(102, 102, 255), new java.awt.Color(0, 0, 51)));
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 240, 30));

        btnGuardarProducto.setBackground(new java.awt.Color(0, 48, 146));
        btnGuardarProducto.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        btnGuardarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarProducto.setText("Guardar Producto");
        btnGuardarProducto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 255), new java.awt.Color(0, 0, 153), new java.awt.Color(102, 102, 255), new java.awt.Color(0, 0, 51)));
        btnGuardarProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 240, 30));

        lblSistemaAdminstrador.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        lblSistemaAdminstrador.setForeground(new java.awt.Color(0, 48, 146));
        lblSistemaAdminstrador.setText("Producto");
        jPanel1.add(lblSistemaAdminstrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 300, 60));

        lblSistemaAdminstrador1.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        lblSistemaAdminstrador1.setForeground(new java.awt.Color(0, 48, 146));
        lblSistemaAdminstrador1.setText("Registro de nuevo");
        jPanel1.add(lblSistemaAdminstrador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 370, 60));

        txtPrecioProducto1.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtPrecioProducto1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 48, 146)));
        txtPrecioProducto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioProducto1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrecioProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 240, 40));

        lblCorreo3.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        lblCorreo3.setForeground(new java.awt.Color(102, 102, 102));
        lblCorreo3.setText("Precio");
        jPanel1.add(lblCorreo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 170, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 550));

        setSize(new java.awt.Dimension(414, 557));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private boolean productoRegistrado = false;

    public boolean isProductoRegistrado() {
        return productoRegistrado;
    }
    private void txtpasscontrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasscontrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasscontrasenaActionPerformed

    private void txtStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockActionPerformed

    private void txtModeloProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloProductoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        productoRegistrado = false;
        dispose(); // Cierra el JDialog
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProductoActionPerformed
        String marca = cmbMarcaProducto.getSelectedItem().toString().trim();
        String modelo = txtModeloProducto.getText().trim();
        String precioTexto = txtPrecioProducto1.getText().trim();
        String stockTexto = txtStock.getText().trim(); // primero como String

         // Validación de campos vacíos
        if (marca.equals("Seleccione") || modelo.isEmpty() || precioTexto.isEmpty() || stockTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos (Marca, Modelo, Precio y Stock) son obligatorios.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Validación de precio
        double precio;
        try {
            precio = Double.parseDouble(precioTexto);
            if (precio <= 0) {
                JOptionPane.showMessageDialog(this, "El precio debe ser mayor a 0.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un precio válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validación de stock
        int stock;
        try {
            stock = Integer.parseInt(stockTexto);
            if (stock < 0 || stock > 5) {
                JOptionPane.showMessageDialog(this, "El stock debe estar entre 0 y 5.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido para el stock.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Registro del producto
        Producto nuevoProducto = new Producto(marca, modelo, precio, stock);
        ProductoController controller = new ProductoController();

        boolean guardado = controller.registrarProducto(nuevoProducto);

        if (guardado) {
            JOptionPane.showMessageDialog(this, "Producto registrado correctamente.");
            productoRegistrado = true;
            dispose(); // Cierra el JDialog
        } else {
            JOptionPane.showMessageDialog(this, "El producto ya existe o ocurrió un error.");
        }

    }//GEN-LAST:event_btnGuardarProductoActionPerformed

    private void txtPrecioProducto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioProducto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioProducto1ActionPerformed

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
            java.util.logging.Logger.getLogger(form_RegistraProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_RegistraProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_RegistraProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_RegistraProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                form_RegistraProducto dialog = new form_RegistraProducto(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardarProducto;
    private javax.swing.JComboBox<String> cmbMarcaProducto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblCorreo1;
    private javax.swing.JLabel lblCorreo2;
    private javax.swing.JLabel lblCorreo3;
    private javax.swing.JLabel lblSistemaAdminstrador;
    private javax.swing.JLabel lblSistemaAdminstrador1;
    private javax.swing.JLabel lblconficontrasena;
    private javax.swing.JLabel lblcontrasena;
    private javax.swing.JTextField txtModeloProducto;
    private javax.swing.JTextField txtPrecioProducto1;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtpasscontrasena;
    private javax.swing.JPasswordField txtrpassconfircontra;
    // End of variables declaration//GEN-END:variables
}
