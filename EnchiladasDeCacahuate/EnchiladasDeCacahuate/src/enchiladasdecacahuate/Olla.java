/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enchiladasdecacahuate;

/**
 *
 * @author Gerson Morales
 */

public class Olla {
    private boolean enUso = false;

    public void colocarIngrediente(String ingrediente) {
        System.out.println("Colocando " + ingrediente + " en la olla.");
    }

    public void hervir(String contenido) {
        enUso = true;
        System.out.println("Hirviendo " + contenido + " en la olla...");
    }

    public void apagar() {
        enUso = false;
        System.out.println("Apagando la olla.");
    }
}