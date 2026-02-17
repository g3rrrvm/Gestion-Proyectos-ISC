/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciamultiple;

/**
 *
 * @author Gerson Morales
 */
public class Muneco extends Juguete {
    protected String material;
    protected String tamano;
    protected String diseno;

    // Constructor 1: Por defecto
    public Muneco() {
        super();
        this.material = "plástico";
        this.tamano = "mediano";
        this.diseno = "genérico";
        System.out.println("Muneco: Constructor por defecto. Soy un muñeco.");
    }

    // Constructor 2: Parcial (material, tamaño)
    public Muneco(String material, String tamano) {
        super(true, true, false);
        this.material = material;
        this.tamano = tamano;
        this.diseno = "genérico";
        System.out.println("Muneco: Constructor parcial (material, tamaño).");
    }

    // Constructor 3: Añadido para aceptar material, tamaño, diseño directamente
    public Muneco(String material, String tamano, String diseno) {
        super(true, true, false);
        this.material = material;
        this.tamano = tamano;
        this.diseno = diseno;
        System.out.println("Muneco: Constructor parcial (material, tamaño, diseño).");
    }

    // Constructor 4: Completo (incluye propiedades de Juguete)
    public Muneco(boolean seguro, boolean divertido, boolean emocionante, String material, String tamano, String diseno) {
        super(seguro, divertido, emocionante);
        this.material = material;
        this.tamano = tamano;
        this.diseno = diseno;
        System.out.println("Muneco: Constructor completo.");
    }

    public boolean estimulaImaginacion() {
        return true;
    }

    @Override
    public String toString() {
        return "Muneco [material=" + material + ", tamano=" + tamano + ", diseno=" + diseno + ", " + super.toString() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Muneco)) return false;
        Muneco otro = (Muneco) obj;
        return super.equals(obj) &&
               this.material.equals(otro.material) &&
               this.tamano.equals(otro.tamano) &&
               this.diseno.equals(otro.diseno);
    }

    // Método de "destructor" personalizado
    @Override
    public void cerrar() {
        System.out.println("Muneco: Método cerrar() ejecutado. Recursos de Muneco liberados.");
        super.cerrar();
    }
}