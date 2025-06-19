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
public class JefeDeAbastecimiento extends Usuario {

     public JefeDeAbastecimiento(String nombre, String apellido, String usuario, String clave, String correo, String rol) {
        // Los jefes de abastecimiento no tienen tokenAdmin, por lo que se pasa null al constructor del padre.
        super(nombre, apellido, usuario, clave, correo, rol, null);
        // Asegurarse que el rol para Jefe de Abastecimiento sea "Jefe_Abastecimiento"
        if (!"Jefe_Abastecimiento".equalsIgnoreCase(rol)) {
            System.err.println("Advertencia: Se creó un Jefe de Abastecimiento con un rol diferente. Corrigiendo a 'Jefe_Abastecimiento'.");
            setRol("Jefe_Abastecimiento"); // Fuerza el rol a "Jefe_Abastecimiento"
        }
    }
}