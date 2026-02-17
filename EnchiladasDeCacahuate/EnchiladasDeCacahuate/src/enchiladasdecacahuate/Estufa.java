/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enchiladasdecacahuate;

/**
 *
 * @author Gerson Morales
 */
import java.util.ArrayList;

public class Estufa {
    private boolean encendida;
    private ArrayList<Parrilla> parrillas;
/*
    public Estufa() {
        this.encendida = false;
        parrillas = new ArrayList<>();
        parrillas.add(new Parrilla("Parrilla 1"));
        parrillas.add(new Parrilla("Parrilla 2"));
        parrillas.add(new Parrilla("Parrilla 3"));
        parrillas.add(new Parrilla("Parrilla 4"));
    }
*/
    public void encender() {
        encendida = true;
        System.out.println("Estufa encendida.");
      /*  for (Parrilla parrilla : parrillas) {
            parrilla.encender();
        }*/
    }

    public void apagar() {
        encendida = false;
        System.out.println("Estufa apagada.");
      /*  for (Parrilla parrilla : parrillas) {
            parrilla.apagar();
        }*/
    }

    public boolean estaEncendida() {
        return encendida;
    }
/*
    public ArrayList<Parrilla> getParrillas() {
        return parrillas;
    }
*/
}
