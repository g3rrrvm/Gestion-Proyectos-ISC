/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enchiladasdecacahuate;

/**
 *
 * @author Gerson Morales
 */
public class Rellenar {

    public void rellenarTortilla(Tortilla tortilla, String relleno) {
        for (int i = 1; i <= tortilla.getCantidad(); i++) {
            System.out.println("Se ha rellenado la " + tortilla + " " + i + " con " + relleno + ".");
            try {
                Thread.sleep(1000); // pausa de 1 segundo
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Interrumpido mientras se rellenaba.");
            }
        }
    }
}