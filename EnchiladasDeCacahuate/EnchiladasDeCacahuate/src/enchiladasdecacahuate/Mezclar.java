/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enchiladasdecacahuate;

import java.util.List;

/**
 *
 * @author Gerson Morales
 */


public class Mezclar {
    public void mezclarIngredientes(String[] ingredientes) {
        if (ingredientes.length == 0) {
            System.out.println("No hay ingredientes para mezclar.");
        } else {
            System.out.print("Mezclando ingredientes: ");
            for (int i = 0; i < ingredientes.length; i++) {
                System.out.print(ingredientes[i]);
                if (i < ingredientes.length - 1) System.out.print(", ");
            }
            System.out.println(".");
        }
    }
}


