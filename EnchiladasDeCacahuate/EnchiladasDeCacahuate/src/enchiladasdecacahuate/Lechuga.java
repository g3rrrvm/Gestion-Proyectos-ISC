/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enchiladasdecacahuate;

/**
 *
 * @author Gerson Morales
 */
public class Lechuga {
   private String tipo;
   
    public Lechuga(String tipo) { 
        this.tipo = tipo; }
    
    public boolean equals(Object o) { 
        return o instanceof Lechuga && ((Lechuga) o).tipo.equals(this.tipo); }
   
    public String toString() { return "Lechuga tipo: " + tipo; }
}
