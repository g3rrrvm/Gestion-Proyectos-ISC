/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class UnidadAprendizaje {
    private String codigo;
    private String nombre;
    private int semestre;
    private int creditos;
    private int horasPorSemana;

    public UnidadAprendizaje() {}

    public UnidadAprendizaje(String codigo, String nombre, int semestre, int creditos, int horasPorSemana) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.semestre = semestre;
        this.creditos = creditos;
        this.horasPorSemana = horasPorSemana;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public int getSemestre() { return semestre; }
    public int getCreditos() { return creditos; }
    public int getHorasPorSemana() { return horasPorSemana; }

    @Override
    public String toString() {
        return codigo + " - " + nombre + " (Semestre: " + semestre + ", Créditos: " + creditos + ", Horas/Semana: " + horasPorSemana + ")";
    }
}