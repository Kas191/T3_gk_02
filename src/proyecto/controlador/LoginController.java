/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.controlador;
import proyecto.modelo.Usuario;
/**
 *
 * @author User0
 */
public class LoginController {
    
    // Atributo privado que guarda una instancia del controlador de usuarios
     private UsuarioController usuarioController;

       // Constructor que recibe el controlador de usuarios como parámetro
    public LoginController(UsuarioController usuarioController) {
        this.usuarioController = usuarioController;
    }
      // Método que autentica un usuario comparando usuario y clave
    public Usuario autenticar(String usuario, String clave) {
        Usuario user = usuarioController.buscarPorUsuario(usuario);
              // Si el usuario existe y la clave coincide, devuelve el objeto usuario
        if (user != null && user.getClave().equals(clave)) {
            return user;
        } // Si no existe o la clave no coincide, devuelve null
        return null;
    }
 // Método que valida si el usuario es un administrador autenticado
    public boolean validarAccesoAdmin(String usuario, String clave) {
        Usuario user = autenticar(usuario, clave);    // Autentica al usuario con sus credenciales
        return user != null && user.getRol().equalsIgnoreCase("Admin");        // Retorna true si existe y su rol es "Admin"
    }

}
