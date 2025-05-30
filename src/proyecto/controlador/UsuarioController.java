/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package proyecto.controlador;//define el paquete donde esta la clase
//importamos paquetes
import java.util.ArrayList;//estructura de datos para almacenar usuarios
import java.util.List;//estructura de datos para almacenar usuarios
import proyecto.modelo.Usuario; //clase abstracta base del modelo , utilixada para
//manejar cualquier topo de Usuario -> Esta clase Usuario.java es padre de  de sus otras clases
// JefedeAbastecimiento, empleado y Administrado


/**
 *
 * @author User0
 */
public class UsuarioController { //inicio de la clase controladora
    private static List<Usuario> listaUsuarios = new ArrayList<>();//lista estatica donde se almacena los usuarios

    
    
    
    
      // Método que busca un usuario en la lista por su nombre de usuario
    public Usuario buscarPorUsuario(String usuario) {
        // Devuelve el primer usuario cuyo nombre de usuario coincida (ignorando mayúsculas/minúsculas), o null
        return listaUsuarios.stream().filter(u -> u.getUsuario().equalsIgnoreCase(usuario)).findFirst().orElse(null);
    }

    
    
    // Método que busca un usuario por su correo electrónico
    public Usuario buscarPorCorreo(String correo) {
         // Devuelve el primer usuario cuyo correo coincida (ignorando mayúsculas/minúsculas), o null si no se encuentra
        return listaUsuarios.stream().filter(u -> u.getCorreo().equalsIgnoreCase(correo)).findFirst().orElse(null);
    }
  // Método para registrar un nuevo usuario en la lista
    public void registrarUsuario(Usuario usuario) {
        // Agrega el usuario recibido a la lista
        listaUsuarios.add(usuario);
    }

    
       // Método para eliminar un usuario de la lista usando su nombre de usuario
    public void eliminarUsuario(String usuario) {
         // Elimina todos los usuarios cuyo nombre de usuario coincida (ignorando mayúsculas/minúsculas)
        listaUsuarios.removeIf(u -> u.getUsuario().equalsIgnoreCase(usuario));
    }
 // Método que devuelve toda la lista de usuarios registrados
    public List<Usuario> listarUsuarios() {
        return listaUsuarios;
    }
  // Método que verifica si existe al menos un usuario con rol "Admin"
    public boolean existeAdmin() {
           // Devuelve true si encuentra un usuario cuyo rol es "Admin" (ignorando mayúsculas/minúsculas)
        return listaUsuarios.stream().anyMatch(u -> u.getRol().equalsIgnoreCase("Admin"));
    }
}
