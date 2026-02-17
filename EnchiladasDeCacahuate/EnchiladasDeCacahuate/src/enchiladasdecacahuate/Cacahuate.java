/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enchiladasdecacahuate;

/**
 *
 * @author Gerson Morales
 */
public class Cacahuate {
 private int gramos;
 
    public Cacahuate(int gramos) { 
        this.gramos = gramos; }
    
    public boolean equals(Object o) { 
        return o instanceof Cacahuate && ((Cacahuate) o).gramos == this.gramos; }
   
    public String toString() {
        return gramos + "g de cacahuate"; }
}
