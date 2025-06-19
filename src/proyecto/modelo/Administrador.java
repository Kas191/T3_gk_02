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
 // Constructor para Administrador, que incluye el tokenAdmin
    public Administrador(String nombre, String apellido, String usuario, String clave, String correo, String rol, String tokenAdmin) {
        super(nombre, apellido, usuario, clave, correo, rol, tokenAdmin);
        // Asegurarse que el rol para Administrador sea "Admin"
        if (!"Admin".equalsIgnoreCase(rol)) {
            System.err.println("Advertencia: Se creó un Administrador con un rol diferente. Corrigiendo a 'Admin'.");
            setRol("Admin"); // Fuerza el rol a "Admin"
        }
    }
}
