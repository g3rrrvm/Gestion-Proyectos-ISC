/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciasimple;

/**
 *
 * @author Gerson Morales
 */
public class Canica extends Juguete {
    protected String material;
    protected String forma;
    protected String textura;

    public Canica() {
        super(true, true, false);
        this.material = "vidrio";
        this.forma = "esferica";
        this.textura = "lisa";
        System.out.println("Soy una canica.");
    }

    public void rebotar() {
        System.out.println("La canica rebota.");
    }

    public boolean desarrollaCoordinacion() {
        return true;
    }

    @Override
    public String toString() {
        return "Canica [material=" + material + ", forma=" + forma + ", textura=" + textura + "]";
    }
}