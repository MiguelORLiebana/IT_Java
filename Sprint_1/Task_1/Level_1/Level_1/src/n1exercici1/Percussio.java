package n1exercici1;

public class Percussio extends Instrument {

    public Percussio(String nom, int preu){
        super(nom, preu);
    }

    static int i;

    static {
        System.out.println("Percussio init");
        i = 0;
    }

    {
        System.out.println("Percussio block init");
    }

    public static void static_method_Percussio(){
        System.out.println("Percussio static method");
    }
    public void tocar(){
        System.out.println("Està sonant un instrument de percussió");
    }
}
