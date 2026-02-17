/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Aula;
import java.io.*;
import java.util.ArrayList;

public class ControladorAula {
    private ArrayList<Aula> listaAulas = new ArrayList<>();
    private static final String ARCHIVO = "datos/aulas.csv";

    public ControladorAula() {
        cargarAulasDesdeArchivo();
    }

    public void agregarAula(Aula a) {
        listaAulas.add(a);
        guardarAulaEnArchivo(a);
    }

    public ArrayList<Aula> getAulas() {
        return listaAulas;
    }

    private void guardarAulaEnArchivo(Aula aula) {
        try (PrintWriter out = new PrintWriter(new FileWriter(ARCHIVO, true))) {
            out.println(aula.getCodigo() + "," + aula.getPiso() + "," + aula.getNumPupitres());
        } catch (IOException e) {
            System.err.println("Error al guardar aula: " + e.getMessage());
        }
    }

    private void cargarAulasDesdeArchivo() {
        File archivo = new File(ARCHIVO);
        if (!archivo.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 3) {
                    listaAulas.add(new Aula(partes[0], Integer.parseInt(partes[1]), Integer.parseInt(partes[2])));
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer aulas: " + e.getMessage());
        }
    }
}