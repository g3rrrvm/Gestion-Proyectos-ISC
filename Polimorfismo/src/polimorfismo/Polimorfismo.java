/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author Gerson Morales
 */


public class Polimorfismo {
    public static void main(String[] args) {
        // Instancias originales
        GuitarraAcustica ga = new GuitarraAcustica();
        Arpa arpa = new Arpa();
        Violin violin = new Violin();
        Flauta flauta = new Flauta();
        Saxofon sax = new Saxofon();
        Trompeta trompeta = new Trompeta();
        Timbal timbal = new Timbal();
        Bateria bateria = new Bateria();
        Bombo bombo = new Bombo();
        GuitarraElectrica ge = new GuitarraElectrica();
        Bajo bajo = new Bajo();
        Sintetizador sint = new Sintetizador();
        Piano piano = new Piano();

        // Upcasting
        Instrumento[] orquesta = {
            ga, arpa, violin, flauta, sax, trompeta, timbal,
            bateria, bombo, ge, bajo, sint, piano
        };

        System.out.println("AFINAR Y TOCAR INSTUMENTOS");
        for (Instrumento instrumento : orquesta) {
            if (instrumento instanceof Piano) {
                ((Piano) instrumento).mostrarTipo();
            }
            instrumento.afinar();
            instrumento.tocar(NotaMusical.Mi);
            System.out.println("Instrumento: " + instrumento);
            System.out.println("----------------------------");
        }

        System.out.println("\nPROCESO DE DOWNCASTING\n");
        for (Instrumento instrumento : orquesta) {
            if (instrumento instanceof GuitarraAcustica) {
                GuitarraAcustica g = (GuitarraAcustica) instrumento;
                System.out.println("Downcasting a GuitarraAcustica");
                g.afinar();
                g.tocar(NotaMusical.Sol);
            } else if (instrumento instanceof Arpa) {
                Arpa a = (Arpa) instrumento;
                System.out.println("Downcasting a Arpa");
                a.afinar();
                a.tocar(NotaMusical.Fa);
            } else if (instrumento instanceof Violin) {
                Violin v = (Violin) instrumento;
                System.out.println("Downcasting a Violin");
                v.afinar();
                v.tocar(NotaMusical.Re);
            } else if (instrumento instanceof Flauta) {
                Flauta f = (Flauta) instrumento;
                System.out.println("Downcasting a Flauta");
                f.afinar();
                f.tocar(NotaMusical.Do);
            } else if (instrumento instanceof Saxofon) {
                Saxofon s = (Saxofon) instrumento;
                System.out.println("Downcasting a Saxofon");
                s.afinar();
                s.tocar(NotaMusical.La);
            } else if (instrumento instanceof Trompeta) {
                Trompeta t = (Trompeta) instrumento;
                System.out.println("Downcasting a Trompeta");
                t.afinar();
                t.tocar(NotaMusical.Si);
            } else if (instrumento instanceof Timbal) {
                Timbal t = (Timbal) instrumento;
                System.out.println("Downcasting a Timbal");
                t.afinar();
                t.tocar(NotaMusical.Mi);
            } else if (instrumento instanceof Bateria) {
                Bateria b = (Bateria) instrumento;
                System.out.println("Downcasting a Bateria");
                b.afinar();
                b.tocar(NotaMusical.Fa);
            } else if (instrumento instanceof Bombo) {
                Bombo b = (Bombo) instrumento;
                System.out.println("Downcasting a Bombo");
                b.afinar();
                b.tocar(NotaMusical.Do);
            } else if (instrumento instanceof GuitarraElectrica) {
                GuitarraElectrica ge2 = (GuitarraElectrica) instrumento;
                System.out.println("Downcasting a GuitarraElectrica");
                ge2.afinar();
                ge2.tocar(NotaMusical.Re);
            } else if (instrumento instanceof Bajo) {
                Bajo b = (Bajo) instrumento;
                System.out.println("Downcasting a Bajo");
                b.afinar();
                b.tocar(NotaMusical.Sol);
            } else if (instrumento instanceof Sintetizador) {
                Sintetizador s = (Sintetizador) instrumento;
                System.out.println("Downcasting a Sintetizador");
                s.afinar();
                s.tocar(NotaMusical.La);
            } else if (instrumento instanceof Piano) {
                Piano p = (Piano) instrumento;
                System.out.println("Downcasting a Piano");
                p.afinar();
                p.tocar(NotaMusical.Si);
            }
            System.out.println("----------------------------");
        }
    }
}