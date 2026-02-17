/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.UnidadAprendizaje;
import java.io.*;
import java.util.ArrayList;

public class ControladorUnidadAprendizaje {
    private ArrayList<UnidadAprendizaje> listaUnidades = new ArrayList<>();
    private static final String ARCHIVO = "datos/unidades_aprendizaje.csv";

    public ControladorUnidadAprendizaje() {
        cargarDesdeArchivo();
    }

    public void agregarUnidad(UnidadAprendizaje u) {
        listaUnidades.add(u);
        guardarEnArchivo(u);
    }

    public ArrayList<UnidadAprendizaje> getUnidades() {
        return listaUnidades;
    }

    private void guardarEnArchivo(UnidadAprendizaje u) {
        try (PrintWriter out = new PrintWriter(new FileWriter(ARCHIVO, true))) {
            out.println(u.getCodigo() + "," + u.getNombre() + "," + u.getSemestre() + "," + u.getCreditos() + "," + u.getHorasPorSemana());
        } catch (IOException e) {
            System.err.println("Error al guardar unidad: " + e.getMessage());
        }
    }

    private void cargarDesdeArchivo() {
        File archivo = new File(ARCHIVO);
        if (!archivo.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 5) {
                    listaUnidades.add(new UnidadAprendizaje(
                        partes[0], partes[1],
                        Integer.parseInt(partes[2]),
                        Integer.parseInt(partes[3]),
                        Integer.parseInt(partes[4])
                    ));
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer unidad: " + e.getMessage());
        }
    }
}