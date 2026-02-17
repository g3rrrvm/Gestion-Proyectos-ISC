/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.AsignacionAula;
import java.io.*;
import java.util.ArrayList;

public class ControladorAsignacionAula {
    private ArrayList<AsignacionAula> asignaciones = new ArrayList<>();
    private static final String ARCHIVO = "datos/asignaciones.csv";

    public ControladorAsignacionAula() {
        cargarAsignacionesDesdeArchivo();
    }

    public void agregarAsignacion(AsignacionAula a) {
        asignaciones.add(a);
        guardarAsignacionEnArchivo(a);
    }

    public ArrayList<AsignacionAula> getAsignaciones() {
        return asignaciones;
    }

    private void guardarAsignacionEnArchivo(AsignacionAula a) {
        try (PrintWriter out = new PrintWriter(new FileWriter(ARCHIVO, true))) {
            out.println(a.getCodigoUnidad() + "," + a.getCodigoAula() + "," + a.getMes() + "," + a.getDia() + "," + a.getHora());
        } catch (IOException e) {
            System.err.println("Error al guardar asignación: " + e.getMessage());
        }
    }

    private void cargarAsignacionesDesdeArchivo() {
        File archivo = new File(ARCHIVO);
        if (!archivo.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 5) {
                    asignaciones.add(new AsignacionAula(partes[0], partes[1], partes[2], partes[3], partes[4]));
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer asignaciones: " + e.getMessage());
        }
    }
}