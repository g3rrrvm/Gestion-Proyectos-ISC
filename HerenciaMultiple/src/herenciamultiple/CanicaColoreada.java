/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciamultiple;

/**
 *
 * @author Gerson Morales
 */
public class CanicaColoreada extends Canica {
    private String tipoColor;
    private boolean tieneDiseñoInterno;

    // Constructor 1: Por defecto
    public CanicaColoreada() {
        super();
        this.tipoColor = "transparente con pinceladas";
        this.tieneDiseñoInterno = true;
        System.out.println("CanicaColoreada: Constructor por defecto. Soy una canica coloreada.");
    }

    // Constructor 2: Parcial
    public CanicaColoreada(String tipoColor) {
        super();
        this.tipoColor = tipoColor;
        this.tieneDiseñoInterno = true;
        System.out.println("CanicaColoreada: Constructor parcial.");
    }

    // Constructor 3: Completo
    public CanicaColoreada(boolean seguro, boolean divertido, boolean emocionante, String material, String forma, String textura, String tipoColor, boolean tieneDiseñoInterno) {
        super(seguro, divertido, emocionante, material, forma, textura);
        this.tipoColor = tipoColor;
        this.tieneDiseñoInterno = tieneDiseñoInterno;
        System.out.println("CanicaColoreada: Constructor completo.");
    }

    public String getTipoColor() {
        return tipoColor;
    }

    public void brillar() {
        System.out.println("La canica coloreada emite un brillo por sus colores.");
    }

    public boolean tieneDiseñoInterno() {
        return tieneDiseñoInterno;
    }

    @Override
    public String toString() {
        return "CanicaColoreada [tipoColor=" + tipoColor + ", tieneDiseñoInterno=" + tieneDiseñoInterno + ", " + super.toString() + "]";
    }

    // Método de "destructor" personalizado
    @Override
    public void cerrar() {
        System.out.println("CanicaColoreada: Método cerrar() ejecutado. Recursos de CanicaColoreada liberados.");
        super.cerrar(); // Llama al método cerrar de la superclase
    }
}