/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enchiladasdecacahuate;

/**
 *
 * @author Gerson Morales
 */

public class Rabano {
     private int cantidad;
     
    public Rabano(int cantidad) { 
        this.cantidad = cantidad; }
    
    public boolean equals(Object o) { 
        return o instanceof Rabano && ((Rabano) o).cantidad == this.cantidad; }
    
    public String toString() { 
        return cantidad + " rábanos"; }
}