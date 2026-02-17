/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enchiladasdecacahuate;

/**
 *
 * @author Gerson Morales
 */
public class Agua {
    private double cantidadLitros;
    
    public Agua(double cantidadLitros){
        this.cantidadLitros = cantidadLitros; 
    }
    public double getCantidadLitros(){
        return cantidadLitros;
    }
    
    @Override
    public String toString(){
        return "Agua: " + cantidadLitros + "litros";
    }
    
}
    

