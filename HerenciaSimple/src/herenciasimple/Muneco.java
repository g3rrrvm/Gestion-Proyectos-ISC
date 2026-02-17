/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciasimple;

/**
 *
 * @author Gerson Morales
 */
public class Muneco extends Juguete {
    protected String material;
    protected String tamano;
    protected String diseno;

    public Muneco() {
        super();
        this.material = "plástico";
        this.tamano = "mediano";
        this.diseno = "genérico";
        System.out.println("Soy un muñeco.");
    }

    public Muneco(String material, String tamaño, String diseño) {
        super(true, true, false);
        this.material = material;
        this.tamano = tamano;
        this.diseno = diseno;
    }

    public boolean estimulaImaginacion() {
        return true;
    }

    @Override
    public String toString() {
        return "Muneco [material=" + material + ", tamano=" + tamano + ", diseno=" + diseno + ", seguro=" + seguro + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Muneco)) return false;
        Muneco otro = (Muneco) obj;
        return this.material.equals(otro.material) && this.tamano.equals(otro.tamano);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Muneco destruido.");
    }
}