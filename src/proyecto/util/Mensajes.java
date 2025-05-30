/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.util;

import javax.swing.JOptionPane; // Importa la clase JOptionPane para mostrar cuadros de diálogo

/**
 *
 * @author User0
 */
public class Mensajes {// Clase utilitaria para mostrar diferentes tipos de mensajes emergentes

    public static void mostrarInfo(String mensaje) {
         // Muestra un cuadro de diálogo de tipo "Información" con el mensaje proporcionado
        JOptionPane.showMessageDialog(null, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void mostrarError(String mensaje) {
         // Muestra un cuadro de diálogo de tipo "Error" con el mensaje proporcionado
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void mostrarAdvertencia(String mensaje) {
         // Muestra un cuadro de diálogo de tipo "Advertencia" con el mensaje proporcionado
        JOptionPane.showMessageDialog(null, mensaje, "Advertencia", JOptionPane.WARNING_MESSAGE);
    }

    public static int confirmar(String mensaje) {
        // Muestra un cuadro de confirmación con opciones "Sí" y "No", y retorna la opción seleccionada
        return JOptionPane.showConfirmDialog(null, mensaje, "Confirmar", JOptionPane.YES_NO_OPTION);
    }
}
