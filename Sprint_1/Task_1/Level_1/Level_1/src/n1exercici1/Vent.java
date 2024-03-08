package n1exercici1;

public class Vent extends Instrument {

    public Vent(String nom, int preu){
        super(nom, preu);
    }

    static int i;

    static {
        System.out.println("Vent init");
        i = 0;
    }

    {
        System.out.println("Vent block init");
    }

    public static void static_method_Vent(){
        System.out.println("Vent static method");
    }
    public void tocar(){
        System.out.println("Està sonant un instrument de vent");
    }
}
