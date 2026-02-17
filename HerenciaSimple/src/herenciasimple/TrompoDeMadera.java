/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciasimple;

/**
 *
 * @author Gerson Morales
 */

public class TrompoDeMadera extends Trompo {
    private boolean esPulido;

    public TrompoDeMadera() {
        super();
        this.esPulido = true;
        System.out.println("Trompo de madera creado.");
    }

    @Override
    public String toString() {
        return super.toString() + ", material=madera, pulido=" + esPulido;
    }
}