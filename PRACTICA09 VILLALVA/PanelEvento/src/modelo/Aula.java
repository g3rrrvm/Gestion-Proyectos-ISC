/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Aula {
    private String codigo;
    private int piso;
    private int numPupitres;

    public Aula() {}

    public Aula(String codigo, int piso, int numPupitres) {
        this.codigo = codigo;
        this.piso = piso;
        this.numPupitres = numPupitres;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getPiso() {
        return piso;
    }

    public int getNumPupitres() {
        return numPupitres;
    }

    @Override
    public String toString() {
        return "Aula " + codigo + " (Piso: " + piso + ", Pupitres: " + numPupitres + ")";
    }
}

