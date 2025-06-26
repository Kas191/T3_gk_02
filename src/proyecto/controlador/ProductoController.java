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
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import proyecto.modelo.Producto;

/**
 *
 * @author User0
 */
public class ProductoController {

    public static List<Producto> listaProductos = new ArrayList<>();
    private static final String ARCHIVO_PRODUCTOS = "productos_stock.txt";

    public ProductoController() {
        cargarProductosDesdeArchivo();
    }

    public List<Producto> listarProductos() {
        return new ArrayList<>(listaProductos);
    }

    private void cargarProductosDesdeArchivo() {
        listaProductos.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO_PRODUCTOS, StandardCharsets.UTF_8))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                if (partes.length == 4) {
                    String marca = partes[0].trim();       // MARCA primero
                    String modelo = partes[1].trim();      // MODELO luego
                    double precio = Double.parseDouble(partes[2].trim());
                    int stock = Integer.parseInt(partes[3].trim());
                    Producto producto = new Producto(marca, modelo, precio, stock);
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
                String linea = producto.getMarca() + ";" + producto.getModelo() + ";" + producto.getPrecio() + ";" + producto.getStock();
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
            if (producto.getMarca().equalsIgnoreCase(nuevoProducto.getMarca())
                    && producto.getModelo().equalsIgnoreCase(nuevoProducto.getModelo())) {
                return false; // Ya existe
            }
        }
        listaProductos.add(nuevoProducto);
        return guardarProductosEnArchivo();
    }

    public boolean actualizarProducto(Producto productoActualizado) {
        for (int i = 0; i < listaProductos.size(); i++) {
            Producto actual = listaProductos.get(i);
            if (actual.getMarca().equalsIgnoreCase(productoActualizado.getMarca())
                    && actual.getModelo().equalsIgnoreCase(productoActualizado.getModelo())) {
                listaProductos.set(i, productoActualizado);
                return guardarProductosEnArchivo();
            }
        }
        return false;
    }

    public boolean eliminarProducto(String marca, String modelo) {
        boolean eliminado = listaProductos.removeIf(p
                -> p.getMarca().equalsIgnoreCase(marca)
                && p.getModelo().equalsIgnoreCase(modelo)
        );

        if (eliminado) {
            // Ordenar por Marca, luego Modelo
            Collections.sort(listaProductos, new Comparator<Producto>() {
                @Override
                public int compare(Producto p1, Producto p2) {
                    int comp = p1.getMarca().compareToIgnoreCase(p2.getMarca());
                    return (comp != 0) ? comp : p1.getModelo().compareToIgnoreCase(p2.getModelo());
                }
            });
            return guardarProductosEnArchivo();
        }

        return false;
    }

    public boolean actualizarStock(String marca, String modelo, int nuevoStock) {
        for (Producto p : listaProductos) {
            if (p.getMarca().equalsIgnoreCase(marca) && p.getModelo().equalsIgnoreCase(modelo)) {
                p.setStock(nuevoStock);
                return guardarProductosEnArchivo();
            }
        }
        return false;
    }

}
