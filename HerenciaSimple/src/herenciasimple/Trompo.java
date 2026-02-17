/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciasimple;

/**
 *
 * @author Gerson Morales
 */
public class Trompo extends Juguete {
    protected boolean usaCuerda;
    protected String forma;
    protected String punta;

    public Trompo() {
        super(true, true, true);
        this.usaCuerda = true;
        this.forma = "cono";
        this.punta = "metal";
        System.out.println("Soy un trompo.");
    }

    public void girar() {
        System.out.println("El trompo gira rapidamente.");
    }

    public void lanzar() {
        System.out.println("Se lanza el trompo con fuerza.");
    }

    @Override
    public String toString() {
        return "Trompo [forma=" + forma + ", punta=" + punta + ", usa cuerda=" + usaCuerda + "]";
    }
}