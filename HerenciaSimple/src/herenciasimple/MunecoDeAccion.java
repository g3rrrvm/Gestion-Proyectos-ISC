/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciasimple;

/**
 *
 * @author Gerson Morales
 */
public class MunecoDeAccion extends Muneco {
    private boolean facilDeManipular;
    private boolean tieneArticulaciones;

    public MunecoDeAccion() {
        super("plastico", "pequeno", "superheroe");
        this.facilDeManipular = true;
        this.tieneArticulaciones = true;
        System.out.println("Muneco de accion creado.");
    }

    public void manipular() {
        System.out.println("Manipulando el muneco de accion.");
    }

    @Override
    public String toString() {
        return super.toString() + ", facilDeManipular=" + facilDeManipular + ", articulaciones=" + tieneArticulaciones;
    }
}