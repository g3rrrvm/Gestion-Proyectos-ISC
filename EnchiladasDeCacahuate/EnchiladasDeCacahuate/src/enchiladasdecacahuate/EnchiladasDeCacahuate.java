/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enchiladasdecacahuate;

/**
 *
 * @author Gerson Morales
 */
public class EnchiladasDeCacahuate {
    public static void main(String[] args) throws InterruptedException {
        // Ingredientes principales
        Leche leche = new Leche(1);
        CremaAcida cremaAcida = new CremaAcida(1);
        Pan pan = new Pan("bolillo");
        ChilePoblano chilePoblano = new ChilePoblano(2);
        Cebolla cebollaEntero = new Cebolla();
        Cebolla cebollaEnPolvo = new Cebolla();

        Ajo ajoEntero = new Ajo();       // Se usa entero
        Ajo ajoEnPolvo = new Ajo();      // Se tritura

        Cacahuate cacahuate = new Cacahuate(100);
        Aceite aceite = new Aceite("vegetal");
        Tortilla tortilla = new Tortilla(3);
        Pollo pollo = new Pollo();
        Lechuga lechuga = new Lechuga("romana");
        Rabano rabano = new Rabano(3);
        Queso queso = new Queso("fresco", 1.0);

        // Utensilios
        Licuadora licuadora = new Licuadora();
        Plato plato = new Plato();
        Cuchillo cuchillo = new Cuchillo();
        Cuchara cuchara = new Cuchara();
        Tabla tabla = new Tabla();
        Recipiente recipiente = new Recipiente();

        // Nuevos utensilios
        Olla olla = new Olla();
        Sazonar sazonador = new Sazonar( );
        Sarten sarten = new Sarten();
        Estufa estufa = new Estufa();
        Cocina cocina = new Cocina(estufa);
        Retirar retirar = new Retirar();
        Mezclar mezclador = new Mezclar();
        Vertir vertido = new Vertir();
        Rellenar rellenador = new Rellenar();
        Decorar decorar = new Decorar();
        Agua agua = new Agua(1.5);

        System.out.println("\n--- Ingredientes ---\n");

        //Mostrar ingredientes
        
        System.out.println(leche);
        System.out.println(cremaAcida);
        System.out.println(pan);
        System.out.println(chilePoblano);
        System.out.println(cebollaEnPolvo);
        System.out.println(cebollaEntero);
        System.out.println(ajoEntero);
        System.out.println(ajoEnPolvo);
        System.out.println(cacahuate);
        System.out.println(aceite);
        System.out.println(tortilla);
        System.out.println(pollo);
        System.out.println(lechuga);
        System.out.println(rabano);
        System.out.println(queso);

        Thread.sleep(1000);
 
        // Instrucción para lavar ingredientes
        System.out.println("\nLavar correctamente los ingredientes: cebolla, ajo, chiles, lechuga y rábanos.\n");
        Thread.sleep(2000);

        System.out.println("\n--- Iniciando preparacion ---\n");
        Thread.sleep(500);
        System.out.println("Poner en la olla: ");
        Thread.sleep(1000);
        olla.colocarIngrediente("agua");
          Thread.sleep(500);
        olla.colocarIngrediente("pechuga");
          Thread.sleep(500);
        olla.colocarIngrediente("cebolla");
          Thread.sleep(500);
        olla.colocarIngrediente("ajo entero");
          Thread.sleep(2000);
        System.out.println("\n");
        estufa.encender();
          Thread.sleep(500);
        cocina.hervirEnOlla(olla, "pollo, cebolla y ajo");
        Thread.sleep(2000);
        pollo.cocer();
        Thread.sleep(2000);
        retirar.retirarDe("la olla", "el pollo cocido");
          Thread.sleep(2000);
        pollo.deshebrar();
          Thread.sleep(2000);
          
        if (pollo.estaDeshebrado()) {
           System.out.println("Listo: el pollo está cocido y deshebrado. \n ");
        } else {
           System.out.println("El pollo no esta listo para usarse.");
        }
          Thread.sleep(2000);
        /*sarten.calentar();
          Thread.sleep(2000);*/
        licuadora.encender();
          Thread.sleep(2000);
        licuadora.licuar("ajo " + ", 1/4 de cebolla " );
          Thread.sleep(2000);
        ajoEnPolvo.hacerPolvo();
        cebollaEnPolvo.hacerPolvo();
          Thread.sleep(2000);
        licuadora.apagar();
          Thread.sleep(2000);System.out.println("\n");
        sazonador.aplicarSazonador("pechuga deshebrada");
          Thread.sleep(2000);
        cocina.cocinarConSarten(sarten,"pollo sazonado");
          Thread.sleep(2000);  
        sarten.freir(cacahuate.toString());
        sarten.tatemar(chilePoblano.toString());
          Thread.sleep(2000);
        System.out.println(" ¡Listo! ");
          Thread.sleep(2000);
        retirar.retirarDe("el sarten", "el pollo sazonado");
          Thread.sleep(500);
        retirar.retirarDe("el sarten", "cacahuates");
          Thread.sleep(500);
        retirar.retirarDe("el sarten \n", "chiles poblanos");
          Thread.sleep(2000);
          
        // Preparación de la salsa
        String[] ingredientes = { "crema", "leche" };
        mezclador.mezclarIngredientes(ingredientes);
        System.out.println("Remojar el pan en mezcla de leche y crema. (2-3 min)");
          Thread.sleep(2000);
        System.out.println("Pan listo para licuar.\n");
          Thread.sleep(2000);

        licuadora.encender();
       /* ajoEnPolvo.hacerPolvo();*/ // Segundo diente se tritur
        licuadora.licuar("pan remojado, chiles asados, cebolla, ajo en polvo y cacahuates tostados");
          Thread.sleep(2000);
        licuadora.apagar();
        System.out.println("Salsa suave y cremosa lista.\n");
          Thread.sleep(2000);

        // Cocinando salsa
        sarten.calentar();
          Thread.sleep(1000);
        sarten.usar();
          Thread.sleep(1000);
        sarten.freir("1 cucharada de aceite");
          Thread.sleep(2000);
        vertido.verter("salsa", "el sarten");
          Thread.sleep(2000);
        sarten.cocinar("salsa hasta espesar");
        /*System.out.println("Vertiendo la salsa en el sartén con aceite...");
        System.out.println("Cocinando la salsa hasta espesar, 6-8 minutos...");*/
          Thread.sleep(2000);
        System.out.println("Salsa espesa y bien condimentada con sal y pimienta.");
          Thread.sleep(2000);
        System.out.println("Dejar reposar unos segundos. \n");
          Thread.sleep(2000);

        // Friendo las tortillas
        sarten.calentar();
          Thread.sleep(2000);
        vertido.verter("aceite", "el sarten");
          Thread.sleep(2000);
        sarten.freir("tortilla");
          Thread.sleep(2000);
        System.out.println("Friendo las tortillas...");
        for (int i = 1; i <= tortilla.getCantidad(); i++) {
            System.out.println("Friendo tortilla " + i + "...");
          Thread.sleep(1000);
        }
        retirar.retirarDe("el sarten", "tortillas");
          Thread.sleep(2000);
        plato.colocar("tortillas con toallas para exceso de aceite");
          Thread.sleep(2000);
        /*System.out.println("Colocar tortillas en un plato con toallas para el exceso de aceite");*/
        System.out.println("Tortillas listas y escurridas.\n");
          Thread.sleep(2000);

        // Paso 6: Formar enchiladas
        System.out.println("\n --- Iniciando Emplatado --- \n");
          Thread.sleep(2000);
        rellenador.rellenarTortilla(tortilla, "pollo deshebrado");
          Thread.sleep(2000);
       /* System.out.println("Formando enchiladas...");
        for (int i = 1; i <= tortilla.getCantidad(); i++) {
            System.out.println("Rellenando tortilla " + i + " con pollo y enrollando...");
        }*/

        plato.colocar("tortillas rellenas");
          Thread.sleep(3000); 
        vertido.verter("salsa", "tortillas rellenas");
          Thread.sleep(3000);
        decorar.decorarPlatillo("enchiladas", " crema , lechuga , queso y rabanos\n");
          Thread.sleep(2000);
        System.out.println("¡Enchiladas listas para servir!");
    }
}
