/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.controlador;

import proyecto.controlador.UsuarioController;
import proyecto.modelo.Administrador;

/**
 *
 * @author User0
 */
public class RegistroAdminController {
     private UsuarioController usuarioController;

    public RegistroAdminController(UsuarioController usuarioController) {
        this.usuarioController = usuarioController;
    }

    public boolean registrarAdmin(String nombre, String apellido, String usuario, String clave, String correo, String rol) {
        if (usuarioController.buscarPorUsuario(usuario) != null) return false;

        Administrador nuevoAdmin = new Administrador(nombre, apellido, usuario, clave, correo, rol);
        usuarioController.registrarUsuario(nuevoAdmin);
        return true;
    }
}
