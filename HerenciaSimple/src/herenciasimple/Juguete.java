/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciasimple;

/**
 *
 * @author Gerson Morales
 */
public class Juguete {
    protected boolean seguro;
    protected boolean divertido;
    protected boolean emocionante;

    public Juguete() {
        this.seguro = true;
        this.divertido = true;
        this.emocionante = true;
        System.out.println("Soy un juguete.");
    }

    public Juguete(boolean seguro, boolean divertido, boolean emocionante) {
        this.seguro = seguro;
        this.divertido = divertido;
        this.emocionante = emocionante;
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

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Juguete destruido.");
    }
}