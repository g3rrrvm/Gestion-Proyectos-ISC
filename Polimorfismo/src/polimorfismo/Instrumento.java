/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author Gerson Morales
 */

public abstract class Instrumento {
    public abstract void afinar();
    public abstract void tocar(NotaMusical nota);

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}