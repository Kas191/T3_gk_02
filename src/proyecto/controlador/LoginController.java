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

    /**
     * El constructor recibe una instancia de UsuarioController para realizar búsquedas de usuarios.
     * @param usuarioController La instancia de UsuarioController.
     */
    public LoginController(UsuarioController usuarioController) {
        this.usuarioController = usuarioController;
    }

   
    public Usuario autenticar(String usuarioNombre, String clavePlana) {
        Usuario user = usuarioController.buscarPorUsuario(usuarioNombre);
        // Verifica si el usuario existe y si la contraseña decodificada del archivo coincide con la ingresada.
        if (user != null && usuarioController.decodePassword(user.getClave()).equals(clavePlana)) {
            return user;
        }
        return null; // Autenticación fallida.
    }

    
    public Usuario autenticarAdminConToken(String usuarioNombre, String clavePlana, String tokenIngresado) {
        // Primero, intenta autenticar con usuario y contraseña usando el método general.
        // Esto verifica que el usuario exista y que su contraseña sea correcta.
        Usuario user = autenticar(usuarioNombre, clavePlana);

        // Si la autenticación básica fue exitosa Y el usuario tiene el rol de 'Admin'.
        if (user != null && user.getRol().equalsIgnoreCase("Admin")) {
            // Verifica que el token almacenado para este administrador no sea nulo/vacío
            // y que coincida con el token que el administrador ha "subido" del archivo.
            // Asumimos que el tokenAdmin en el objeto 'user' ya está en texto plano,
            // tal como se guardó en el archivo 'usuarios.txt'.
            if (user.getTokenAdmin() != null && !user.getTokenAdmin().isEmpty() && user.getTokenAdmin().equals(tokenIngresado)) {
                return user; // Autenticación de administrador con token exitosa.
            } else {
                System.out.println("Token de administrador incorrecto o no configurado.");
                return null; // Token incorrecto o no existe.
            }
        }
        return null; // No es un administrador, o la autenticación básica falló, o no es un admin válido para este método.
    }

}
