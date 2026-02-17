/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciamultiple;

/**
 *
 * @author Gerson Morales
 */
public class HombreVerde extends MunecoDeAccion {
    private MunecoDeLucha lucha;
    private String nombreReal;
    private String origen;

    // Constructor 1: Por defecto
    public HombreVerde() {
        super("Gama", "gigante", "superhéroe", "Hulk", "Puños gigantes", "Verde", "Fuerza sobrehumana", 100, 90);
        this.lucha = new MunecoDeLucha(false, true, false, false);
        this.nombreReal = "Bruce Banner";
        this.origen = "Accidente de Rayos Gamma";
        System.out.println("HombreVerde: Constructor por defecto. Hombre Verde creado (por defecto).");
    }

    // Constructor 2: Parcial
    public HombreVerde(String nombreReal, String origen) {
        super("Gama", "gigante", "superhéroe", "Hulk", "Puños gigantes", "Verde", "Fuerza sobrehumana", 100, 90);
        this.lucha = new MunecoDeLucha(false, true);
        this.nombreReal = nombreReal;
        this.origen = origen;
        System.out.println("HombreVerde: Constructor parcial. Hombre Verde creado con datos personales.");
    }

    // Constructor 3: Completo
    public HombreVerde(MunecoDeAccion accionBase, MunecoDeLucha luchaComponent, String nombreReal, String origen) {
        super(accionBase.material, accionBase.tamano, accionBase.diseno,
              accionBase.getPersonaje(), accionBase.getAccesorio(), accionBase.getColorPrincipal(),
              accionBase.getPoderEspecial(), accionBase.getFuerza(), accionBase.getResistencia());
        this.lucha = luchaComponent;
        this.nombreReal = nombreReal;
        this.origen = origen;
        System.out.println("HombreVerde: Constructor completo. Hombre Verde completamente personalizado creado.");
    }

    public String tipoDeMuneco() {
        boolean esAccionPoderoso = this.getFuerza() >= 90 && "Verde".equalsIgnoreCase(this.getColorPrincipal()) &&
                                   this.getPoderEspecial() != null && this.getPoderEspecial().toLowerCase().contains("fuerza");

        boolean esLuchadorAgresivo = (lucha != null && lucha.representaLuchador() && !lucha.tieneMascara());

        if (esAccionPoderoso && esLuchadorAgresivo) {
            return "Hulk (Muñeco de Acción y Lucha Poderosa)";
        } else if (esAccionPoderoso) {
            return "Muñeco de Acción (tipo Hulk)";
        } else if (esLuchadorAgresivo) {
            return "Muñeco de Lucha (estilo Hulk)";
        } else {
            return "Hombre Verde Genérico (Muñeco)";
        }
    }

    public void pelear() {
        System.out.println("El Hombre Verde se prepara para la pelea.");
        atacar();
        if (lucha != null) {
            lucha.hacerLlave();
        }
        System.out.println("El Hombre Verde lucha con una combinación brutal de fuerza y técnica.");
    }

    public void mostrarDatos() {
        System.out.println("Nombre real: " + nombreReal);
        System.out.println("Origen: " + origen);
    }

    @Override
    public String toString() {
        return "HombreVerde [\n" +
               "  nombreReal='" + nombreReal + "',\n" +
               "  origen='" + origen + "',\n" +
               "  tipoDetectado='" + tipoDeMuneco() + "',\n" +
               "  acción=" + super.toString() + ",\n" +
               "  lucha=" + (lucha != null ? lucha.toString() : "null") + "\n" +
               "]";
    }

    // Método de "destructor" personalizado
    @Override
    public void cerrar() {
        System.out.println("HombreVerde: Método cerrar() ejecutado. Recursos de Hombre Verde liberados.");
        if (lucha != null) {
            lucha.cerrar(); // Llama a cerrar en el objeto compuesto
        }
        super.cerrar();
    }
}