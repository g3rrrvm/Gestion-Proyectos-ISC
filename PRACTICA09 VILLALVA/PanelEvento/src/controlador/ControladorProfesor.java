/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import modelo.Profesor;
import java.io.*;
import java.util.ArrayList;

public class ControladorProfesor {
    private ArrayList<Profesor> listaProfesores = new ArrayList<>();
    private static final String ARCHIVO = "datos/profesores.csv";

    public ControladorProfesor() {
        cargarDesdeArchivo();
    }

    public void agregarProfesor(Profesor p) {
        listaProfesores.add(p);
        guardarEnArchivo(p);
    }

    public ArrayList<Profesor> getProfesores() {
        return listaProfesores;
    }

    private void guardarEnArchivo(Profesor p) {
        try (PrintWriter out = new PrintWriter(new FileWriter(ARCHIVO, true))) {
            out.println(p.getNombre() + "," + p.getApellidoPaterno() + "," + p.getApellidoMaterno() + "," +
                        p.getDireccion() + "," + p.getPoblacion() + "," + p.getFechaNacimiento() + "," +
                        p.getCodigoPostal() + "," + p.getTelefono());
        } catch (IOException e) {
            System.err.println("Error al guardar profesor: " + e.getMessage());
        }
    }

    private void cargarDesdeArchivo() {
        File archivo = new File(ARCHIVO);
        if (!archivo.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 8) {
                    listaProfesores.add(new Profesor(
                        partes[0], partes[1], partes[2],
                        partes[3], partes[4], partes[5],
                        partes[6], partes[7]
                    ));
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer profesor: " + e.getMessage());
        }
    }
}