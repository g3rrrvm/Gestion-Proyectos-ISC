/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;


import modelo.NotaIncidencia;
import java.io.*;
import java.util.ArrayList;

public class ControladorNotaIncidencia {
    private ArrayList<NotaIncidencia> notas = new ArrayList<>();
    private static final String ARCHIVO = "datos/notas_incidencias.csv";

    public ControladorNotaIncidencia() {
        cargarNotasDesdeArchivo();
    }

    public void agregarNotaIncidencia(NotaIncidencia ni) {
        notas.add(ni);
        guardarNotaEnArchivo(ni);
    }

    public ArrayList<NotaIncidencia> getNotas() {
        return notas;
    }

    private void guardarNotaEnArchivo(NotaIncidencia ni) {
        try (PrintWriter out = new PrintWriter(new FileWriter(ARCHIVO, true))) {
            out.println(ni.getMatriculaAlumno() + "," + ni.getCodigoUnidad() + "," + ni.getNota() + "," + ni.getIncidencia());
        } catch (IOException e) {
            System.err.println("Error al guardar nota/incidencia: " + e.getMessage());
        }
    }

    private void cargarNotasDesdeArchivo() {
        File archivo = new File(ARCHIVO);
        if (!archivo.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 4) {
                    notas.add(new NotaIncidencia(
                        partes[0],
                        partes[1],
                        Double.parseDouble(partes[2]),
                        partes[3]
                    ));
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer nota/incidencia: " + e.getMessage());
        }
    }
}