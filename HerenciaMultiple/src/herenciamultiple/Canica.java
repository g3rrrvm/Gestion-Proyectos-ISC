/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciamultiple;

/**
 *
 * @author Gerson Morales
 */
public class Canica extends Juguete {
    protected String material;
    protected String forma;
    protected String textura;

    // Constructor 1: Por defecto
    public Canica() {
        super(true, true, false);
        this.material = "vidrio";
        this.forma = "esferica";
        this.textura = "lisa";
        System.out.println("Canica: Constructor por defecto. Soy una canica.");
    }

    // Constructor 2: Parcial
    public Canica(String material, String forma) {
        super(true, true, false);
        this.material = material;
        this.forma = forma;
        this.textura = "lisa";
        System.out.println("Canica: Constructor parcial.");
    }

    // Constructor 3: Completo
    public Canica(boolean seguro, boolean divertido, boolean emocionante, String material, String forma, String textura) {
        super(seguro, divertido, emocionante);
        this.material = material;
        this.forma = forma;
        this.textura = textura;
        System.out.println("Canica: Constructor completo.");
    }

    public void rebotar() {
        System.out.println("La canica rebota.");
    }

    public boolean desarrollaCoordinacion() {
        return true;
    }

    @Override
    public String toString() {
        return "Canica [material=" + material + ", forma=" + forma + ", textura=" + textura + ", " + super.toString() + "]";
    }

    // Método de "destructor" personalizado
    @Override
    public void cerrar() {
        System.out.println("Canica: Método cerrar() ejecutado. Recursos de Canica liberados.");
        super.cerrar(); // Llama al método cerrar de la superclase
    }
}