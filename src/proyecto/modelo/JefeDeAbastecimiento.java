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
     // Atributo específico que indica si el jefe tiene acceso al inventario
     private boolean accesoInventario;

      /**
     * Constructor que inicializa todos los atributos heredados y 
     * asigna acceso al inventario por defecto como verdadero.
     */

    public JefeAbastecimiento(String nombre, String apellido, String usuario, String clave, String correo, String rol) {
        super(nombre, apellido, usuario, clave, correo, rol);
        this.accesoInventario = true; // Diferenciador
    }
  // Método getter que indica si tiene acceso al inventario
    public boolean tieneAccesoInventario() {
        return accesoInventario;
    }

    // Método setter para modificar si tiene acceso al inventario
    public void setAccesoInventario(boolean accesoInventario) {
        this.accesoInventario = accesoInventario;
    }

    /**
     * Implementación del método abstracto heredado de Usuario.
     * Devuelve una descripción personalizada del rol.
     */
    @Override
    public String obtenerDescripcionRol() {
        return "Jefe de Abastecimiento con acceso al control de inventarios.";
    }
}
