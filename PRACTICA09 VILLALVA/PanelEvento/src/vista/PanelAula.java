/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.ControladorAula;
import modelo.Aula;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class PanelAula extends JPanel {
    private JTextField campoCodigo, campoPiso, campoPupitres;
    private JButton botonAgregar;
    private JTable tabla;
    private DefaultTableModel modelo;
    private ControladorAula controlador;

    public PanelAula() {
        controlador = new ControladorAula();

        setLayout(new GridBagLayout());
        setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(6,6,6,6);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        campoCodigo = new JTextField(20);
        campoPiso = new JTextField(20);
        campoPupitres = new JTextField(20);
        botonAgregar = new JButton("Agregar Aula");

        int fila = 0;
        addField("Código:", campoCodigo, gbc, fila++);
        addField("Piso:", campoPiso, gbc, fila++);
        addField("Pupitres:", campoPupitres, gbc, fila++);

        gbc.gridx = 1; gbc.gridy = fila;
        gbc.anchor = GridBagConstraints.EAST;
        add(botonAgregar, gbc);

        modelo = new DefaultTableModel(new String[]{"Código", "Piso", "Pupitres"}, 0);
        tabla = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tabla);
        gbc.gridx = 0; gbc.gridy = fila + 1;
        gbc.gridwidth = 2; gbc.weightx = 1; gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        add(scroll, gbc);

        botonAgregar.addActionListener(e -> {
            Aula aula = new Aula(
                campoCodigo.getText().trim(),
                Integer.parseInt(campoPiso.getText().trim()),
                Integer.parseInt(campoPupitres.getText().trim())
            );
            controlador.agregarAula(aula);
            modelo.addRow(new Object[]{aula.getCodigo(), aula.getPiso(), aula.getNumPupitres()});
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
        campoPiso.setText("");
        campoPupitres.setText("");
    }

    private void cargarTabla() {
        for (Aula a : controlador.getAulas()) {
            modelo.addRow(new Object[]{a.getCodigo(), a.getPiso(), a.getNumPupitres()});
        }
    }
}