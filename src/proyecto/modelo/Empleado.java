/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.modelo;

/**
 *
 * @author User0
 */
public class Empleado extends Usuario {

    public Empleado(String nombre, String apellido, String usuario, String clave, String correo, String rol) {
        // Los empleados no tienen tokenAdmin, por lo que se pasa null al constructor del padre.
        super(nombre, apellido, usuario, clave, correo, rol, null);
        // Asegurarse que el rol para Empleado sea "Empleado"
        if (!"Empleado".equalsIgnoreCase(rol)) {
            System.err.println("Advertencia: Se creó un Empleado con un rol diferente. Corrigiendo a 'Empleado'.");
            setRol("Empleado"); // Fuerza el rol a "Empleado"
        }
    }

}
