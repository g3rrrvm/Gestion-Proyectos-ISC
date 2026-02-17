/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.ControladorNotaIncidencia;
import modelo.NotaIncidencia;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class PanelNotaIncidencia extends JPanel {
    private JTextField campoAlumno, campoUnidad, campoNota, campoDescripcion;
    private JButton botonRegistrar;
    private JTable tabla;
    private DefaultTableModel modelo;
    private ControladorNotaIncidencia controlador;

    public PanelNotaIncidencia() {
        controlador = new ControladorNotaIncidencia();

        setLayout(new GridBagLayout());
        setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(6,6,6,6);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        campoAlumno = new JTextField(20);
        campoUnidad = new JTextField(20);
        campoNota = new JTextField(20);
        campoDescripcion = new JTextField(20);
        botonRegistrar = new JButton("Registrar Nota");

        int fila = 0;
        addField("Alumno (matrícula):", campoAlumno, gbc, fila++);
        addField("Código Unidad:", campoUnidad, gbc, fila++);
        addField("Nota:", campoNota, gbc, fila++);
        addField("Incidencia:", campoDescripcion, gbc, fila++);

        gbc.gridx = 1; gbc.gridy = fila;
        gbc.anchor = GridBagConstraints.EAST;
        add(botonRegistrar, gbc);

        modelo = new DefaultTableModel(new String[]{"Alumno", "Unidad", "Nota", "Incidencia"}, 0);
        tabla = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tabla);
        gbc.gridx = 0; gbc.gridy = fila + 1;
        gbc.gridwidth = 2; gbc.weightx = 1; gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        add(scroll, gbc);

        botonRegistrar.addActionListener(e -> {
            NotaIncidencia ni = new NotaIncidencia(
                campoAlumno.getText().trim(),
                campoUnidad.getText().trim(),
                Double.parseDouble(campoNota.getText().trim()),
                campoDescripcion.getText().trim()
            );
            controlador.agregarNotaIncidencia(ni);
            modelo.addRow(new Object[]{ni.getMatriculaAlumno(), ni.getCodigoUnidad(), ni.getNota(), ni.getIncidencia()});
            limpiar();
        });

        cargarTabla();
    }

    private void addField(String etiqueta, JTextField campo, GridBagConstraints gbc, int fila) {
        gbc.gridx = 0; gbc.gridy = fila;
        gbc.anchor = GridBagConstraints.WEST;
        add(new JLabel(etiqueta), gbc);
        gbc.gridx = 1;
        add(campo, gbc);
    }

    private void limpiar() {
        campoAlumno.setText("");
        campoUnidad.setText("");
        campoNota.setText("");
        campoDescripcion.setText("");
    }

    private void cargarTabla() {
        for (NotaIncidencia ni : controlador.getNotas()) {
            modelo.addRow(new Object[]{ni.getMatriculaAlumno(), ni.getCodigoUnidad(), ni.getNota(), ni.getIncidencia()});
        }
    }
}