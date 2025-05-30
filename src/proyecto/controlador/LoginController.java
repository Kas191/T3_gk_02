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
     private UsuarioController usuarioController;

    public LoginController(UsuarioController usuarioController) {
        this.usuarioController = usuarioController;
    }

    public Usuario autenticar(String usuario, String clave) {
        Usuario user = usuarioController.buscarPorUsuario(usuario);
        if (user != null && user.getClave().equals(clave)) {
            return user;
        }
        return null;
    }

    public boolean validarAccesoAdmin(String usuario, String clave) {
        Usuario user = autenticar(usuario, clave);
        return user != null && user.getRol().equalsIgnoreCase("Admin");
    }

}
