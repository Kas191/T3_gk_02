/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package proyecto.vista;

import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import proyecto.controlador.GestorStock;


public class form_RealizarPago extends javax.swing.JDialog {

   
    private DefaultTableModel modeloTabla;
    private double total;
    private boolean pagoExitoso = false;

    public form_RealizarPago(java.awt.Frame parent, boolean modal, double total, DefaultTableModel modeloTabla) {
        super(parent, modal);
        initComponents();
        // Muestra el total a pagar con 2 decimales
        lblPago.setText(String.format("%.2f", total));

        // Puedes guardar el modelo si luego lo necesitas
        this.modeloTabla = modeloTabla;
        this.total = total;
    }

    private form_RealizarPago(JFrame jFrame, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnConfirmarPago = new javax.swing.JButton();
        btnCancelarOperacion = new javax.swing.JButton();
        lblLogin = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtMontoPagado = new javax.swing.JTextField();
        lblMontoPagado = new javax.swing.JLabel();
        lblTotalPagar = new javax.swing.JLabel();
        lblPago = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Venta y Pago");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConfirmarPago.setBackground(new java.awt.Color(221, 235, 157));
        btnConfirmarPago.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        btnConfirmarPago.setText("Confirmar Pago");
        btnConfirmarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarPagoActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfirmarPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 350, 30));

        btnCancelarOperacion.setBackground(new java.awt.Color(255, 130, 130));
        btnCancelarOperacion.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        btnCancelarOperacion.setText("Cancelar Operación");
        btnCancelarOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarOperacionActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelarOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 350, 30));

        lblLogin.setFont(new java.awt.Font("Yu Gothic", 1, 40)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(0, 48, 146));
        lblLogin.setText("REALIZAR PAGO");
        jPanel1.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 60));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setDoubleBuffered(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMontoPagado.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        txtMontoPagado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        txtMontoPagado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoPagadoActionPerformed(evt);
            }
        });
        jPanel3.add(txtMontoPagado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 340, 30));

        lblMontoPagado.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        lblMontoPagado.setText("Ingrese el monto pagado: ");
        jPanel3.add(lblMontoPagado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        lblTotalPagar.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        lblTotalPagar.setText("Total a pagar : ");
        jPanel3.add(lblTotalPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 120, -1));

        lblPago.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 22)); // NOI18N
        lblPago.setText("0");
        jPanel3.add(lblPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 150, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 360, 120));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 400, 420));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 400, 420));

        setSize(new java.awt.Dimension(414, 371));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public boolean isPagoExitoso() {
        return pagoExitoso;
    }


    private int obtenerSiguienteNumeroFactura() {
        File archivo = new File("factura_id.txt");
        int numero = 1;

        try {
            if (archivo.exists()) {
                BufferedReader br = new BufferedReader(new FileReader(archivo));
                String linea = br.readLine();
                if (linea != null) {
                    numero = Integer.parseInt(linea.trim()) + 1;
                }
                br.close();
            }

            // Guardar el nuevo número
            PrintWriter pw = new PrintWriter(new FileWriter(archivo));
            pw.println(numero);
            pw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return numero;
    }

    private void generarFacturaPDF() {
        try {
            // 1. Crear documento PDF
            Document doc = new Document(PageSize.A4, 40, 40, 40, 40);
            String nombreArchivo = "Facturas/Factura_" + System.currentTimeMillis() + ".pdf";
            PdfWriter.getInstance(doc, new FileOutputStream(nombreArchivo));
            doc.open();

            // 2. Fuentes en negro
            Font tituloFont = new Font(Font.HELVETICA, 16, Font.BOLD, Color.BLACK);
            Font subFont = new Font(Font.HELVETICA, 12, Font.NORMAL, Color.BLACK);
            Font headerFont = new Font(Font.HELVETICA, 11, Font.BOLD, Color.BLACK);
            Font cellFont = new Font(Font.HELVETICA, 10, Font.NORMAL, Color.BLACK);

            // 3. Cabecera
            Paragraph titulo = new Paragraph("FACTURA DE VENTA", tituloFont);
            titulo.setAlignment(Element.ALIGN_CENTER);
            doc.add(titulo);

            Paragraph empresa = new Paragraph("MULTITEC D & J EMPRESA", subFont);
            empresa.setAlignment(Element.ALIGN_CENTER);
            doc.add(empresa);

            Paragraph ruc = new Paragraph("RUC: 20547854123", subFont);
            ruc.setAlignment(Element.ALIGN_CENTER);
            doc.add(ruc);

            Paragraph direccion = new Paragraph("Jr. Jaen 401 | San Ignacio - Cajamarca", subFont);
            direccion.setAlignment(Element.ALIGN_CENTER);
            doc.add(direccion);

            Paragraph correo = new Paragraph("Correo: Derly_ca@hotmail.com", subFont);
            correo.setAlignment(Element.ALIGN_CENTER);
            doc.add(correo);

            doc.add(Chunk.NEWLINE);

            // 4. Datos de factura
            int numeroFactura = obtenerSiguienteNumeroFactura();
            String codigoFactura = String.format("Factura N°: %03d", numeroFactura);
            
            
            doc.add(new Paragraph(codigoFactura, subFont));

            doc.add(new Paragraph("Rol: Cajero", subFont));

            doc.add(new Paragraph("Fecha: " + LocalDate.now(), subFont));
            doc.add(new Paragraph("Hora: " + LocalTime.now().withNano(0), subFont));
            doc.add(Chunk.NEWLINE);

            // 5. Tabla de productos
            PdfPTable tabla = new PdfPTable(4); // Producto, Cantidad, Precio, Total
            tabla.setWidthPercentage(100);
            tabla.setWidths(new int[]{40, 15, 20, 25});

            tabla.addCell(new PdfPCell(new Phrase("Producto", headerFont)));
            tabla.addCell(new PdfPCell(new Phrase("Cantidad", headerFont)));
            tabla.addCell(new PdfPCell(new Phrase("Precio", headerFont)));
            tabla.addCell(new PdfPCell(new Phrase("Total", headerFont)));

            double sumaTotal = 0.0;

            for (int fila = 0; fila < modeloTabla.getRowCount(); fila++) {
                String producto = modeloTabla.getValueAt(fila, 2).toString(); // Producto
                String cantidad = modeloTabla.getValueAt(fila, 4).toString(); // Cantidad
                String precio = String.format("%.2f", Double.parseDouble(modeloTabla.getValueAt(fila, 3).toString()));
                String total = String.format("%.2f", Double.parseDouble(modeloTabla.getValueAt(fila, 5).toString()));

                tabla.addCell(new PdfPCell(new Phrase(producto, cellFont)));
                tabla.addCell(new PdfPCell(new Phrase(cantidad, cellFont)));
                tabla.addCell(new PdfPCell(new Phrase(precio, cellFont)));
                tabla.addCell(new PdfPCell(new Phrase(total, cellFont)));

                sumaTotal += Double.parseDouble(total);
            }

            doc.add(tabla);
            doc.add(Chunk.NEWLINE);

            // 6. Totales
            Paragraph totalPagar = new Paragraph("Total a pagar : " + String.format("%.2f", sumaTotal), subFont);
            totalPagar.setAlignment(Element.ALIGN_RIGHT);
            doc.add(totalPagar);

            String pagadoStr = txtMontoPagado.getText().trim();
            Paragraph pagado = new Paragraph("Cantidad pagada: " + pagadoStr, subFont);
            pagado.setAlignment(Element.ALIGN_RIGHT);
            doc.add(pagado);

            double cambio = Double.parseDouble(pagadoStr) - sumaTotal;
            Paragraph cambioP = new Paragraph("Cambio: " + String.format("%.2f", cambio), subFont);
            cambioP.setAlignment(Element.ALIGN_RIGHT);
            doc.add(cambioP);

            doc.add(Chunk.NEWLINE);

            // 7. Pie
            String fechaHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date());
            Paragraph pie = new Paragraph("Factura generada: " + fechaHora, subFont);
            pie.setAlignment(Element.ALIGN_RIGHT);
            doc.add(pie);

            doc.close();

            JOptionPane.showMessageDialog(this, "Factura PDF generada correctamente:\n" + nombreArchivo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al generar la factura: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean procesarPago() {
        String montoTexto = txtMontoPagado.getText().trim();

        if (montoTexto.isEmpty() || !montoTexto.matches("\\d+(\\.\\d{1,2})?")) {
            JOptionPane.showMessageDialog(this, "Ingrese un monto válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        double montoPagado = Double.parseDouble(montoTexto);
        if (montoPagado < total) {
            JOptionPane.showMessageDialog(this, "El monto pagado no cubre el total a pagar.", "Pago insuficiente", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        double cambio = montoPagado - total;

        // Mostrar resumen
        String mensaje = String.format("""
        Total: %.2f
        Cantidad pagada: %.2f
        Cambio: %.2f
        """, total, montoPagado, cambio);
        JOptionPane.showMessageDialog(this, mensaje, "Pago Realizado", JOptionPane.INFORMATION_MESSAGE);

        return true;
    }


    private void btnConfirmarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarPagoActionPerformed
        if (procesarPago()) {
            generarFacturaPDF();
            GestorStock.actualizarStock(modeloTabla);// Paso 6: Generar PDF
            pagoExitoso = true;

            dispose(); // Cierra el JDialog

        }
    }//GEN-LAST:event_btnConfirmarPagoActionPerformed

    private void cancelarOperacion() {
        int respuesta = JOptionPane.showConfirmDialog(
                this,
                "¿Estás seguro de cancelar la operación?",
                "Confirmar cancelación",
                JOptionPane.YES_NO_OPTION
        );

        if (respuesta == JOptionPane.YES_OPTION) {
            this.dispose(); // Cierra el JDialog
        }
    }

    private void btnCancelarOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarOperacionActionPerformed
        cancelarOperacion();
    }//GEN-LAST:event_btnCancelarOperacionActionPerformed

    private void txtMontoPagadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoPagadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoPagadoActionPerformed

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
            java.util.logging.Logger.getLogger(form_RealizarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_RealizarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_RealizarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_RealizarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                form_RealizarPago dialog = new form_RealizarPago(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCancelarOperacion;
    private javax.swing.JButton btnConfirmarPago;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblMontoPagado;
    private javax.swing.JLabel lblPago;
    private javax.swing.JLabel lblTotalPagar;
    private javax.swing.JTextField txtMontoPagado;
    // End of variables declaration//GEN-END:variables
}
