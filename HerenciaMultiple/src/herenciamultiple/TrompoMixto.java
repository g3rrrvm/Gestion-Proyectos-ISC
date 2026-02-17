/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciamultiple;

/**
 *
 * @author Gerson Morales
 */

public class TrompoMixto extends Trompo {
    private String material;
    private boolean esPulido;
    private boolean tieneAro;
    private String color;
    private boolean equilibrado;

    public TrompoMixto() {
        super();
        this.material = "madera y plastico";
        this.esPulido = true;
        this.tieneAro = true;
        this.color = "rojo con detalles negros";
        this.equilibrado = true;
        System.out.println("Trompo mixto creado (madera + plastico).");
    }

    public void verificarEquilibrio() {
        if (equilibrado) {
            System.out.println("El trompo está bien equilibrado para girar con precisión.");
        } else {
            System.out.println("El trompo está desequilibrado, puede caerse fácilmente.");
        }
    }

    public void brillar() {
        if (esPulido) {
            System.out.println("El trompo mixto brilla por su superficie pulida.");
        } else {
            System.out.println("El trompo tiene una textura opaca.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", material=" + material + ", pulido=" + esPulido + ", color=" + color + ", aro=" + tieneAro + ", equilibrado=" + equilibrado;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("TrompoMixto destruido.");
    }
}
