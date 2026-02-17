/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.ControladorCurso;
import modelo.Curso;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class PanelCurso extends JPanel {
    private JTextField campoCodigo, campoNombre;
    private JButton botonAgregar;
    private JTable tabla;
    private DefaultTableModel modelo;
    private ControladorCurso controlador;

    public PanelCurso() {
        controlador = new ControladorCurso();
        setLayout(new GridBagLayout());
        setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(6,6,6,6);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        campoCodigo = new JTextField(20);
        campoNombre = new JTextField(20);
        botonAgregar = new JButton("Agregar Curso");

        gbc.gridx = 0; gbc.gridy = 0;
        add(new JLabel("Código:"), gbc);
        gbc.gridx = 1;
        add(campoCodigo, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        add(new JLabel("Nombre:"), gbc);
        gbc.gridx = 1;
        add(campoNombre, gbc);

        gbc.gridx = 1; gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;
        add(botonAgregar, gbc);

        modelo = new DefaultTableModel(new String[]{"Código", "Nombre"}, 0);
        tabla = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tabla);
        gbc.gridx = 0; gbc.gridy = 3; gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1; gbc.weighty = 1;
        add(scroll, gbc);

        botonAgregar.addActionListener(e -> {
            Curso c = new Curso(campoCodigo.getText().trim(), campoNombre.getText().trim());
            controlador.agregarCurso(c);
            modelo.addRow(new Object[]{c.getCodigo(), c.getNombre()});
            limpiar();
        });

        cargarTabla();
    }

    private void limpiar() {
        campoCodigo.setText("");
        campoNombre.setText("");
    }

    private void cargarTabla() {
        for (Curso c : controlador.getCursos()) {
            modelo.addRow(new Object[]{c.getCodigo(), c.getNombre()});
        }
    }
}