/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciamultiple;

/**
 *
 * @author Gerson Morales
 */


public class Trompo extends Juguete {
    protected boolean usaCuerda;
    protected String forma;
    protected String punta;
    protected boolean estaGirando;
    protected boolean cuerdaEnrollada;

    // Constructor 1: Por defecto
    public Trompo() {
        super(true, true, true);
        this.usaCuerda = true;
        this.forma = "cono";
        this.punta = "metal";
        this.estaGirando = false;
        this.cuerdaEnrollada = false;
        System.out.println("Trompo: Constructor por defecto. Soy un trompo.");
    }

    // Constructor 2: Parcial
    public Trompo(String forma, String punta) {
        super(true, true, true);
        this.usaCuerda = true;
        this.forma = forma;
        this.punta = punta;
        this.estaGirando = false;
        this.cuerdaEnrollada = false;
        System.out.println("Trompo: Constructor parcial.");
    }

    // Constructor 3: Completo
    public Trompo(boolean seguro, boolean divertido, boolean emocionante, boolean usaCuerda, String forma, String punta) {
        super(seguro, divertido, emocionante);
        this.usaCuerda = usaCuerda;
        this.forma = forma;
        this.punta = punta;
        this.estaGirando = false;
        this.cuerdaEnrollada = false;
        System.out.println("Trompo: Constructor completo.");
    }

    public void enrollarCuerda() {
        if (usaCuerda) {
            cuerdaEnrollada = true;
            System.out.println("La cuerda ha sido enrollada al trompo.");
        } else {
            System.out.println("Este trompo no usa cuerda.");
        }
    }

    public void lanzarConFuerza() {
        if (cuerdaEnrollada) {
            System.out.println("¡El trompo ha sido lanzado con fuerza!");
            girarRapidamente();
        } else {
            System.out.println("No se puede lanzar sin enrollar la cuerda.");
        }
    }

    public void girarRapidamente() {
        estaGirando = true;
        System.out.println("El trompo gira rápidamente sobre su punta.");
    }

    public void verificarEquilibrio() {
        if (estaGirando) {
            System.out.println("El trompo está bien equilibrado y girando firmemente.");
        } else {
            System.out.println("El trompo no está girando para verificar el equilibrio.");
        }
    }

    public void detener() {
        estaGirando = false;
        cuerdaEnrollada = false;
        System.out.println("El trompo se ha detenido.");
    }

    @Override
    public String toString() {
        return "Trompo [forma=" + forma + ", punta=" + punta + ", usaCuerda=" + usaCuerda +
               ", estaGirando=" + estaGirando + ", cuerdaEnrollada=" + cuerdaEnrollada + ", " + super.toString() + "]";
    }

    // Método de "destructor" personalizado
    @Override
    public void cerrar() {
        System.out.println("Trompo: Método cerrar() ejecutado. Recursos de Trompo liberados.");
        super.cerrar();
    }
}