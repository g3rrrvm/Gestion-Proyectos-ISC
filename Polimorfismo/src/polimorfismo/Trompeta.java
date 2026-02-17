/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author Gerson Morales
 */
public class Trompeta extends Viento {
    public void afinar() {
        System.out.println("Afinando Trompeta");
    }

    public void tocar(NotaMusical nota) {
        System.out.println("Trompeta tocando " + nota);
    }
}