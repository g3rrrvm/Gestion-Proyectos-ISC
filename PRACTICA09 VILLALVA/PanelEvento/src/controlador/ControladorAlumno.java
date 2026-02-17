/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

 import modelo.Alumno;
import java.io.*;
import java.util.ArrayList;

public class ControladorAlumno {

    private ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    private static final String RUTA_ARCHIVO = "datos/alumnos.csv";

    public ControladorAlumno() {
        File archivo = new File(RUTA_ARCHIVO);
        if (!archivo.exists()) {
            try {
                archivo.getParentFile().mkdirs();
                archivo.createNewFile();
            } catch (IOException e) {
                System.err.println("Error al crear el archivo de alumnos: " + e.getMessage());
            }
        }
        cargarAlumnosDesdeArchivo();
    }

    public void agregarAlumno(Alumno a) {
        listaAlumnos.add(a);
        guardarAlumnoEnArchivo(a);
    }

    public ArrayList<Alumno> getAlumnos() {
        return listaAlumnos;
    }

    public Alumno buscarPorNombre(String nombre) {
        for (Alumno a : listaAlumnos) {
            if (a.getNombre().equalsIgnoreCase(nombre)) {
                return a;
            }
        }
        return null;
    }

    public void eliminarAlumno(Alumno a) {
        listaAlumnos.remove(a);
    }

    private void guardarAlumnoEnArchivo(Alumno alumno) {
        try (FileWriter fw = new FileWriter(RUTA_ARCHIVO, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {

            out.println(
                alumno.getNombre() + "," +
                alumno.getApellidoPaterno() + "," +
                alumno.getApellidoMaterno() + "," +
                alumno.getDireccion() + "," +
                alumno.getPoblacion() + "," +
                alumno.getFechaNacimiento() + "," +
                alumno.getCodigoPostal() + "," +
                alumno.getTelefono()
            );

        } catch (IOException e) {
            System.err.println("Error al guardar el alumno: " + e.getMessage());
        }
    }

    private void cargarAlumnosDesdeArchivo() {
        try (BufferedReader br = new BufferedReader(new FileReader(RUTA_ARCHIVO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 8) {
                    Alumno a = new Alumno(
                        datos[0], datos[1], datos[2], datos[3],
                        datos[4], datos[5], datos[6], datos[7]
                    );
                    listaAlumnos.add(a);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al cargar alumnos: " + e.getMessage());
        }
    }
}