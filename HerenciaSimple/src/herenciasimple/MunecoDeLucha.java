/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciasimple;

/**
 *
 * @author Gerson Morales
 */

public class MunecoDeLucha extends Muneco {
    private boolean tieneMascara;
    private boolean representaLuchador;
    private boolean tieneAccesorios;
    private boolean articulacionesMovibles;

    public MunecoDeLucha() {
        super("plastico", "grande", "luchador");
        this.tieneMascara = true;
        this.representaLuchador = true;
        this.tieneAccesorios = true;
        this.articulacionesMovibles = false;
        System.out.println("Muneco de lucha creado.");
    }

    @Override
    public String toString() {
        return super.toString() + ", mascara=" + tieneMascara + ", accesorios=" + tieneAccesorios;
    }
}