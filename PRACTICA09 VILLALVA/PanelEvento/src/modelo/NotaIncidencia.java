/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class NotaIncidencia {
    private String matriculaAlumno;     // o nombre si no tienes matrícula aún
    private String codigoUnidad;        // código de la unidad de aprendizaje
    private double nota;
    private String incidencia;

    public NotaIncidencia() {}

    public NotaIncidencia(String matriculaAlumno, String codigoUnidad, double nota, String incidencia) {
        this.matriculaAlumno = matriculaAlumno;
        this.codigoUnidad = codigoUnidad;
        this.nota = nota;
        this.incidencia = incidencia;
    }

    public String getMatriculaAlumno() { return matriculaAlumno; }
    public String getCodigoUnidad() { return codigoUnidad; }
    public double getNota() { return nota; }
    public String getIncidencia() { return incidencia; }

    @Override
    public String toString() {
        return "Alumno: " + matriculaAlumno + " | Unidad: " + codigoUnidad +
               " | Nota: " + nota + " | Incidencia: " + incidencia;
    }
}
