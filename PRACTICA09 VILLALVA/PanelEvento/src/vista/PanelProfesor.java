/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.ControladorProfesor;
import modelo.Profesor;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class PanelProfesor extends JPanel {
    private JTextField campoNombre, campoPaterno, campoMaterno, campoDireccion, campoPoblacion;
    private JTextField campoFecha, campoCP, campoTelefono;
    private JButton botonAgregar;
    private JTable tabla;
    private DefaultTableModel modelo;
    private ControladorProfesor controlador;

    public PanelProfesor() {
        controlador = new ControladorProfesor();

        setLayout(new GridBagLayout());
        setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(6, 6, 6, 6);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        campoNombre = new JTextField(20);
        campoPaterno = new JTextField(20);
        campoMaterno = new JTextField(20);
        campoDireccion = new JTextField(20);
        campoPoblacion = new JTextField(20);
        campoFecha = new JTextField(20);
        campoCP = new JTextField(20);
        campoTelefono = new JTextField(20);
        botonAgregar = new JButton("Agregar Profesor");

        int fila = 0;
        addField("Nombre:", campoNombre, gbc, fila++);
        addField("Apellido Paterno:", campoPaterno, gbc, fila++);
        addField("Apellido Materno:", campoMaterno, gbc, fila++);
        addField("Dirección:", campoDireccion, gbc, fila++);
        addField("Población:", campoPoblacion, gbc, fila++);
        addField("Fecha de Nacimiento:", campoFecha, gbc, fila++);
        addField("Código Postal:", campoCP, gbc, fila++);
        addField("Teléfono:", campoTelefono, gbc, fila++);

        gbc.gridx = 1;
        gbc.gridy = fila;
        gbc.anchor = GridBagConstraints.EAST;
        add(botonAgregar, gbc);

        modelo = new DefaultTableModel(new String[]{
            "Nombre", "Paterno", "Materno", "Dirección", "Población", "Nacimiento", "CP", "Teléfono"
        }, 0);
        tabla = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tabla);

        gbc.gridx = 0;
        gbc.gridy = fila + 1;
        gbc.gridwidth = 2;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        add(scroll, gbc);

        botonAgregar.addActionListener(e -> {
            Profesor p = new Profesor(
                campoNombre.getText().trim(),
                campoPaterno.getText().trim(),
                campoMaterno.getText().trim(),
                campoDireccion.getText().trim(),
                campoPoblacion.getText().trim(),
                campoFecha.getText().trim(),
                campoCP.getText().trim(),
                campoTelefono.getText().trim()
            );
            controlador.agregarProfesor(p);
            modelo.addRow(new Object[]{
                p.getNombre(), p.getApellidoPaterno(), p.getApellidoMaterno(),
                p.getDireccion(), p.getPoblacion(), p.getFechaNacimiento(),
                p.getCodigoPostal(), p.getTelefono()
            });
            limpiar();
        });

        cargarTabla();
    }

    private void addField(String etiqueta, JTextField campo, GridBagConstraints gbc, int fila) {
        gbc.gridx = 0;
        gbc.gridy = fila;
        gbc.anchor = GridBagConstraints.WEST;
        add(new JLabel(etiqueta), gbc);

        gbc.gridx = 1;
        add(campo, gbc);
    }

    private void limpiar() {
        campoNombre.setText("");
        campoPaterno.setText("");
        campoMaterno.setText("");
        campoDireccion.setText("");
        campoPoblacion.setText("");
        campoFecha.setText("");
        campoCP.setText("");
        campoTelefono.setText("");
    }

    private void cargarTabla() {
        for (Profesor p : controlador.getProfesores()) {
            modelo.addRow(new Object[]{
                p.getNombre(), p.getApellidoPaterno(), p.getApellidoMaterno(),
                p.getDireccion(), p.getPoblacion(), p.getFechaNacimiento(),
                p.getCodigoPostal(), p.getTelefono()
            });
        }
    }
}