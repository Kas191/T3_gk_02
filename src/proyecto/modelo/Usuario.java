/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.modelo;

/**
 *
 * @author User0
 */
public abstract class Usuario {

    // Atributos protegidos: accesibles desde clases hijas
    protected String nombre;      // Nombre del usuario
    protected String apellido;    // Apellido del usuario
    protected String usuario;     // Nombre de usuario único (login)
    protected String clave;       // Contraseña del usuario
    protected String correo;      // Correo electrónico del usuario
    protected String rol;         // Rol del usuario (Admin, Empleado, etc.)

    // Constructor que inicializa todos los atributos de la clase
    public Usuario(String nombre, String apellido, String usuario, String clave, String correo, String rol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.clave = clave;
        this.correo = correo;
        this.rol = rol;
    }

    // Métodos getter y setter para acceder y modificar los atributos encapsulados
    // Métodos getter y setter para acceder y modificar los atributos encapsulados
    public String getUsuario() {
        return usuario; // Devuelve el valor del atributo 'usuario'
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario; // Asigna un nuevo valor al atributo 'usuario'
    }

    public String getClave() {
        return clave; // Devuelve el valor de la clave del usuario
    }

    public void setClave(String clave) {
        this.clave = clave; // Asigna un nuevo valor a la clave del usuario
    }

    public String getNombre() {
        return nombre; // Devuelve el nombre del usuario
    }

    public void setNombre(String nombre) {
        this.nombre = nombre; // Asigna un nuevo valor al atributo 'nombre'
    }

    public String getApellido() {
        return apellido; // Devuelve el apellido del usuario
    }

    public void setApellido(String apellido) {
        this.apellido = apellido; // Asigna un nuevo valor al atributo 'apellido'
    }

    public String getRol() {
        return rol; // Devuelve el rol del usuario (por ejemplo: Admin, Empleado, etc.)
    }

    public void setRol(String rol) {
        this.rol = rol; // Asigna un nuevo valor al atributo 'rol'
    }

    public String getCorreo() {
        return correo; // Devuelve el correo electrónico del usuario
    }

    public void setCorreo(String correo) {
        this.correo = correo; // Asigna un nuevo valor al atributo 'correo'
    }

    public abstract String obtenerDescripcionRol();
// Método abstracto que será implementado por cada subclase para describir su rol específico

}
