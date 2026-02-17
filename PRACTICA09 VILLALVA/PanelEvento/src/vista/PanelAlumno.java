/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.ControladorAlumno;
import modelo.Alumno;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PanelAlumno extends JPanel {

    private JTextField campoNombre, campoApellidoP, campoApellidoM, campoDireccion,
            campoPoblacion, campoFechaNacimiento, campoCodigoPostal, campoTelefono;
    private JButton botonAgregar;
    private JTable tablaAlumnos;
    private DefaultTableModel modeloTabla;
    private ControladorAlumno controlador;

    public PanelAlumno() {
        controlador = new ControladorAlumno();

        setLayout(new GridBagLayout());
        setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(6, 6, 6, 6);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        int fila = 0;

        // Campos del formulario
        addLabelAndField("Nombre:", campoNombre = new JTextField(20), gbc, fila++);
        addLabelAndField("Apellido Paterno:", campoApellidoP = new JTextField(20), gbc, fila++);
        addLabelAndField("Apellido Materno:", campoApellidoM = new JTextField(20), gbc, fila++);
        addLabelAndField("Dirección:", campoDireccion = new JTextField(20), gbc, fila++);
        addLabelAndField("Población:", campoPoblacion = new JTextField(20), gbc, fila++);
        addLabelAndField("Fecha de Nacimiento:", campoFechaNacimiento = new JTextField(20), gbc, fila++);
        addLabelAndField("Código Postal:", campoCodigoPostal = new JTextField(20), gbc, fila++);
        addLabelAndField("Teléfono:", campoTelefono = new JTextField(20), gbc, fila++);

        // Botón
        botonAgregar = new JButton("Agregar Alumno");
        gbc.gridx = 1;
        gbc.gridy = fila++;
        gbc.anchor = GridBagConstraints.EAST;
        add(botonAgregar, gbc);

        // Tabla
        String[] columnas = {"Nombre", "Apellido P", "Apellido M", "Dirección", "Población", "Nacimiento", "CP", "Teléfono"};
        modeloTabla = new DefaultTableModel(columnas, 0);
        tablaAlumnos = new JTable(modeloTabla);
        JScrollPane scroll = new JScrollPane(tablaAlumnos);
        gbc.gridx = 0;
        gbc.gridy = fila;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 1;
        add(scroll, gbc);

        cargarTabla();

        // Acción del botón
        botonAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Alumno nuevo = new Alumno(
                        campoNombre.getText().trim(),
                        campoApellidoP.getText().trim(),
                        campoApellidoM.getText().trim(),
                        campoDireccion.getText().trim(),
                        campoPoblacion.getText().trim(),
                        campoFechaNacimiento.getText().trim(),
                        campoCodigoPostal.getText().trim(),
                        campoTelefono.getText().trim()
                );
                controlador.agregarAlumno(nuevo);
                agregarFilaTabla(nuevo);
                JOptionPane.showMessageDialog(null, "Alumno registrado correctamente.");
                limpiarCampos();
            }
        });
    }

    private void addLabelAndField(String label, JTextField field, GridBagConstraints gbc, int row) {
        gbc.gridx = 0;
        gbc.gridy = row;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.weightx = 0;
        add(new JLabel(label), gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        add(field, gbc);
    }

    private void limpiarCampos() {
        campoNombre.setText("");
        campoApellidoP.setText("");
        campoApellidoM.setText("");
        campoDireccion.setText("");
        campoPoblacion.setText("");
        campoFechaNacimiento.setText("");
        campoCodigoPostal.setText("");
        campoTelefono.setText("");
    }

    private void agregarFilaTabla(Alumno a) {
        modeloTabla.addRow(new Object[]{
                a.getNombre(),
                a.getApellidoPaterno(),
                a.getApellidoMaterno(),
                a.getDireccion(),
                a.getPoblacion(),
                a.getFechaNacimiento(),
                a.getCodigoPostal(),
                a.getTelefono()
        });
    }

    private void cargarTabla() {
        ArrayList<Alumno> lista = controlador.getAlumnos();
        for (Alumno a : lista) {
            agregarFilaTabla(a);
        }
    }
}