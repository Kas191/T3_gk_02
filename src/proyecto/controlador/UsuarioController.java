/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.controlador;

import java.util.ArrayList;
import java.util.List;
import proyecto.modelo.Usuario;

/**
 *
 * @author User0
 */
public class UsuarioController {
    private static List<Usuario> listaUsuarios = new ArrayList<>();

    public Usuario buscarPorUsuario(String usuario) {
        return listaUsuarios.stream().filter(u -> u.getUsuario().equalsIgnoreCase(usuario)).findFirst().orElse(null);
    }

    public Usuario buscarPorCorreo(String correo) {
        return listaUsuarios.stream().filter(u -> u.getCorreo().equalsIgnoreCase(correo)).findFirst().orElse(null);
    }

    public void registrarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    public void eliminarUsuario(String usuario) {
        listaUsuarios.removeIf(u -> u.getUsuario().equalsIgnoreCase(usuario));
    }

    public List<Usuario> listarUsuarios() {
        return listaUsuarios;
    }

    public boolean existeAdmin() {
        return listaUsuarios.stream().anyMatch(u -> u.getRol().equalsIgnoreCase("Admin"));
    }
}
