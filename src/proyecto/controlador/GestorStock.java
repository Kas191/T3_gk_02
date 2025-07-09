/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User0
 */
public class GestorStock {
     private static final String RUTA_PRODUCTOS = "productos_stock.txt";

    public static void actualizarStock(DefaultTableModel modeloTabla) {
        Map<String, Integer> stockActual = cargarStock();

        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            String producto = modeloTabla.getValueAt(i, 2).toString(); // columna del producto
            int cantidadVendida = Integer.parseInt(modeloTabla.getValueAt(i, 4).toString());

            stockActual.put(producto, stockActual.getOrDefault(producto, 0) - cantidadVendida);
        }

        guardarStock(stockActual);
    }

    private static Map<String, Integer> cargarStock() {
        Map<String, Integer> stock = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(RUTA_PRODUCTOS))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                if (partes.length >= 4) {
                    String producto = partes[0].trim() + " - " + partes[1].trim();
                    int cantidad = Integer.parseInt(partes[3].trim());
                    stock.put(producto, cantidad);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stock;
    }

    private static void guardarStock(Map<String, Integer> stockActual) {
        try (BufferedReader br = new BufferedReader(new FileReader(RUTA_PRODUCTOS));
             BufferedWriter bw = new BufferedWriter(new FileWriter("temp.txt"))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                if (partes.length >= 4) {
                    String producto = partes[0].trim() + " - " + partes[1].trim();
                    if (stockActual.containsKey(producto)) {
                        partes[3] = String.valueOf(stockActual.get(producto));
                        bw.write(String.join(";", partes));
                        bw.newLine();
                    }
                }
            }
            // Reemplaza archivo original
            Files.move(Paths.get("temp.txt"), Paths.get(RUTA_PRODUCTOS), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
