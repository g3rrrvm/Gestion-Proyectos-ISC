/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author Gerson Morales
 */
public class Bombo extends Percusion {
    public void afinar() {
        System.out.println("El bombo no requiere afinacion tradicional");
    }
    public void tocar(NotaMusical nota) {
        System.out.println("Bombo tocando " + nota);
    }
}