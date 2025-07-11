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
    protected String nombre;
    protected String apellido;
    protected String usuario; // Este es el nombre de usuario para el login
    protected String clave; // Esta será la contraseña CODIFICADA (Base64)
    protected String correo;
    protected String rol;
    protected String tokenAdmin; // Nuevo campo para el token del administrador

    // Constructor base para Usuario (sin token, para roles no admin)
    public Usuario(String nombre, String apellido, String usuario, String clave, String correo, String rol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.clave = clave;
        this.correo = correo;
        this.rol = rol;
        this.tokenAdmin = null; // Por defecto es null para roles no admin
    }

    // Constructor con tokenAdmin (específico para el rol Administrador)
    public Usuario(String nombre, String apellido, String usuario, String clave, String correo, String rol, String tokenAdmin) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.clave = clave;
        this.correo = correo;
        this.rol = rol;
        this.tokenAdmin = tokenAdmin; // Se asigna el token proporcionado
    }

    // --- Getters ---
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }

    public String getCorreo() {
        return correo;
    }

    public String getRol() {
        return rol;
    }

    public String getTokenAdmin() {
        return tokenAdmin;
    }

    // --- Setters ---
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setClave(String clave) {
        this.clave = clave; 
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void setTokenAdmin(String tokenAdmin) {
        this.tokenAdmin = tokenAdmin;
    }

    // Método de conveniencia para verificar si el rol es Administrador
    public boolean esAdmin() {
        return "Admin".equalsIgnoreCase(rol);
    }
}