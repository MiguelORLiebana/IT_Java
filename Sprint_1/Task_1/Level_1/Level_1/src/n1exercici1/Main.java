package n1exercici1;

public class Main {
    public static void main(String[] args) {

        System.out.println("********** accés a un membre estàtic **********");
        Corda.static_method();
        Corda.static_method();

        System.out.println("********** instància de classe Corda **********");
        Corda guitarra = new Corda();
        guitarra.tocar();

        Corda guitarra1 = new Corda();
        guitarra1.tocar();

        System.out.println("********** instància de classe Vent **********");
        Vent saxo = new Vent();
        saxo.tocar();

        System.out.println("********** instància de classe Percussio **********");
        Percussio bateria = new Percussio();
        bateria.tocar();
    }
}