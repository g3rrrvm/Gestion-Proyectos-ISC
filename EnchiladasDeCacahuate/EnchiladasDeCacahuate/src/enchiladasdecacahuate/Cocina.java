/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enchiladasdecacahuate;

/**
 *
 * @author Gerson Morales
 */
    public class Cocina {
    private Estufa estufa;

    public Cocina(Estufa estufa) {
        this.estufa = estufa;
    }

    public void cocinarConSarten(Sarten sarten, String platillo) {
        if (estufa.estaEncendida()) {
            sarten.calentar();
            sarten.cocinar(platillo);
        } else {
            System.out.println("La estufa está apagada. No se puede cocinar.");
        }
    }

    public void freirConSarten(Sarten sarten, String ingrediente) {
        if (estufa.estaEncendida()) {
            sarten.calentar();
            sarten.freir(ingrediente);
        } else {
            System.out.println("La estufa está apagada. No se puede freír.");
        }
    }

    public void hervirEnOlla(Olla olla, String contenido) {
        if (estufa.estaEncendida()) {
            olla.hervir(contenido);
        } else {
            System.out.println("La estufa está apagada. No se puede hervir.");
        }
    }
}
