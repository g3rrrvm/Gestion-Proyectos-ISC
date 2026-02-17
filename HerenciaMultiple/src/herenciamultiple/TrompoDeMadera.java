/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciamultiple;

/**
 *
 * @author Gerson Morales
 */

public class TrompoDeMadera extends Trompo {
    private boolean esPulido;
    private String tipoMadera;

    // Constructor 1: Por defecto
    public TrompoDeMadera() {
        super();
        this.esPulido = true;
        this.tipoMadera = "Roble";
        System.out.println("TrompoDeMadera: Constructor por defecto. Trompo de madera creado.");
    }

    // Constructor 2: Parcial
    public TrompoDeMadera(String tipoMadera) {
        super();
        this.esPulido = true;
        this.tipoMadera = tipoMadera;
        System.out.println("TrompoDeMadera: Constructor parcial.");
    }

    // Constructor 3: Completo
    public TrompoDeMadera(boolean seguro, boolean divertido, boolean emocionante, boolean usaCuerda, String forma, String punta, boolean esPulido, String tipoMadera) {
        super(seguro, divertido, emocionante, usaCuerda, forma, punta);
        this.esPulido = esPulido;
        this.tipoMadera = tipoMadera;
        System.out.println("TrompoDeMadera: Constructor completo.");
    }

    public void pulir() {
        if (!esPulido) {
            esPulido = true;
            System.out.println("El trompo de madera ha sido pulido.");
        } else {
            System.out.println("El trompo de madera ya está pulido.");
        }
    }

    @Override
    public String toString() {
        return "TrompoDeMadera [tipoMadera=" + tipoMadera + ", pulido=" + esPulido + ", " + super.toString() + "]";
    }

    // Método de "destructor" personalizado
    @Override
    public void cerrar() {
        System.out.println("TrompoDeMadera: Método cerrar() ejecutado. Recursos de Trompo de madera liberados.");
        super.cerrar();
    }
}