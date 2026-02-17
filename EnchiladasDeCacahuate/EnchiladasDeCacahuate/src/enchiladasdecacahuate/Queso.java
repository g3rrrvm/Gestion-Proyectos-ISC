/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enchiladasdecacahuate;

/**
 *
 * @author Gerson Morales
 */
class Queso {
    private String tipo;
    private double cantidad;

    public Queso(String tipo, double cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public boolean equals(Object o) {
        return o instanceof Queso &&
               ((Queso) o).tipo.equals(this.tipo) &&
               ((Queso) o).cantidad == this.cantidad;
    }

    public String toString() {
        return "Queso tipo: " + tipo + ", " + cantidad + " taza(s)";
    }
}