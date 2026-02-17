/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enchiladasdecacahuate;

/**
 *
 * @author Gerson Morales
 */
public class Cebolla {
    private boolean enPolvo;
    private boolean usado;

    public Cebolla() {
        this.enPolvo = false;
        this.usado = false;
    }

    public void hacerPolvo() {
        if (!enPolvo) {
            enPolvo = true;
            System.out.println("1/4 de cebolla se ha hecho polvo.");
        }
    }

    public void usarEntero() {
        if (!usado) {
            usado = true;
            System.out.println("1/2 de cebolla se ha agregado entero.");
        }
    }

    @Override
    public String toString() {
        if (enPolvo) return "1/2 de cebolla en polvo";
        if (usado) return "1/2 de cebolla entera (usado)";
        return "1/2 de cebolla entera";
    }
}