package n3exercici1;

import java.util.List;

public class Redactor {
    private final String dni;
    private String nom;
    private int sou;
    private List<Noticia> noticias;
    private int id;
    private static int IdNext = 1;

    public Redactor(String dni, String nom){
        this.dni = dni;
        this.nom = nom;
        sou = 1500;
        id = IdNext;
        IdNext++;
    }

    public void incrementSou(int increment){
        this.sou += increment;
    }

    public boolean esDni(String dni){
        if(this.dni.equals(dni)) {
            return true;
        }else return false;
    }

    public void getDni(){
        System.out.println("Redactor amb dni: " + dni);
    }

    public void mostrarNoticies(){
        for(Noticia n:noticias){
            n.mostrarTitular();
        }
    }
}
