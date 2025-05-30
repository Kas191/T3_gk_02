/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.modelo;

/**
 *
 * @author User0
 */
public class Empleado extends Usuario {
  private String areaAsignada;

    public Empleado(String nombre, String apellido, String usuario, String clave, String correo, String rol) {
        super(nombre, apellido, usuario, clave, correo, rol);
        this.areaAsignada = "Ventas"; // Especificado por el usuario
    }

    public String getAreaAsignada() {
        return areaAsignada;
    }

    public void setAreaAsignada(String areaAsignada) {
        this.areaAsignada = areaAsignada;
    }

    @Override
    public String obtenerDescripcionRol() {
        return "Empleado del área: " + areaAsignada;
    }
}