/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enchiladasdecacahuate;

/**
 *
 * @author Gerson Morales
 */
public class Leche {
     private int cantidad;
     
    public Leche(int cantidad) { this.cantidad = cantidad; }
    
    public boolean equals(Object o) { 
        return o instanceof Leche && ((Leche) o).cantidad == this.cantidad; }
   
    public String toString() { 
        return "Leche: " + cantidad + " taza(s)"; }
}
