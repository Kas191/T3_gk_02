package proyecto.vista;

import proyecto.controlador.UsuarioController;
import proyecto.modelo.Usuario;
import proyecto.util.Mensajes;

// iText (PDF)
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.Chunk;
import com.lowagie.text.pdf.PdfWriter;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfPCell;
import java.awt.Color;

// Utilidades Java
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

// Swing
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;


public class form_SistemaAdmin extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public form_SistemaAdmin() {
        initComponents();

        usuarioController = new UsuarioController(); // Instancia del controlador de usuarios

        // Configuración inicial de la tabla de usuarios
        String[] columnNames = {"Nombre", "Apellido", "Usuario", "Correo", "Rol", "Contraseña"}; // Columna "Contraseña" se mostrará oculta
        tableModel = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Las celdas de la tabla no son editables directamente
            }
        };
        tableAdmin.setModel(tableModel); // Asignar el modelo a la tabla
        tableAdmin.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // Solo una fila seleccionable

      
        cargarTablaUsuarios();//Llama  a la tabla 
    }

  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JLayeredPane();
        lblSistemaAdminstrador = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAdmin = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnSalirAdmin = new javax.swing.JButton();
        btnBorrarUsuario = new javax.swing.JButton();
        btnCrearNuevoUsuario1 = new javax.swing.JButton();
        btnReportedeVentas = new javax.swing.JButton();
        btnbBuscar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        btnExportarUsuariosPdf = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        btnCredencialesUsuarios1 = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Administrador");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusable(false);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setToolTipText("");
        bg.setOpaque(true);
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSistemaAdminstrador.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        lblSistemaAdminstrador.setForeground(new java.awt.Color(0, 48, 146));
        lblSistemaAdminstrador.setText("Sistema Administrador de Usuarios");
        bg.add(lblSistemaAdminstrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 660, 60));

        tableAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableAdmin);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 650, 270));

        jPanel1.setBackground(new java.awt.Color(54, 116, 181));

        btnSalirAdmin.setBackground(new java.awt.Color(203, 4, 4));
        btnSalirAdmin.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        btnSalirAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnSalirAdmin.setText("Salir de la Cuenta");
        btnSalirAdmin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        btnSalirAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalirAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirAdminActionPerformed(evt);
            }
        });

        btnBorrarUsuario.setBackground(new java.awt.Color(0, 48, 146));
        btnBorrarUsuario.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        btnBorrarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrarUsuario.setText("Borrar Usuario");
        btnBorrarUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 255), new java.awt.Color(0, 0, 153), new java.awt.Color(102, 102, 255), new java.awt.Color(0, 0, 51)));
        btnBorrarUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBorrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarUsuarioActionPerformed(evt);
            }
        });

        btnCrearNuevoUsuario1.setBackground(new java.awt.Color(0, 48, 146));
        btnCrearNuevoUsuario1.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        btnCrearNuevoUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearNuevoUsuario1.setText("Crear Nuevo Usuario");
        btnCrearNuevoUsuario1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 255), new java.awt.Color(0, 0, 153), new java.awt.Color(102, 102, 255), new java.awt.Color(0, 0, 51)));
        btnCrearNuevoUsuario1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCrearNuevoUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearNuevoUsuario1ActionPerformed(evt);
            }
        });

        btnReportedeVentas.setBackground(new java.awt.Color(0, 48, 146));
        btnReportedeVentas.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        btnReportedeVentas.setForeground(new java.awt.Color(255, 255, 255));
        btnReportedeVentas.setText("Reporte de ventas");
        btnReportedeVentas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 255), new java.awt.Color(0, 0, 153), new java.awt.Color(102, 102, 255), new java.awt.Color(0, 0, 51)));
        btnReportedeVentas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReportedeVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportedeVentasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCrearNuevoUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReportedeVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalirAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(btnCrearNuevoUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBorrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReportedeVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147)
                .addComponent(btnSalirAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, -10, 210, 620));

        btnbBuscar.setBackground(new java.awt.Color(255, 221, 87));
        btnbBuscar.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        btnbBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnbBuscar.setText("Buscar");
        btnbBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(245, 200, 66), new java.awt.Color(255, 236, 143), new java.awt.Color(204, 144, 30), new java.awt.Color(234, 184, 56)));
        btnbBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbBuscarActionPerformed(evt);
            }
        });
        bg.add(btnbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 140, 40));
        bg.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 120, 40));

        btnExportarUsuariosPdf.setBackground(new java.awt.Color(153, 204, 0));
        btnExportarUsuariosPdf.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        btnExportarUsuariosPdf.setForeground(new java.awt.Color(255, 255, 255));
        btnExportarUsuariosPdf.setText("Exportar Lista de Usuarios PDF");
        btnExportarUsuariosPdf.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 153, 0), new java.awt.Color(51, 153, 0), new java.awt.Color(153, 204, 0), new java.awt.Color(102, 255, 0)));
        btnExportarUsuariosPdf.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExportarUsuariosPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarUsuariosPdfActionPerformed(evt);
            }
        });
        bg.add(btnExportarUsuariosPdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 220, 40));

        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        bg.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 440, 40));

        btnCredencialesUsuarios1.setBackground(new java.awt.Color(0, 48, 146));
        btnCredencialesUsuarios1.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        btnCredencialesUsuarios1.setForeground(new java.awt.Color(255, 255, 255));
        btnCredencialesUsuarios1.setText("Generar TXT de Backup");
        btnCredencialesUsuarios1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 255), new java.awt.Color(0, 0, 153), new java.awt.Color(102, 102, 255), new java.awt.Color(0, 0, 51)));
        btnCredencialesUsuarios1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCredencialesUsuarios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCredencialesUsuarios1ActionPerformed(evt);
            }
        });
        bg.add(btnCredencialesUsuarios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 220, 40));

        btnVolver.setBackground(new java.awt.Color(102, 153, 255));
        btnVolver.setText("⟳");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        bg.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 50, 40));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 490));

        setSize(new java.awt.Dimension(862, 495));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addEventHandlers() {
        btnSalirAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirAdminActionPerformed(evt);
            }
        });

        btnCrearNuevoUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearNuevoUsuario1ActionPerformed(evt);
            }
        });

      

        btnBorrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarUsuarioActionPerformed(evt);
            }
        });

      
        btnReportedeVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportedeVentasActionPerformed(evt);
            }
        });

        // Listener para el botón "Exportar Lista de Usuarios PDF" (futuro sprint)
        btnExportarUsuariosPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarUsuariosPdfActionPerformed(evt);
            }
        });
    }

    // Método para cargar los usuarios en la tabla (renombrado de 'actualizarTabla')
    public void cargarTablaUsuarios() {
        tableModel.setRowCount(0); // Limpia todas las filas existentes

        List<Usuario> users = usuarioController.listarUsuarios();

        for (Usuario u : users) {
            // Se muestra al usuario 'admin' en la tabla ahora, para ver todos los usuarios.
            // Si no quieres mostrarlo, agrega: if (!u.getUsuario().equalsIgnoreCase("admin")) { ... }
            Object[] rowData = {
                u.getNombre(),
                u.getApellido(),
                u.getUsuario(), // Nombre de usuario (username)
                u.getCorreo(),
                u.getRol(),
                 usuarioController.decodePassword(u.getClave()) 
            };
            tableModel.addRow(rowData);
        }
    }

    private void btnSalirAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirAdminActionPerformed
        form_login login = new form_login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirAdminActionPerformed
    private void actualizarTabla() {
        int selectedRow = tableAdmin.getSelectedRow();
        if (selectedRow != -1) { // Si hay una fila seleccionada
            // Obtener el nombre de usuario de la fila seleccionada (columna 2, índice 2)
            String usernameToEdit = (String) tableModel.getValueAt(selectedRow, 2);

            // Buscar el objeto Usuario completo usando el controlador
            Usuario userToEdit = usuarioController.buscarPorUsuario(usernameToEdit);

            if (userToEdit != null) {
                // Abrir el formulario de alta/edición de usuarios en modo "editar" (pasando el objeto Usuario)
                form_AltUsuarios altUsuarios = new form_AltUsuarios(this, userToEdit);
                altUsuarios.setVisible(true); // Mostrar el diálogo modal

                // Si la operación en form_AltUsuarios fue exitosa, refrescar la tabla
                if (altUsuarios.isSuccess()) {
                    cargarTablaUsuarios(); // Recargar la tabla
                }
            } else {
                Mensajes.mostrarError("Error: No se pudo encontrar el usuario seleccionado en el sistema.");
            }
        } else {
            Mensajes.mostrarAdvertencia("Por favor, selecciona un usuario de la tabla para actualizar.");
        }
    }
    private void BorrarUsuario() {
        int filaSeleccionada = tableAdmin.getSelectedRow();

        if (filaSeleccionada == -1) {
            Mensajes.mostrarAdvertencia("Selecciona un usuario de la tabla para eliminar.");
            return;
        }

        // Obtener el nombre de usuario (columna 2, índice 2)
        String nombreUsuario = (String) tableModel.getValueAt(filaSeleccionada, 2);

        // Protección para evitar eliminar al admin
        if ("admin".equalsIgnoreCase(nombreUsuario)) {
            Mensajes.mostrarAdvertencia("El usuario administrador no puede ser eliminado.");
            return;
        }

        int confirmacion = JOptionPane.showConfirmDialog(
                this,
                "¿Estás seguro de que deseas eliminar al usuario \"" + nombreUsuario + "\"?",
                "Confirmar eliminación",
                JOptionPane.YES_NO_OPTION
        );

        if (confirmacion == JOptionPane.YES_OPTION) {
            boolean eliminado = usuarioController.eliminarUsuario(nombreUsuario);

            if (eliminado) {
                Mensajes.mostrarInfo("Usuario eliminado correctamente.");
                cargarTablaUsuarios(); // Refrescar la tabla
            } else {
                Mensajes.mostrarError("No se pudo eliminar el usuario. Verifica si existe.");
            }
        }
    }


    private void btnBorrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarUsuarioActionPerformed
        BorrarUsuario();
    }//GEN-LAST:event_btnBorrarUsuarioActionPerformed


    private void btnCrearNuevoUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearNuevoUsuario1ActionPerformed
        // Abrir el formulario de alta/edición de usuarios en modo "crear" (pasando null)
        form_AltUsuarios altUsuarios = new form_AltUsuarios(this, null); // Pasamos 'this' como padre, null para creación
        altUsuarios.setVisible(true); // Mostrar el diálogo modal

        // Si la operación en form_AltUsuarios fue exitosa, refrescar la tabla
        if (altUsuarios.isSuccess()) {
            cargarTablaUsuarios(); // Recargar la tabla
        }
    }//GEN-LAST:event_btnCrearNuevoUsuario1ActionPerformed

    private void generarArchivoTXT() {
        try {
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String nombreArchivo = "respaldo_admin_" + timestamp + ".txt";
            File archivo = new File(nombreArchivo);
            BufferedWriter writer = new BufferedWriter(new FileWriter(archivo));

            // Escribir encabezados
            for (int col = 0; col < tableAdmin.getColumnCount(); col++) {
                writer.write(tableAdmin.getColumnName(col) + "\t");
            }
            writer.newLine();

            // Escribir filas
            for (int row = 0; row < tableAdmin.getRowCount(); row++) {
                for (int col = 0; col < tableAdmin.getColumnCount(); col++) {
                    Object valor = tableAdmin.getValueAt(row, col);
                    writer.write((valor != null ? valor.toString() : "") + "\t");
                }
                writer.newLine();
            }

            writer.close();
            JOptionPane.showMessageDialog(this, "Respaldo generado correctamente:\n" + archivo.getAbsolutePath());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al generar el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void btnbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbBuscarActionPerformed
        String apellidoBuscado = jTextField1.getText().trim().toLowerCase();
        if (apellidoBuscado.isEmpty()) {
            Mensajes.mostrarAdvertencia("Por favor ingresa un apellido para buscar.");
            return;
        }

        List<Usuario> usuarios = usuarioController.listarUsuarios();
        DefaultTableModel modelo = (DefaultTableModel) tableAdmin.getModel();
        modelo.setRowCount(0); // Limpiar la tabla

        boolean encontrado = false;

        for (Usuario u : usuarios) {
            if (u.getApellido().toLowerCase().contains(apellidoBuscado)) {
                Object[] fila = {
                    u.getNombre(),
                    u.getApellido(),
                    u.getUsuario(),
                    u.getCorreo(),
                    u.getRol(),
                    usuarioController.decodePassword(u.getClave()) 
                };
                modelo.addRow(fila);
                encontrado = true;
            }
        }

        if (!encontrado) {
            Mensajes.mostrarInfo("No se encontraron usuarios con el apellido ingresado.");
        }

    }//GEN-LAST:event_btnbBuscarActionPerformed

    private void btnReportedeVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportedeVentasActionPerformed
        Mensajes.mostrarInfo("Abriendo el Panel de Reporte de Ventas.");
        // Aquí se abre la ventana form_PaneldeVentasAdming sin cerrar esta.
        Panel_ReporteVentasAdmin panelVentas = new Panel_ReporteVentasAdmin(this, true);
        panelVentas.setVisible(true);
        // NO this.dispose(); porque esta ventana debe permanecer abierta.
    }//GEN-LAST:event_btnReportedeVentasActionPerformed

    private void exportarUsuariosAPDF() {

        try {
            // Crear el documento y el archivo de salida
            Document documento = new Document(PageSize.A4, 40, 40, 40, 40);
            String nombreArchivo = "usuarios_exportados.pdf";
            PdfWriter.getInstance(documento, new FileOutputStream(nombreArchivo));
            documento.open();

            // Fuentes personalizadas de iText
            Font tituloFont = new Font(Font.HELVETICA, 16, Font.BOLD, new Color(0, 48, 146));
            Font subFont = new Font(Font.HELVETICA, 12, Font.NORMAL);
            Font headerFont = new Font(Font.HELVETICA, 11, Font.BOLD, Color.WHITE);
            Font cellFont = new Font(Font.HELVETICA, 10, Font.NORMAL);

            // Cabecera de empresa
            Paragraph empresa = new Paragraph("MULTITEC D & J MEPRESA", tituloFont);
            empresa.setAlignment(Element.ALIGN_CENTER);
            documento.add(empresa);

            Paragraph ruc = new Paragraph("RUC: 20613001728", subFont);
            ruc.setAlignment(Element.ALIGN_CENTER);
            documento.add(ruc);
            documento.add(Chunk.NEWLINE); // espacio

            // Título del listado
            Paragraph titulo = new Paragraph("LISTA DE USUARIOS", tituloFont);
            titulo.setAlignment(Element.ALIGN_CENTER);
            documento.add(titulo);
            documento.add(Chunk.NEWLINE);

            // Columnas visibles (sin contraseña)
            int[] columnasVisibles = {0, 1, 2, 3, 4}; // nombre, apellido, usuario, correo, rol
            String[] titulosColumnas = {"Nombre", "Apellido", "Usuario", "Correo", "Rol"};

            PdfPTable tabla = new PdfPTable(columnasVisibles.length);
            tabla.setWidthPercentage(100);
            tabla.setSpacingBefore(10f);
            tabla.setSpacingAfter(10f);
            tabla.setWidths(new float[]{2f, 2f, 2f, 3f, 1.5f});

            // Encabezados
            for (String tituloCol : titulosColumnas) {
                PdfPCell th = new PdfPCell(new Phrase(tituloCol, headerFont));
                th.setBackgroundColor(new Color(0, 48, 146));
                th.setHorizontalAlignment(Element.ALIGN_CENTER);
                th.setPadding(8f);
                tabla.addCell(th);
            }

            // Datos de la tabla
            for (int fila = 0; fila < tableAdmin.getRowCount(); fila++) {
                for (int col : columnasVisibles) {
                    Object valor = tableAdmin.getValueAt(fila, col);
                    PdfPCell celda = new PdfPCell(new Phrase(valor != null ? valor.toString() : "", cellFont));
                    celda.setHorizontalAlignment(Element.ALIGN_LEFT);
                    celda.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    celda.setPadding(6f);
                    tabla.addCell(celda);
                }
            }

            documento.add(tabla);

            // Pie con hora de exportación
            String fechaHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date());
            Paragraph pie = new Paragraph("Hora generada: " + fechaHora, subFont);
            pie.setAlignment(Element.ALIGN_RIGHT);
            documento.add(pie);

            documento.close();
            JOptionPane.showMessageDialog(this, "PDF generado correctamente:\n" + nombreArchivo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al exportar PDF: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }


    private void btnExportarUsuariosPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarUsuariosPdfActionPerformed
        exportarUsuariosAPDF();
    }//GEN-LAST:event_btnExportarUsuariosPdfActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnCredencialesUsuarios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCredencialesUsuarios1ActionPerformed
        generarArchivoTXT();
    }//GEN-LAST:event_btnCredencialesUsuarios1ActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        jTextField1.setText(""); // Limpia el campo de búsqueda
        cargarTablaUsuarios();   // Vuelve a mostrar todos los usuarios
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(form_SistemaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_SistemaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_SistemaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_SistemaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_SistemaAdmin().setVisible(true);
            }
        });
    }

    private UsuarioController usuarioController;
    private DefaultTableModel tableModel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane bg;
    private javax.swing.JButton btnBorrarUsuario;
    private javax.swing.JButton btnCrearNuevoUsuario1;
    private javax.swing.JButton btnCredencialesUsuarios1;
    private javax.swing.JButton btnExportarUsuariosPdf;
    private javax.swing.JButton btnReportedeVentas;
    private javax.swing.JButton btnSalirAdmin;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btnbBuscar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblSistemaAdminstrador;
    private javax.swing.JTable tableAdmin;
    // End of variables declaration//GEN-END:variables

}
