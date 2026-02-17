/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Alumno {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String direccion;
    private String poblacion;
    private String fechaNacimiento;
    private String codigoPostal;
    private String telefono;

    public Alumno() {}  // Constructor vacío (opcional)

    public Alumno(String nombre, String apellidoPaterno, String apellidoMaterno,
                  String direccion, String poblacion, String fechaNacimiento,
                  String codigoPostal, String telefono) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.direccion = direccion;
        this.poblacion = poblacion;
        this.fechaNacimiento = fechaNacimiento;
        this.codigoPostal = codigoPostal;
        this.telefono = telefono;
    }

    public String getNombre() { return nombre; }
    public String getApellidoPaterno() { return apellidoPaterno; }
    public String getApellidoMaterno() { return apellidoMaterno; }
    public String getDireccion() { return direccion; }
    public String getPoblacion() { return poblacion; }
    public String getFechaNacimiento() { return fechaNacimiento; }
    public String getCodigoPostal() { return codigoPostal; }
    public String getTelefono() { return telefono; }

    @Override
    public String toString() {
        return nombre + " " + apellidoPaterno + " " + apellidoMaterno;
    }
}

