package n1exercici1;

public class Corda extends Instrument {
    static int i;
    static int j;

    static {
        System.out.println("Corda init");
        i = 0;
        j = 0;
    }

    {
        j++;
        System.out.println("Corda block init nª" + j);
    }

    public static void static_method(){
        i++;
        System.out.println("Corda static method nª" + i);
    }
    public void tocar(){
        System.out.println("Està sonant un instrument de corda");
    }
}
