/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.modelo;

/** Clase que representa a un Administrador.
 *Hereda de la clase abstracta Usuario.
 *  Proporciona una descripción específica del rol.
 * @author User0
 */
public class Administrador extends Usuario {
    // Constructor que recibe todos los atributos necesarios para un usuario
    public Administrador(String nombre, String apellido, String usuario, String clave, String correo, String rol) {
        // Llama al constructor de la clase padre Usuario con los mismos parámetros
        super(nombre, apellido, usuario, clave, correo, rol);
    }

   
    @Override    // Método sobrescrito que devuelve la descripción del rol específico de administrador
    public String obtenerDescripcionRol() {
        return "Administrador con acceso total al sistema.";
    }
}
