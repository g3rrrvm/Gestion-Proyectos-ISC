/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciasimple;

/**
 *
 * @author Gerson Morales
 */

public class HerenciaSimple {
    public static void main(String[] args) {
        System.out.println("=== Trompo de plastico ===");
        TrompoDePlastico trompo1 = new TrompoDePlastico();
        trompo1.jugar();
        trompo1.girar();
        trompo1.lanzar();
        System.out.println(trompo1);

        System.out.println("\n=== Trompo de madera ===");
        TrompoDeMadera trompo2 = new TrompoDeMadera();
        trompo2.jugar();
        trompo2.girar();
        trompo2.lanzar();
        System.out.println(trompo2);

        System.out.println("\n=== Canica Trebol ===");
        CanicaTrevol canica1 = new CanicaTrevol();
        canica1.jugar();
        canica1.rebotar();
        System.out.println("¿Desarrolla coordinacion?: " + canica1.desarrollaCoordinacion());
        System.out.println(canica1);

        System.out.println("\n=== Canica de Aguita ===");
        CanicaDeAguita canica2 = new CanicaDeAguita();
        canica2.jugar();
        canica2.rebotar();
        System.out.println(canica2);

        System.out.println("\n=== Muñeco de Accion ===");
        MunecoDeAccion muneco1 = new MunecoDeAccion();
        muneco1.jugar();
        muneco1.manipular();
        System.out.println("¿Estimula imaginacion?: " + muneco1.estimulaImaginacion());
        System.out.println(muneco1);

        System.out.println("\n=== Muñeco de Lucha ===");
        MunecoDeLucha muneco2 = new MunecoDeLucha();
        muneco2.jugar();
        System.out.println("¿Estimula imaginacion?: " + muneco2.estimulaImaginacion());
        System.out.println(muneco2);

        // Comparaciones con equals
        System.out.println("\n=== Comparaciones ===");
        System.out.println("¿Trompos son iguales? " + trompo1.equals(trompo2));
        System.out.println("¿Canicas son iguales? " + canica1.equals(canica2));
    }
}