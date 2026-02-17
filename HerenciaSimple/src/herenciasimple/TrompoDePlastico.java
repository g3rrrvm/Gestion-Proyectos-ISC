/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciasimple;

/**
 *
 * @author Gerson Morales
 */

public class TrompoDePlastico extends Trompo {
    private String color;
    private boolean tieneAro;

    public TrompoDePlastico() {
        super();
        this.color = "rojo";
        this.tieneAro = true;
        System.out.println("Trompo de plastico creado.");
    }

    @Override
    public String toString() {
        return super.toString() + ", material=plastico, color=" + color + ", aro=" + tieneAro;
    }
}