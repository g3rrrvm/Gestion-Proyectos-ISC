/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciasimple;

/**
 *
 * @author Gerson Morales
 */

public class CanicaDeAguita extends Canica {
    private boolean tieneDestello;

    public CanicaDeAguita() {
        super();
        this.tieneDestello = true;
        System.out.println("Soy una canica de aguita.");
    }

    @Override
    public String toString() {
        return super.toString() + ", transparente, sin diseno, con destello interno=" + tieneDestello;
    }
}