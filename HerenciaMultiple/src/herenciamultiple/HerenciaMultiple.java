/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciamultiple;

/**
 *
 * @author Gerson Morales
 */
public class HerenciaMultiple {
    public static void main(String[] args) {
        System.out.println("===== TROMPO MIXTO (SIMULADO) =====");
        // Para simular TrompoMixto, necesitaríamos una clase nueva o combinar su lógica aquí.
        // Como no está definida, no la puedo instanciar directamente.
        // Sin embargo, podemos crear instancias de los tipos de trompo que lo componen.
        System.out.println("\nCreando un TrompoDeMadera:");
        TrompoDeMadera tmMadera = new TrompoDeMadera();
        tmMadera.enrollarCuerda();
        tmMadera.lanzarConFuerza();
        tmMadera.verificarEquilibrio();
        System.out.println(tmMadera);
        System.out.println("\nCreando un TrompoDePlastico:");
        TrompoDePlastico tmPlastico = new TrompoDePlastico("verde", false);
        tmPlastico.enrollarCuerda();
        tmPlastico.lanzarConFuerza();
        System.out.println(tmPlastico);

        System.out.println("\n===== CANICA TREVOL =====");
        CanicaTrevol trevol = new CanicaTrevol();
        trevol.rebotar(); // Método de Canica
        trevol.brillar(); // Método de CanicaColoreada
        trevol.reflejarLuz(); // Método de CanicaTrevol que delega a CanicaDeAguita
        System.out.println("¿Es como aguita? " + trevol.esAguita());
        System.out.println("¿Es coloreada? " + trevol.esColoreada());
        System.out.println("Tipo detectado: " + trevol.tipoCanica());
        System.out.println(trevol);

        System.out.println("\n===== HOMBRE VERDE =====");
        HombreVerde hv = new HombreVerde(); // Ahora este constructor debería funcionar
        hv.pelear(); // Combina atacar (acción) y hacerLlave (lucha)
        System.out.println("Tipo de muñeco detectado: " + hv.tipoDeMuneco());
        hv.mostrarDatos();
        System.out.println(hv);

        // Ejemplo de otro HombreVerde con constructor parcial
        System.out.println("\n===== OTRO HOMBRE VERDE (Parcial) =====");
        HombreVerde hv2 = new HombreVerde("Robert Bruce Banner Jr.", "Exposición secundaria a Rayos Gamma");
        hv2.pelear();
        System.out.println("Tipo de muñeco detectado: " + hv2.tipoDeMuneco());
        System.out.println(hv2);


        // Para demostrar finalize, forzamos la recolección de basura (no garantizado)
        System.out.println("\n===== Intentando forzar recolección de basura para ver finalizadores =====");
        trevol = null;
        hv = null;
        hv2 = null;
        tmMadera = null;
        tmPlastico = null;

        // Se invoca el garbage collector (no hay garantía de cuándo se ejecutará finalize)
        System.gc();
        try {
            Thread.sleep(100); // Espera un momento para que finalize se ejecute
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nFin del programa.");
    }
}