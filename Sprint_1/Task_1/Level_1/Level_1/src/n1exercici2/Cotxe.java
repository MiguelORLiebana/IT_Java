package n1exercici2;

public class Cotxe {
    private static final String marca = "Opel";
    private static String model;
    private final int potencia;

    public Cotxe(String model, int potencia){
        //inicialització al constructor dels atributs static i final
        this.model= model;
        this.potencia = potencia;
    }

    public static void frenar(){
        System.out.println("El vehicle està frenant");
    }

    public void accelerar(){
        System.out.println("El vehicle està accelerant");
    }
}
