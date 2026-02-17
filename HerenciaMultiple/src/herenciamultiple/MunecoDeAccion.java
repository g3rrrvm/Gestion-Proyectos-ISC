/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciamultiple;

/**
 *
 * @author Gerson Morales
 */

public class MunecoDeAccion extends Muneco {
    protected boolean articulacionesMovibles;
    protected boolean tieneArmas;
    protected String personaje;
    protected String accesorio;
    protected String colorPrincipal;
    protected String poderEspecial;
    protected int fuerza;
    protected int resistencia;

    // Constructor 1: Por defecto
    public MunecoDeAccion() {
        super("plástico resistente", "grande", "superhéroe");
        this.articulacionesMovibles = true;
        this.tieneArmas = true;
        this.personaje = "Héroe";
        this.accesorio = "Espada de luz";
        this.colorPrincipal = "Rojo";
        this.poderEspecial = "Ninguno";
        this.fuerza = 50;
        this.resistencia = 50;
        System.out.println("MunecoDeAccion: Constructor por defecto. Muñeco de acción por defecto creado.");
    }

    // Constructor 2: Parcial
    public MunecoDeAccion(String personaje, String accesorio) {
        super("plástico resistente", "grande", personaje);
        this.articulacionesMovibles = true;
        this.tieneArmas = true;
        this.personaje = personaje;
        this.accesorio = accesorio;
        this.colorPrincipal = "Azul";
        this.poderEspecial = "Ninguno";
        this.fuerza = 60;
        this.resistencia = 60;
        System.out.println("MunecoDeAccion: Constructor parcial. Muñeco de acción con personaje y accesorio creado.");
    }

    // Constructor 3: Completo
    public MunecoDeAccion(String material, String tamano, String diseno, String personaje, String accesorio, String colorPrincipal, String poderEspecial, int fuerza, int resistencia) {
        super(true, true, true, material, tamano, diseno);
        this.articulacionesMovibles = true;
        this.tieneArmas = true;
        this.personaje = personaje;
        this.accesorio = accesorio;
        this.colorPrincipal = colorPrincipal;
        this.poderEspecial = poderEspecial;
        this.fuerza = fuerza;
        this.resistencia = resistencia;
        System.out.println("MunecoDeAccion: Constructor completo. Muñeco de acción personalizado creado: " + personaje);
    }

    public void atacar() {
        System.out.println(personaje + " ataca con su " + accesorio);
    }

    public void moverBrazo() {
        if (articulacionesMovibles) {
            System.out.println("El brazo del muñeco se mueve fácilmente.");
        } else {
            System.out.println("El muñeco no tiene articulaciones móviles.");
        }
    }

    public String getPersonaje() { return personaje; }
    public String getAccesorio() { return accesorio; }
    public String getColorPrincipal() { return colorPrincipal; }
    public String getPoderEspecial() { return poderEspecial; }
    public int getFuerza() { return fuerza; }
    public int getResistencia() { return resistencia; }
    public boolean tieneArmas() { return tieneArmas; }
    public boolean tieneArticulacionesMovibles() { return articulacionesMovibles; }

    @Override
    public String toString() {
        return "MunecoDeAccion [personaje=" + personaje + ", accesorio=" + accesorio +
               ", articulacionesMovibles=" + articulacionesMovibles + ", tieneArmas=" + tieneArmas +
               ", color=" + colorPrincipal + ", poderEspecial=" + poderEspecial +
               ", fuerza=" + fuerza + ", resistencia=" + resistencia + ", " + super.toString() + "]";
    }

    // Método de "destructor" personalizado
    @Override
    public void cerrar() {
        System.out.println("MunecoDeAccion: Método cerrar() ejecutado. Recursos de Muñeco de Acción liberados.");
        super.cerrar();
    }
}