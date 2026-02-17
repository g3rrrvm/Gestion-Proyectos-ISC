/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class VentanaPrincipalConPaneles extends JFrame {

    public VentanaPrincipalConPaneles() {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("No se pudo aplicar Nimbus LookAndFeel: " + e);
        }

        setTitle("Sistema Escolar - Vista Principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 650);
        setLocationRelativeTo(null); // Centrado

        // Panel principal con padding y borde decorativo
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(new EmptyBorder(15, 15, 15, 15)); // Padding alrededor
        mainPanel.setBackground(Color.WHITE);

        // Pestañas con íconos opcionales y estilo visual
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setFont(new Font("Segoe UI", Font.BOLD, 14));

        tabbedPane.addTab("Alumnos", new PanelAlumno());
        tabbedPane.addTab("Profesores", new PanelProfesor());
        tabbedPane.addTab("Cursos", new PanelCurso());
        tabbedPane.addTab("Unidades de Aprendizaje", new PanelUnidadAprendizaje());
        tabbedPane.addTab("Asignación de Aula", new PanelAsignacionAula());
        tabbedPane.addTab("Aulas", new PanelAula());
        tabbedPane.addTab("Notas / Incidencias", new PanelNotaIncidencia());

        mainPanel.add(tabbedPane, BorderLayout.CENTER);
        add(mainPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new VentanaPrincipalConPaneles().setVisible(true);
        });
    }
}