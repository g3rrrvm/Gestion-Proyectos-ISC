/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author Gerson Morales
 */
public class Timbal extends Percusion {
    public void afinar() {
        System.out.println("El timbal no requiere afinación tradicional");
    }
    public void tocar(NotaMusical nota) {
        System.out.println("Timbal tocando " + nota);
    }
}
