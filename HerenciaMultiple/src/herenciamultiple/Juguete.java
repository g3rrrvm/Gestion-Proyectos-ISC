/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciamultiple;

/**
 *
 * @author Gerson Morales
 */
public class Juguete {
    protected boolean seguro;
    protected boolean divertido;
    protected boolean emocionante;

    // Constructor 1: Por defecto
    public Juguete() {
        this.seguro = true;
        this.divertido = true;
        this.emocionante = true;
        System.out.println("Juguete: Constructor por defecto. Soy un juguete.");
    }

    // Constructor 2: Parcial
    public Juguete(boolean seguro, boolean divertido) {
        this.seguro = seguro;
        this.divertido = divertido;
        this.emocionante = true; // Por defecto
        System.out.println("Juguete: Constructor parcial.");
    }

    // Constructor 3: Completo
    public Juguete(boolean seguro, boolean divertido, boolean emocionante) {
        this.seguro = seguro;
        this.divertido = divertido;
        this.emocionante = emocionante;
        System.out.println("Juguete: Constructor completo.");
    }

    public void jugar() {
        System.out.println("Jugando con el juguete.");
    }

    public boolean esSeguro() {
        return seguro;
    }

    public boolean esDivertido() {
        return divertido;
    }

    public boolean esEmocionante() {
        return emocionante;
    }

    @Override
    public String toString() {
        return "Juguete [seguro=" + seguro + ", divertido=" + divertido + ", emocionante=" + emocionante + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Juguete)) return false;
        Juguete otro = (Juguete) obj;
        return this.seguro == otro.seguro &&
               this.divertido == otro.divertido &&
               this.emocionante == otro.emocionante;
    }

    // Método de "destructor" personalizado
    public void cerrar() {
        System.out.println("Juguete: Método cerrar() ejecutado. Recursos de Juguete liberados.");
    }
}