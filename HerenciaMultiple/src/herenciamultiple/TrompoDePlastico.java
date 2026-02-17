/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciamultiple;

/**
 *
 * @author Gerson Morales
 */

public class TrompoDePlastico extends Trompo {
    private String color;
    private boolean tieneAro;
    private String tipoPlastico;

    // Constructor 1: Por defecto
    public TrompoDePlastico() {
        super();
        this.color = "rojo";
        this.tieneAro = true;
        this.tipoPlastico = "PVC";
        System.out.println("TrompoDePlastico: Constructor por defecto. Trompo de plastico creado.");
    }

    // Constructor 2: Parcial
    public TrompoDePlastico(String color, boolean tieneAro) {
        super();
        this.color = color;
        this.tieneAro = tieneAro;
        this.tipoPlastico = "PVC";
        System.out.println("TrompoDePlastico: Constructor parcial.");
    }

    // Constructor 3: Completo
    public TrompoDePlastico(boolean seguro, boolean divertido, boolean emocionante, boolean usaCuerda, String forma, String punta, String color, boolean tieneAro, String tipoPlastico) {
        super(seguro, divertido, emocionante, usaCuerda, forma, punta);
        this.color = color;
        this.tieneAro = tieneAro;
        this.tipoPlastico = tipoPlastico;
        System.out.println("TrompoDePlastico: Constructor completo.");
    }

    public void cambiarColor(String nuevoColor) {
        this.color = nuevoColor;
        System.out.println("El color del trompo de plastico ha cambiado a " + nuevoColor);
    }

    @Override
    public String toString() {
        return "TrompoDePlastico [tipoPlastico=" + tipoPlastico + ", color=" + color + ", aro=" + tieneAro + ", " + super.toString() + "]";
    }

    // Método de "destructor" personalizado
    @Override
    public void cerrar() {
        System.out.println("TrompoDePlastico: Método cerrar() ejecutado. Recursos de Trompo de plastico liberados.");
        super.cerrar();
    }
}