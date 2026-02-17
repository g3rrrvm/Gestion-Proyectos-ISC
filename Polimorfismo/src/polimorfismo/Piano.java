/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author Gerson Morales
 */
public class Piano extends Percusion {
    @Override
    public void afinar() {
        System.out.println("El piano no se afina como los instrumentos de cuerda");
    }

    @Override
    public void tocar(NotaMusical nota) {
        System.out.println("Piano tocando " + nota);
    }

    public void mostrarTipo() {
        boolean esCuerda = false;
        Class<?> superClase = this.getClass().getSuperclass();
        while (superClase != null) {
            if (superClase == Cuerda.class) {
                esCuerda = true;
                break;
            }
            superClase = superClase.getSuperclass();
        }

        System.out.println("¿Piano es de cuerda? " + esCuerda);
        System.out.println("¿Piano es de percusion? " + (this instanceof Percusion));
    }
}