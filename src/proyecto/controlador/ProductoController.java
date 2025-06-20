/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import proyecto.modelo.Producto;

/**
 *
 * @author User0
 */
public class ProductoController {

    private static List<Producto> listaProductos = new ArrayList<>();
    private static final String ARCHIVO_PRODUCTOS = "productos.txt";

    public ProductoController() {
        cargarProductosDesdeArchivo();
    }

    private void cargarProductosDesdeArchivo() {
        listaProductos.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO_PRODUCTOS, StandardCharsets.UTF_8))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split("\\|");
                if (partes.length == 3) {
                    String modelo = partes[0];
                    String marca = partes[1];
                    double precio = Double.parseDouble(partes[2]);
                    Producto producto = new Producto(modelo, marca, precio);
                    listaProductos.add(producto);
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error al cargar productos: " + e.getMessage());
        }
    }

    public boolean guardarProductosEnArchivo() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO_PRODUCTOS, StandardCharsets.UTF_8))) {
            for (Producto producto : listaProductos) {
                String linea = producto.getModelo() + "|" + producto.getMarca() + "|" + producto.getPrecio();
                bw.write(linea);
                bw.newLine();
            }
            return true;
        } catch (IOException e) {
            System.err.println("Error al guardar productos: " + e.getMessage());
            return false;
        }
    }

    public boolean registrarProducto(Producto nuevoProducto) {
        for (Producto producto : listaProductos) {
            if (producto.getModelo().equalsIgnoreCase(nuevoProducto.getModelo())
                    && producto.getMarca().equalsIgnoreCase(nuevoProducto.getMarca())) {
                return false; // Producto ya existe
            }
        }
        listaProductos.add(nuevoProducto);
        return guardarProductosEnArchivo();
    }

    public boolean actualizarProducto(Producto productoActualizado) {
        for (int i = 0; i < listaProductos.size(); i++) {
            Producto actual = listaProductos.get(i);
            if (actual.getModelo().equalsIgnoreCase(productoActualizado.getModelo())
                    && actual.getMarca().equalsIgnoreCase(productoActualizado.getMarca())) {
                listaProductos.set(i, productoActualizado);
                return guardarProductosEnArchivo();
            }
        }
        return false;
    }

    public boolean eliminarProducto(String modelo, String marca) {
        boolean eliminado = listaProductos.removeIf(p -> p.getModelo().equalsIgnoreCase(modelo) && p.getMarca().equalsIgnoreCase(marca));
        if (eliminado) {
            return guardarProductosEnArchivo();
        }
        return false;
    }

    public List<Producto> listarProductos() {
        return new ArrayList<>(listaProductos);
    }
}
