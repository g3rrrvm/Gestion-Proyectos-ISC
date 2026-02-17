/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.ControladorUnidadAprendizaje;
import modelo.UnidadAprendizaje;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class PanelUnidadAprendizaje extends JPanel {
    private JTextField campoCodigo, campoNombre, campoSemestre, campoCreditos, campoHoras;
    private JButton botonAgregar;
    private JTable tabla;
    private DefaultTableModel modelo;
    private ControladorUnidadAprendizaje controlador;

    public PanelUnidadAprendizaje() {
        controlador = new ControladorUnidadAprendizaje();

        setLayout(new GridBagLayout());
        setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(6,6,6,6);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        campoCodigo = new JTextField(20);
        campoNombre = new JTextField(20);
        campoSemestre = new JTextField(20);
        campoCreditos = new JTextField(20);
        campoHoras = new JTextField(20);
        botonAgregar = new JButton("Agregar Unidad");

        int fila = 0;
        addField("Código:", campoCodigo, gbc, fila++);
        addField("Nombre:", campoNombre, gbc, fila++);
        addField("Semestre:", campoSemestre, gbc, fila++);
        addField("Créditos:", campoCreditos, gbc, fila++);
        addField("Horas/Semana:", campoHoras, gbc, fila++);

        gbc.gridx = 1; gbc.gridy = fila;
        gbc.anchor = GridBagConstraints.EAST;
        add(botonAgregar, gbc);

        modelo = new DefaultTableModel(new String[]{"Código", "Nombre", "Semestre", "Créditos", "Horas"}, 0);
        tabla = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tabla);
        gbc.gridx = 0; gbc.gridy = fila + 1;
        gbc.gridwidth = 2; gbc.weightx = 1; gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        add(scroll, gbc);

        botonAgregar.addActionListener(e -> {
            UnidadAprendizaje u = new UnidadAprendizaje(
                campoCodigo.getText().trim(),
                campoNombre.getText().trim(),
                Integer.parseInt(campoSemestre.getText().trim()),
                Integer.parseInt(campoCreditos.getText().trim()),
                Integer.parseInt(campoHoras.getText().trim())
            );
            controlador.agregarUnidad(u);
            modelo.addRow(new Object[]{u.getCodigo(), u.getNombre(), u.getSemestre(), u.getCreditos(), u.getHorasPorSemana()});
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
        campoCodigo.setText("");
        campoNombre.setText("");
        campoSemestre.setText("");
        campoCreditos.setText("");
        campoHoras.setText("");
    }

    private void cargarTabla() {
        for (UnidadAprendizaje u : controlador.getUnidades()) {
            modelo.addRow(new Object[]{u.getCodigo(), u.getNombre(), u.getSemestre(), u.getCreditos(), u.getHorasPorSemana()});
        }
    }
}