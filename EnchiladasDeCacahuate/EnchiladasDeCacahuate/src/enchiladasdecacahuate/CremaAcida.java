/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enchiladasdecacahuate;

/**
 *
 * @author Gerson Morales
 */
public class CremaAcida {
    private int cantidad;

    public CremaAcida(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof CremaAcida && ((CremaAcida) o).cantidad == this.cantidad;
    }

    @Override
    public String toString() {
        return "Crema ácida: " + cantidad + " taza(s)";
    }
}