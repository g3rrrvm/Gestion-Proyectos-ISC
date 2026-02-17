/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Curso;
import java.io.*;
import java.util.ArrayList;

public class ControladorCurso {
    private ArrayList<Curso> listaCursos = new ArrayList<>();
    private static final String ARCHIVO = "datos/cursos.csv";

    public ControladorCurso() {
        cargarCursosDesdeArchivo();
    }

    public void agregarCurso(Curso c) {
        listaCursos.add(c);
        guardarCursoEnArchivo(c);
    }

    public ArrayList<Curso> getCursos() {
        return listaCursos;
    }

    private void guardarCursoEnArchivo(Curso curso) {
        try (PrintWriter out = new PrintWriter(new FileWriter(ARCHIVO, true))) {
            out.println(curso.getCodigo() + "," + curso.getNombre());
        } catch (IOException e) {
            System.err.println("Error al guardar curso: " + e.getMessage());
        }
    }

    private void cargarCursosDesdeArchivo() {
        File archivo = new File(ARCHIVO);
        if (!archivo.exists()) return;
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 2) {
                    listaCursos.add(new Curso(partes[0], partes[1]));
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer cursos: " + e.getMessage());
        }
    }
}