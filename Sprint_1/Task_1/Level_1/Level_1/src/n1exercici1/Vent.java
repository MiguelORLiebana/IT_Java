package n1exercici1;

public class Vent extends Instrument {

    static int i;

    static {
        System.out.println("Vent init");
        i = 0;
    }

    {
        System.out.println("Vent block init");
    }

    public static void static_method(){
        System.out.println("Vent static method");
    }
    public void tocar(){
        System.out.println("Està sonant un instrument de vent");
    }
}