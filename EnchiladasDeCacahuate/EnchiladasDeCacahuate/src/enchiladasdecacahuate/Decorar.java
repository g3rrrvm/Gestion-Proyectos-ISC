/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enchiladasdecacahuate;

/**
 *
 * @author Gerson Morales
 */
    public class Decorar {

    public void decorarPlatillo(String platillo, String decoracion) {
        System.out.println("Se ha decorado el " + platillo + " con " + decoracion + ".");
    }

    public void decorarPlatillo(String platillo, String[] decoraciones) {
        System.out.print("Se ha decorado el " + platillo + " con: ");
        for (int i = 0; i < decoraciones.length; i++) {
            System.out.print(decoraciones[i]);
            if (i < decoraciones.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(".");
    }
}
    

