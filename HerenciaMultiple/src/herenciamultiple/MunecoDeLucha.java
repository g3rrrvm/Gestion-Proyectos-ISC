/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciamultiple;

/**
 *
 * @author Gerson Morales
 */

public class MunecoDeLucha extends Muneco {
    private boolean tieneMascara;
    private boolean representaLuchador;
    private boolean tieneAccesorios;
    private boolean articulacionesMovibles;

    // Constructor 1: Por defecto
    public MunecoDeLucha() {
        super("goma", "grande", "luchador");
        this.tieneMascara = true;
        this.representaLuchador = true;
        this.tieneAccesorios = true;
        this.articulacionesMovibles = false;
        System.out.println("MunecoDeLucha: Constructor por defecto. Muñeco de lucha creado (por defecto).");
    }

    // Constructor 2: Parcial
    public MunecoDeLucha(boolean tieneMascara, boolean representaLuchador) {
        super("goma", "grande", (representaLuchador ? "luchador profesional" : "luchador amateur"));
        this.tieneMascara = tieneMascara;
        this.representaLuchador = representaLuchador;
        this.tieneAccesorios = true;
        this.articulacionesMovibles = false;
        System.out.println("MunecoDeLucha: Constructor parcial.");
    }

    // Constructor 3: De 4 booleanos
    public MunecoDeLucha(boolean tieneMascara, boolean representaLuchador, boolean tieneAccesorios, boolean articulacionesMovibles) {
        super("goma", "grande", (representaLuchador ? "luchador" : "no-luchador"));
        this.tieneMascara = tieneMascara;
        this.representaLuchador = representaLuchador;
        this.tieneAccesorios = tieneAccesorios;
        this.articulacionesMovibles = articulacionesMovibles;
        System.out.println("MunecoDeLucha: Constructor de 4 booleanos.");
    }

    // Constructor 4: Completo
    public MunecoDeLucha(String material, String tamano, String diseno, boolean tieneMascara, boolean representaLuchador, boolean tieneAccesorios, boolean articulacionesMovibles) {
        super(true, true, true, material, tamano, diseno);
        this.tieneMascara = tieneMascara;
        this.representaLuchador = representaLuchador;
        this.tieneAccesorios = tieneAccesorios;
        this.articulacionesMovibles = articulacionesMovibles;
        System.out.println("MunecoDeLucha: Constructor completo.");
    }

    public void hacerLlave() {
        System.out.println("El muñeco ejecuta una llave de lucha libre.");
    }

    public boolean tieneMascara() { return tieneMascara; }
    public boolean representaLuchador() { return representaLuchador; }
    public boolean tieneAccesorios() { return tieneAccesorios; }
    public boolean tieneArticulacionesMovibles() { return articulacionesMovibles; }

    @Override
    public String toString() {
        return "MunecoDeLucha [mascara=" + tieneMascara + ", representaLuchador=" + representaLuchador +
               ", accesorios=" + tieneAccesorios + ", articulacionesMovibles=" + articulacionesMovibles + ", " + super.toString() + "]";
    }

    // Método de "destructor" personalizado
    @Override
    public void cerrar() {
        System.out.println("MunecoDeLucha: Método cerrar() ejecutado. Recursos de Muñeco de Lucha liberados.");
        super.cerrar();
    }
}