/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enchiladasdecacahuate;

/**
 *
 * @author Gerson Morales
 */

public class Pollo {
    private boolean cocido = false;
    private boolean deshebrado = false;

    public void cocer() {
        cocido = true;
        System.out.println("El pollo ha sido cocido.");
    }

    public void deshebrar() {
        if (cocido) {
            deshebrado = true;
            System.out.println("El pollo cocido ha sido deshebrado.");
        } else {
            System.out.println("No se puede deshebrar el pollo sin cocerlo antes.");
        }
    }

    public boolean estaDeshebrado() {
        return deshebrado;
    }
}