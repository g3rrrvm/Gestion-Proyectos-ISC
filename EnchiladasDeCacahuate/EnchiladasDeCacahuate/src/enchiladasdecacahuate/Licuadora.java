/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enchiladasdecacahuate;

/**
 *
 * @author Gerson Morales
 */
public class Licuadora {
    private boolean encendida = false;

    public void encender() {
        encendida = true;
        System.out.println("Licuadora encendida.");
    }

    public void apagar() {
        encendida = false;
        System.out.println("Licuadora apagada.");
    }

    public void licuar(String ingredientes) {
        if (encendida) {
            System.out.println("Licuando los siguientes ingredientes: " + ingredientes);
        } else {
            System.out.println("La licuadora está apagada. Enciéndela primero.");
        }
    }
}
