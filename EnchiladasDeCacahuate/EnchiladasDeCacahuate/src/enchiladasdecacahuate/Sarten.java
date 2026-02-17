/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enchiladasdecacahuate;

/**
 *
 * @author Gerson Morales
 */




public class Sarten {
    private boolean caliente = false;

    public void calentar() {
        caliente = true;
        System.out.println("El sartén está calientandose .");
    }

    public void usar() {
        if (caliente) {
            System.out.println("Usando el sartén caliente.");
        } else {
            System.out.println("El sartén está frío. Caliéntalo primero.");
        }
    }

    public void freir(String ingrediente) {
        if (caliente) {
            System.out.println("Friendo " + ingrediente + " en el sartén...");
        } else {
            System.out.println("No puedes freír " + ingrediente + ". El sartén está frío.");
        }
    }

    public void cocinar(String platillo) {
        if (caliente) {
            System.out.println("Cocinando " + platillo + " en el sartén...");
        } else {
            System.out.println("No puedes cocinar " + platillo + ". El sartén está frío.");
        }
    }
    public void tatemar(String ingrediente) {
    if (caliente) {
        System.out.println("Tatemando " + ingrediente + " en el sartén...");
    } else {
        System.out.println("No puedes tatemar " + ingrediente + ". El sartén está frío.");
    }
}

}
