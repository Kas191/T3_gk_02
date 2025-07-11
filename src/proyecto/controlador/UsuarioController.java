/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets; // Para manejar la codificación UTF-8
import java.util.ArrayList;
import java.util.Base64; // Para la codificación Base64
import java.util.List;
import proyecto.modelo.Administrador; // Necesario para crear admin por defecto
import proyecto.modelo.Empleado; // Necesario para crear empleado por defecto
import proyecto.modelo.JefeDeAbastecimiento; // Necesario para crear jefe por defecto
import proyecto.modelo.Usuario;

/**
 * Controlador para la gestión de usuarios, incluyendo persistencia en archivo
 * de texto. Maneja la carga, guardado, registro, actualización, eliminación y
 * búsqueda de usuarios xd nose .
 */
public class UsuarioController {

    // La lista se mantiene estática para que todas las instancias de los controladores
    // accedan a la misma lista de usuarios en memoria durante la ejecución de la aplicación.
    private static List<Usuario> listaUsuarios = new ArrayList<>();
    private static final String USERS_FILE_PATH = "usuarios.txt"; // Ruta del archivo de usuarios

    // Bandera para asegurar que los usuarios se carguen/inicialicen solo una vez al inicio.
    private static boolean usuariosCargadosInicialmente = false;

    /**
     * Constructor que se encargará de cargar los usuarios al inicio de la
     * aplicación. Se ejecuta al crear la primera instancia de
     * UsuarioController.
     */
    public UsuarioController() {
        if (!usuariosCargadosInicialmente) {
            cargarUsuariosDesdeArchivo();
            // Si después de cargar el archivo, la lista está vacía o no hay un administrador,
            // inicializa con usuarios por defecto y los guarda.
            if (listaUsuarios.isEmpty() || !existeAdmin()) {
                System.out.println("Archivo de usuarios vacío o sin administrador. Inicializando usuarios por defecto...");
                inicializarUsuariosDefault();
                guardarUsuariosEnArchivo(); // Persistir los usuarios iniciales.
            }
            usuariosCargadosInicialmente = true; // Marca que la carga inicial ya se realizó.
        }
    }

    // --- Métodos para persistencia en archivo ---
    /**
     * Carga los usuarios desde el archivo 'usuarios.txt' a la lista en memoria.
     * El formato esperado en el archivo es:
     * nombre|apellido|usuario|clave_codificada|correo|rol|tokenAdmin
     */
    private void cargarUsuariosDesdeArchivo() {
        listaUsuarios.clear(); // Limpia la lista actual antes de cargar nuevos datos.
        try (BufferedReader br = new BufferedReader(new FileReader(USERS_FILE_PATH, StandardCharsets.UTF_8))) {
            String linea;
            int lineNumber = 0;
            while ((linea = br.readLine()) != null) {
                lineNumber++;
                String[] partes = linea.split("\\|"); // Divide la línea por el delimitador '|'
                // Verificar que la línea tenga al menos 6 partes (nombre a rol) y hasta 7 (con tokenAdmin)
                if (partes.length >= 6 && partes.length <= 7) {
                    String nombre = partes[0];
                    String apellido = partes[1];
                    String usuarioStr = partes[2]; // 'usuarioStr' para evitar conflicto con la clase 'Usuario'
                    String claveCodificada = partes[3];
                    String correo = partes[4];
                    String rol = partes[5];
                    // El tokenAdmin solo existe si hay 7 partes y no está vacío/nulo
                    String tokenAdmin = partes.length == 7 && !partes[6].trim().isEmpty() ? partes[6].trim() : null;

                    Usuario u = null;
                    // Instancia la clase concreta de Usuario según el rol leído.
                    switch (rol.toLowerCase()) {
                        case "admin":
                            u = new Administrador(nombre, apellido, usuarioStr, claveCodificada, correo, rol, tokenAdmin);
                            break;
                        case "empleado":
                            u = new Empleado(nombre, apellido, usuarioStr, claveCodificada, correo, rol);
                            break;
                        case "jefe_abastecimiento": // Asegúrate de que este rol coincide con tu modelo
                            u = new JefeDeAbastecimiento(nombre, apellido, usuarioStr, claveCodificada, correo, rol);
                            break;
                        default:
                            System.err.println("Advertencia: Rol desconocido '" + rol + "' en la línea " + lineNumber + ". Usuario no cargado.");
                            continue; // Salta esta línea y procesa la siguiente.
                    }

                    if (u != null) {
                        listaUsuarios.add(u);
                    }

                } else {
                    System.err.println("Advertencia: Línea con formato incorrecto en " + USERS_FILE_PATH + " (Línea " + lineNumber + "): " + linea);
                }
            }
            System.out.println("Usuarios cargados desde " + USERS_FILE_PATH);
        } catch (IOException e) {
            System.out.println("Archivo de usuarios no encontrado o error de lectura. Esto es normal en la primera ejecución.");
        } catch (Exception e) { // Captura cualquier otra excepción durante la carga.
            System.err.println("Error inesperado al cargar usuarios: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Guarda la lista actual de usuarios en memoria al archivo 'usuarios.txt'.
     * Sobrescribe el contenido existente del archivo.
     */
    public void guardarUsuariosEnArchivo() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(USERS_FILE_PATH, StandardCharsets.UTF_8))) {
            for (Usuario usuario : listaUsuarios) {
                // Formato de guardado: nombre|apellido|usuario|clave_codificada|correo|rol|tokenAdmin
                // La 'clave' ya debe estar codificada en Base64
                // El 'tokenAdmin' solo se guarda si el usuario es Admin y el token no es nulo/vacío
                String tokenParaGuardar = (usuario.getRol().equalsIgnoreCase("Admin") && usuario.getTokenAdmin() != null && !usuario.getTokenAdmin().isEmpty())
                        ? usuario.getTokenAdmin() : "";

                String linea = usuario.getNombre() + "|"
                        + usuario.getApellido() + "|"
                        + usuario.getUsuario() + "|"
                        + usuario.getClave() + "|" 
                        + usuario.getCorreo() + "|"
                        + usuario.getRol() + "|"
                        + tokenParaGuardar;

                bw.write(linea);
                bw.newLine(); // Agrega un salto de línea para el siguiente usuario.
            }
            System.out.println("Usuarios guardados en " + USERS_FILE_PATH);
        } catch (IOException e) {
            System.err.println("Error al guardar usuarios en el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }

    
    public String encodePassword(String password) {
        if (password == null || password.isEmpty()) {
            return "";
        }
        return Base64.getEncoder().encodeToString(password.getBytes(StandardCharsets.UTF_8));
    }

 
    public String decodePassword(String encodedPassword) {
        if (encodedPassword == null || encodedPassword.isEmpty()) {
            return "";
        }
        try {
            return new String(Base64.getDecoder().decode(encodedPassword), StandardCharsets.UTF_8);
        } catch (IllegalArgumentException e) {
            System.err.println("Error al decodificar Base64: " + encodedPassword + " - " + e.getMessage());
            return ""; // Retorna cadena vacía en caso de error de decodificación
        }
    }

    
    //Inicializa la lista de usuarios con un administrador, un empleado y un
    //jefe de abastecimiento por defecto. Se ejecuta si el archivo de usuarios
    //está vacío o no hay un admin registrado.
    
    private void inicializarUsuariosDefault() {
        // Administrador por defecto (con token)
        Administrador admin = new Administrador(
                "Administrador",
                "General",
                "admin", // Nombre de usuario para login
                encodePassword("adminpass"), // Contraseña codificada
                "admin@empresa.com",
                "Admin",
                "4a3b8c2d-9e1f-4g5h-6i7j-8k9l0m1n2o3p" // El token para el administrador
        );
        listaUsuarios.add(admin);

        // Empleado por defecto (sin token)
        Empleado empleado = new Empleado(
                "Juan",
                "Perez",
                "empleado1", // Nombre de usuario para login
                encodePassword("Paso14*bA4*Abc"), // Contraseña codificada
                "juan.perez@gmail.com",
                "Empleado"
        );
        listaUsuarios.add(empleado);

        // Jefe de Abastecimiento por defecto (sin token)
        JefeDeAbastecimiento jefe = new JefeDeAbastecimiento(
                "Derly Yosoni",
                "Cruz Amari",
                "jefeabast", // Nombre de usuario para login
                encodePassword("1356989*Abc_A"), // Contraseña codificada
                "derlyYosoni@gmail.com",
                "Jefe_Abastecimiento"
        );
        listaUsuarios.add(jefe);
    }

   
    public Usuario buscarPorUsuario(String usuario) {
        return listaUsuarios.stream()
                .filter(u -> u.getUsuario().equalsIgnoreCase(usuario))
                .findFirst()
                .orElse(null);
    }

   
    public Usuario buscarPorCorreo(String correo) {
        return listaUsuarios.stream()
                .filter(u -> u.getCorreo().equalsIgnoreCase(correo))
                .findFirst()
                .orElse(null);
    }

  
    public boolean registrarUsuario(Usuario usuario) {
        if (buscarPorUsuario(usuario.getUsuario()) != null) {
            return false; // RF-042: Ya existe un usuario con este nombre de usuario
        }

        // Codifica la contraseña del usuario antes de añadirla a la lista y guardarla
        // Asume que la clave del objeto 'usuario' viene en texto plano del formulario
        usuario.setClave(encodePassword(usuario.getClave()));

        // El token del admin, si se proporciona, ya viene en el objeto Usuario y se guarda directamente
        listaUsuarios.add(usuario);
        guardarUsuariosEnArchivo(); // Persiste los cambios en el archivo
        return true;
    }

   
    public boolean actualizarUsuario(Usuario usuarioActualizado) {
        boolean encontrado = false;
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getUsuario().equalsIgnoreCase(usuarioActualizado.getUsuario())) {
                Usuario usuarioExistente = listaUsuarios.get(i);

                // Actualiza los campos del usuario existente con los nuevos valores.
                usuarioExistente.setNombre(usuarioActualizado.getNombre());
                usuarioExistente.setApellido(usuarioActualizado.getApellido());
                usuarioExistente.setCorreo(usuarioActualizado.getCorreo());
                usuarioExistente.setRol(usuarioActualizado.getRol());

                // Manejo de la contraseña:
                String nuevaClavePlana = usuarioActualizado.getClave(); // Clave del formulario 
                if (nuevaClavePlana != null && !nuevaClavePlana.isEmpty()) {
                    // Si el formulario envió una contraseña nueva (no vacía), la codifica y la establece
                    usuarioExistente.setClave(encodePassword(nuevaClavePlana));
                }
                // Si nuevaClavePlana es null o vacía, se mantiene la contraseña existente codificada.}

                // Manejo del token del administrador:
                if (usuarioActualizado.esAdmin()) {
                    // Si el rol es admin, actualiza el token con el valor del formulario
                    usuarioExistente.setTokenAdmin(usuarioActualizado.getTokenAdmin());
                } else {
                    // Si el rol ya NO es admin, asegura que no tenga token asociado
                    usuarioExistente.setTokenAdmin(null);
                }

                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            guardarUsuariosEnArchivo(); // Persiste los cambios en el archivo.
            return true;
        }
        return false;
    }

    
    public boolean eliminarUsuario(String usuarioNombre) {
        boolean eliminado = listaUsuarios.removeIf(u -> u.getUsuario().equalsIgnoreCase(usuarioNombre));
        if (eliminado) {
            guardarUsuariosEnArchivo(); // Persiste los cambios si se eliminó un usuario
        }
        return eliminado;
    }

   
    public List<Usuario> listarUsuarios() {
        return new ArrayList<>(listaUsuarios); // Devuelve una copia para proteger la lista interna
    }

    
    public boolean existeAdmin() {
        return listaUsuarios.stream().anyMatch(u -> u.getRol().equalsIgnoreCase("Admin"));
    }

 
    public boolean restablecerContrasena(String username, String email, String newPassword) {
        Usuario user = buscarPorUsuario(username);
        if (user != null && user.getCorreo().equalsIgnoreCase(email)) {
            user.setClave(encodePassword(newPassword)); // Codifica y establece la nueva contraseña
            guardarUsuariosEnArchivo(); // Persiste el cambio
            return true;
        }
        return false;
    }
}
