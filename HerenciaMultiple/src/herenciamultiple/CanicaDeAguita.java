/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciamultiple;

/**
 *
 * @author Gerson Morales
 */

public class CanicaDeAguita extends Canica {
    private boolean tieneDestello;
    private boolean esTransparente;

    // Constructor 1: Por defecto
    public CanicaDeAguita() {
        super();
        this.tieneDestello = true;
        this.esTransparente = true;
        System.out.println("CanicaDeAguita: Constructor por defecto. Soy una canica de aguita.");
    }

    // Constructor 2: Parcial
    public CanicaDeAguita(boolean tieneDestello) {
        super();
        this.tieneDestello = tieneDestello;
        this.esTransparente = true;
        System.out.println("CanicaDeAguita: Constructor parcial.");
    }

    // Constructor 3: Completo
    public CanicaDeAguita(boolean seguro, boolean divertido, boolean emocionante, String material, String forma, String textura, boolean tieneDestello, boolean esTransparente) {
        super(seguro, divertido, emocionante, material, forma, textura);
        this.tieneDestello = tieneDestello;
        this.esTransparente = esTransparente;
        System.out.println("CanicaDeAguita: Constructor completo.");
    }

    public boolean tieneDestello() {
        return tieneDestello;
    }

    public boolean esTransparente() {
        return esTransparente;
    }

    public void reflejarLuz() {
        if (tieneDestello) {
            System.out.println("La canica de aguita refleja la luz con un destello interior.");
        } else {
            System.out.println("La canica de aguita es transparente pero no tiene destello.");
        }
    }

    @Override
    public String toString() {
        return "CanicaDeAguita [tieneDestello=" + tieneDestello + ", esTransparente=" + esTransparente + ", " + super.toString() + "]";
    }

    // Método de "destructor" personalizado
    @Override
    public void cerrar() {
        System.out.println("CanicaDeAguita: Método cerrar() ejecutado. Recursos de CanicaDeAguita liberados.");
        super.cerrar();
    }
}