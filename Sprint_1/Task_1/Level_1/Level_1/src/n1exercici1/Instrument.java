package n1exercici1;

import java.sql.SQLOutput;

public abstract class Instrument {
    String nom;
    int preu;

    public Instrument(String nom, int preu){
        this.nom = nom;
        this.preu = preu;
    }

    abstract void tocar();

    static {
        System.out.println("Instrument init");
    }
}
