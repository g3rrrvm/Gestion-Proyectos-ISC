/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enchiladasdecacahuate;

/**
 *
 * @author Gerson Morales
 */

public class Ajo {
    private boolean enPolvo;
    private boolean usado;

    public Ajo() {
        this.enPolvo = false;
        this.usado = false;
    }

    public void hacerPolvo() {
        if (!enPolvo) {
            enPolvo = true;
            System.out.println("El diente de ajo se ha hecho polvo.");
        }
    }

    public void usarEntero() {
        if (!usado) {
            usado = true;
            System.out.println("El diente de ajo se ha agregado entero.");
        }
    }

    @Override
    public String toString() {
        if (enPolvo) return "1 diente de ajo en polvo";
        if (usado) return "1 diente de ajo entero (usado)";
        return "1 diente de ajo entero";
    }
}

