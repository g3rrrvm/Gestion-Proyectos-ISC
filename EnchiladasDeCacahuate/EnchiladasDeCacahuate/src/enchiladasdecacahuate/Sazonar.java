/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enchiladasdecacahuate;

/**
 *
 * @author Gerson Morales
 */


public class Sazonar {
    private String[] sazonadores = {"sal", "pimienta", "ajo en polvo", "cebolla en polvo"};

    public void aplicarSazonador(String ingrediente) {
        System.out.print("Sazonando " + ingrediente + " con ");
        for (int i = 0; i < sazonadores.length; i++) {
            System.out.print(sazonadores[i]);
            if (i < sazonadores.length - 2) {
                System.out.print(", ");
            } else if (i == sazonadores.length - 2) {
                System.out.print(" y ");
            }
        }
        System.out.println(".");
    }
}