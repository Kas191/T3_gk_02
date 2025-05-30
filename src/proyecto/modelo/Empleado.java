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
  private String areaAsignada;   // Atributo específico del empleado, indica el área donde trabaja

    public Empleado(String nombre, String apellido, String usuario, String clave, String correo, String rol) {
        super(nombre, apellido, usuario, clave, correo, rol);
        this.areaAsignada = "Ventas"; // Especificado por el usuario
    }
    // Método getter: devuelve el área asignada del empleado
    public String getAreaAsignada() {
        return areaAsignada;
    }
  // Método setter: permite modificar el área asignada del empleado
    public void setAreaAsignada(String areaAsignada) {
        this.areaAsignada = areaAsignada;
    }
  /**
     * Implementación del método abstracto de Usuario.
     * Devuelve una descripción que incluye el área del empleado.
     */
    @Override
    public String obtenerDescripcionRol() {
        return "Empleado del área: " + areaAsignada;
    }
}