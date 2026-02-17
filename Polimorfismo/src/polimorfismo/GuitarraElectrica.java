/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author Gerson Morales
 */
public class GuitarraElectrica extends Electrico {
    public void afinar() {
        System.out.println("Afinando Guitarra Electrica");
    }

    public void tocar(NotaMusical nota) {
        System.out.println("Guitarra Electrica tocando " + nota);
    }
}