/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enchiladasdecacahuate;

/**
 *
 * @author Gerson Morales
 */
public class Preparacion {
    // Atributos
    private Leche leche;
    private CremaAcida crema;
    private Pan pan;
    private ChilePoblano chiles;
    private Cebolla cebolla;
    private Ajo ajo;
    private Cacahuate cacahuate;
    private Aceite aceite;
    private Tortilla tortilla;
    private Pollo pollo;
    private Lechuga lechuga;
    private Queso queso;
    private Rabano rabano;
    private Sarten sarten;

    // Constructor
    public Preparacion(Leche leche, CremaAcida crema, Pan pan, ChilePoblano chiles, Cebolla cebolla,
                       Ajo ajo, Cacahuate cacahuate, Aceite aceite, Tortilla tortilla, Pollo pollo,
                       Lechuga lechuga, Queso queso, Rabano rabano, Sarten sarten) {
        this.leche = leche;
        this.crema = crema;
        this.pan = pan;
        this.chiles = chiles;
        this.cebolla = cebolla;
        this.ajo = ajo;
        this.cacahuate = cacahuate;
        this.aceite = aceite;
        this.tortilla = tortilla;
        this.pollo = pollo;
        this.lechuga = lechuga;
        this.queso = queso;
        this.rabano = rabano;
        
    }

    public void mostrar() {
        System.out.println("Preparando las enchiladas de cacahuate...");
        System.out.println(leche);
        System.out.println(crema);
        System.out.println(pan);
        System.out.println(chiles);
        System.out.println(cebolla);
        System.out.println(ajo);
        System.out.println(cacahuate);
        System.out.println(aceite);
        System.out.println(tortilla);
        System.out.println(pollo);
        System.out.println(lechuga);
        System.out.println(queso);
        System.out.println(rabano);
   
    }
}


    
    

