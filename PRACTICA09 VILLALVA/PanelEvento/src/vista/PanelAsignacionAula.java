/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.ControladorAsignacionAula;
import modelo.AsignacionAula;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class PanelAsignacionAula extends JPanel {
    private JTextField campoUnidad, campoAula, campoMes, campoDia, campoHora;
    private JButton botonAsignar;
    private JTable tabla;
    private DefaultTableModel modelo;
    private ControladorAsignacionAula controlador;

    public PanelAsignacionAula() {
        controlador = new ControladorAsignacionAula();

        setLayout(new GridBagLayout());
        setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(6,6,6,6);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        campoUnidad = new JTextField(20);
        campoAula = new JTextField(20);
        campoMes = new JTextField(20);
        campoDia = new JTextField(20);
        campoHora = new JTextField(20);
        botonAsignar = new JButton("Asignar Aula");

        int fila = 0;
        addField("Unidad:", campoUnidad, gbc, fila++);
        addField("Aula:", campoAula, gbc, fila++);
        addField("Mes:", campoMes, gbc, fila++);
        addField("Día:", campoDia, gbc, fila++);
        addField("Hora:", campoHora, gbc, fila++);

        gbc.gridx = 1; gbc.gridy = fila;
        gbc.anchor = GridBagConstraints.EAST;
        add(botonAsignar, gbc);

        modelo = new DefaultTableModel(new String[]{"Unidad", "Aula", "Mes", "Día", "Hora"}, 0);
        tabla = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tabla);
        gbc.gridx = 0; gbc.gridy = fila + 1;
        gbc.gridwidth = 2; gbc.weightx = 1; gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        add(scroll, gbc);

        botonAsignar.addActionListener(e -> {
            AsignacionAula a = new AsignacionAula(
                campoUnidad.getText().trim(),
                campoAula.getText().trim(),
                campoMes.getText().trim(),
                campoDia.getText().trim(),
                campoHora.getText().trim()
            );
            controlador.agregarAsignacion(a);
            modelo.addRow(new Object[]{a.getCodigoUnidad(), a.getCodigoAula(), a.getMes(), a.getDia(), a.getHora()});
            limpiar();
        });

        cargarTabla();
    }

    private void addField(String etiqueta, JTextField campo, GridBagConstraints gbc, int fila) {
        gbc.gridx = 0; gbc.gridy = fila;
        add(new JLabel(etiqueta), gbc);
        gbc.gridx = 1;
        add(campo, gbc);
    }

    private void limpiar() {
        campoUnidad.setText("");
        campoAula.setText("");
        campoMes.setText("");
        campoDia.setText("");
        campoHora.setText("");
    }

    private void cargarTabla() {
        for (AsignacionAula a : controlador.getAsignaciones()) {
            modelo.addRow(new Object[]{a.getCodigoUnidad(), a.getCodigoAula(), a.getMes(), a.getDia(), a.getHora()});
        }
    }
}