/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enchiladasdecacahuate;

/**
 *
 * @author Gerson Morales
 */
public class Plato {
    
    private String contenido;

    public void colocar(String elemento) {
        this.contenido = elemento;
        System.out.println("Se colocó " + elemento + " en el plato.");
    }

    @Override
    public String toString() {
        return "Plato con: " + (contenido != null ? contenido : "nada");
    }
}
