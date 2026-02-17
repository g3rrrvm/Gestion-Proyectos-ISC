/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enchiladasdecacahuate;

/**
 *
 * @author Gerson Morales
 */
public class Parrilla {
    private String nombre;
    private boolean encendida;
    
    public Parrilla(String nombre){
        this.nombre = nombre;
        this.encendida = false;
    }
    public void encender(){
        encendida = true;
        System.out.println(nombre + "encendida.");       
    }
    public void apagar(){
        encendida = false;
        System.out.println(nombre + " apagada.");
    }
    public boolean estaEncendida(){
        return encendida;
    }
    public String getNombre(){
        return nombre;
    }
}
