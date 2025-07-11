
import proyecto.controlador.UsuarioController;
import proyecto.modelo.Administrador;
import proyecto.util.Mensajes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class RegistroAdminController {
    // Controlador de usuarios usado para registrar y verificar existencia de administradores
    private UsuarioController usuarioController;
    
    // Constructor que recibe una instancia del UsuarioController (inyectado desde fuera)
    public RegistroAdminController(UsuarioController usuarioController) {
        this.usuarioController = usuarioController;
    }

   
    public boolean registrarAdmin(String nombre, String apellido, String usuario, String clave, String correo, String rol) {
        // Verifica si ya existe un usuario con el mismo nombre de usuario (RF-042)
        if (usuarioController.buscarPorUsuario(usuario) != null) {
            return false; // El usuario ya existe, no se puede registrar.
        }

        // Generar un token aleatorio y único para este administrador inicial.
        // Este token será CRUCIAL para su futuro login.
        String generatedToken = java.util.UUID.randomUUID().toString(); 

        // Crea un nuevo administrador con los datos recibidos y el token generado.
        // La 'clave' (contraseña) se pasa en texto plano aquí; UsuarioController.registrarUsuario la codificará.
        Administrador nuevoAdmin = new Administrador(nombre, apellido, usuario, clave, correo, rol, generatedToken);
        
        // Registra el nuevo administrador en la lista de usuarios y lo persiste en el archivo.
        boolean registroExitoso = usuarioController.registrarUsuario(nuevoAdmin);

        if (registroExitoso) {
            // Es CRUCIAL mostrar el token al usuario para que lo guarde
            Mensajes.mostrarInfo("¡Administrador registrado con éxito!\n"
                               + "Su token de acceso es: \n" + generatedToken + "\n"
                               + "¡Guarde este token de forma segura! Lo necesitará para iniciar sesión.");
        }
        
        // Devuelve true para indicar que el registro fue exitoso
        return registroExitoso;
    }
}