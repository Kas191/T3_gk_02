/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.modelo;

/**
 *
 * @author User0
 */
public class Administrador extends Usuario {
    public Administrador(String nombre, String apellido, String usuario, String clave, String correo, String rol) {
        super(nombre, apellido, usuario, clave, correo, rol);
    }

   
    @Override
    public String obtenerDescripcionRol() {
        return "Administrador con acceso total al sistema.";
    }
}
