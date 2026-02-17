/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author Gerson Morales
 */
public class Sintetizador extends Electrico {
    public void afinar() {
        System.out.println("Afinando Sintetizador");
    }

    public void tocar(NotaMusical nota) {
        System.out.println("Sintetizador tocando " + nota);
    }
}
