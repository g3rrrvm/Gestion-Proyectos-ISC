/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciamultiple;

/**
 *
 * @author Gerson Morales
 */
public class CanicaTrevol extends CanicaColoreada {
    private boolean tienePinceladasDeColor;
    private boolean tieneBrilloInterior;
    private String descripcionDiseño;
    private CanicaDeAguita caracteristicasAguita;

    // Constructor 1: Por defecto
    public CanicaTrevol() {
        super();
        this.tienePinceladasDeColor = true;
        this.tieneBrilloInterior = true;
        this.descripcionDiseño = "transparente con pinceladas de varios colores";
        this.caracteristicasAguita = new CanicaDeAguita(true);
        System.out.println("CanicaTrevol: Constructor por defecto. Soy una canica trébol con diseño único.");
    }

    // Constructor 2: Parcial
    public CanicaTrevol(String tipoColor, String descripcionDiseño) {
        super(tipoColor);
        this.tienePinceladasDeColor = true;
        this.tieneBrilloInterior = true;
        this.descripcionDiseño = descripcionDiseño;
        this.caracteristicasAguita = new CanicaDeAguita(true);
        System.out.println("CanicaTrevol: Constructor parcial.");
    }

    // Constructor 3: Completo
    public CanicaTrevol(boolean seguro, boolean divertido, boolean emocionante, String material, String forma, String textura, String tipoColor, boolean tieneDiseñoInterno, boolean tienePinceladasDeColor, boolean tieneBrilloInterior, String descripcionDiseño, boolean tieneDestelloAguita, boolean esTransparenteAguita) {
        super(seguro, divertido, emocionante, material, forma, textura, tipoColor, tieneDiseñoInterno);
        this.tienePinceladasDeColor = tienePinceladasDeColor;
        this.tieneBrilloInterior = tieneBrilloInterior;
        this.descripcionDiseño = descripcionDiseño;
        this.caracteristicasAguita = new CanicaDeAguita(seguro, divertido, emocionante, material, forma, textura, tieneDestelloAguita, esTransparenteAguita);
        System.out.println("CanicaTrevol: Constructor completo.");
    }

    public boolean esAguita() {
        return this.caracteristicasAguita.esTransparente() && this.caracteristicasAguita.tieneDestello();
    }

    public boolean esColoreada() {
        return this.tienePinceladasDeColor || super.tieneDiseñoInterno();
    }

    public String tipoCanica() {
        if (esColoreada() && esAguita()) {
            return "Coloreada y con características de Aguita (Trevol)";
        } else if (esColoreada()) {
            return "Coloreada (principalmente)";
        } else if (esAguita()) {
            return "Con características de Aguita";
        } else {
            return "Canica Trevol Genérica";
        }
    }

    public void reflejarLuz() {
        if (tieneBrilloInterior) {
            System.out.println("La canica trébol refleja la luz de forma brillante por su brillo interior.");
        }
        if (caracteristicasAguita != null && caracteristicasAguita.tieneDestello()) {
            caracteristicasAguita.reflejarLuz();
        }
    }

    @Override
    public String toString() {
        return "CanicaTrevol [\n" +
               "  tipo=" + tipoCanica() + ",\n" +
               "  pinceladasDeColor=" + tienePinceladasDeColor + ",\n" +
               "  brilloInterior=" + tieneBrilloInterior + ",\n" +
               "  diseño='" + descripcionDiseño + "',\n" +
               "  caracteristicasAguita=" + (caracteristicasAguita != null ? caracteristicasAguita.toString() : "null") + ",\n" +
               "  " + super.toString() + "\n]";
    }

    // Método de "destructor" personalizado
    @Override
    public void cerrar() {
        System.out.println("CanicaTrevol: Método cerrar() ejecutado. Recursos de CanicaTrevol liberados.");
        if (caracteristicasAguita != null) {
            caracteristicasAguita.cerrar(); // Llama a cerrar en el objeto compuesto
        }
        super.cerrar();
    }
}