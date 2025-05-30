/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.modelo;

import proyecto.modelo.Usuario;

/**
 *
 * @author User0
 */
public class JefeAbastecimiento extends Usuario{
     private boolean accesoInventario;

    public JefeAbastecimiento(String nombre, String apellido, String usuario, String clave, String correo, String rol) {
        super(nombre, apellido, usuario, clave, correo, rol);
        this.accesoInventario = true; // Diferenciador
    }

    public boolean tieneAccesoInventario() {
        return accesoInventario;
    }

    public void setAccesoInventario(boolean accesoInventario) {
        this.accesoInventario = accesoInventario;
    }

    @Override
    public String obtenerDescripcionRol() {
        return "Jefe de Abastecimiento con acceso al control de inventarios.";
    }
}
