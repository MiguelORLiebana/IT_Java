package n3exercici3;

public class Noticia {

    enum Noticias { futbol, basquet, tenis, f1, motociclisme };

    enum Competicio { }
    private String titular;
    private String text;
    private int puntuacio;
    private int preu;
    private Noticias tipusNoticia;

    public Noticia(String titular, int puntuacio, int preu){
        this.titular = titular;
        this.text = "";
        this.puntuacio = puntuacio;
        this.preu = preu;
    }

    public void mostrarTitular(){
        System.out.println(this.titular);
    }

    public boolean isTenis(){
        if(tipusNoticia == Noticias.tenis){
            return true;
        } else return false;
    }

    public boolean isFutbol() {
        if(tipusNoticia == Noticias.futbol){
            return true;
        } else return false;
    }

    public boolean isF1(){
        if(tipusNoticia == Noticias.f1){
            return true;
        } else return false;
    }

    public boolean isBasquet(){
        if(tipusNoticia == Noticias.basquet){
            return true;
        } else return false;
    }

    public boolean isMotociclisme(){
        if(tipusNoticia == Noticias.motociclisme){
            return true;
        } else return false;
    }
}
