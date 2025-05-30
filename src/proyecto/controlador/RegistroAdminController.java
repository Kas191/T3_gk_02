/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.controlador; // Declara que esta clase pertenece al paquete controlador
// Importa la clase UsuarioController para manejar usuarios registrados
import proyecto.controlador.UsuarioController;
import proyecto.modelo.Administrador;// Importa la clase Administrador que es el tipo de usuario que se registrará

/**
 *
 * @author User0
 */
public class RegistroAdminController {
// Controlador de usuarios usado para registrar y verificar existencia de administradores{
     private UsuarioController usuarioController;
 
     
     
     // Constructor que recibe una instancia del UsuarioController (inyectado desde fuera)
    public RegistroAdminController(UsuarioController usuarioController) {
        this.usuarioController = usuarioController;
    }
      // Método para registrar un administrador
    public boolean registrarAdmin(String nombre, String apellido, String usuario, String clave, String correo, String rol) {
               // Verifica si ya existe un usuario con el mismo nombre de usuario
        if (usuarioController.buscarPorUsuario(usuario) != null) return false;

        
           // Si no existe, se crea un nuevo administrador con los datos recibidos
        Administrador nuevoAdmin = new Administrador(nombre, apellido, usuario, clave, correo, rol);
                // Se registra el nuevo administrador en la lista de usuarios

        usuarioController.registrarUsuario(nuevoAdmin);
           // Devuelve true para indicar que el registro fue exitoso
        return true;
    }
}
