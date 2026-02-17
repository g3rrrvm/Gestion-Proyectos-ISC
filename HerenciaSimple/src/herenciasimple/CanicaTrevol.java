/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciasimple;

/**
 *
 * @author Gerson Morales
 */

public class CanicaTrevol extends Canica {
    private boolean tieneColores;

    public CanicaTrevol() {
        super();
        this.tieneColores = true;
        System.out.println("Soy una canica trebol.");
    }

    @Override
    public String toString() {
        return super.toString() + ", transparente con pinceladas de color, destello interior=" + tieneColores;
    }
}