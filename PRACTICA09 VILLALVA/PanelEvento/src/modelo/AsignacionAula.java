/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class AsignacionAula {
    private String codigoUnidad;
    private String codigoAula;
    private String mes;
    private String dia;
    private String hora;

    public AsignacionAula() {}

    public AsignacionAula(String codigoUnidad, String codigoAula, String mes, String dia, String hora) {
        this.codigoUnidad = codigoUnidad;
        this.codigoAula = codigoAula;
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
    }

    public String getCodigoUnidad() { return codigoUnidad; }
    public String getCodigoAula() { return codigoAula; }
    public String getMes() { return mes; }
    public String getDia() { return dia; }
    public String getHora() { return hora; }

    @Override
    public String toString() {
        return "Asignatura: " + codigoUnidad + " | Aula: " + codigoAula + " | " + dia + "/" + mes + " a las " + hora;
    }
}
