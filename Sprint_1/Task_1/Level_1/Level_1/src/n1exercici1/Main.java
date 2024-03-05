package n1exercici1;

public class Main {
    public static void main(String[] args) {

        System.out.println("********** accés a un membre estàtic **********");
        Corda.static_method();
        Corda.static_method();

        System.out.println("\n********** instància de classe Corda **********");
        Corda guitarra = new Corda("Fender", 1000);
        guitarra.tocar();

        Corda guitarra1 = new Corda("Otra", 2000);
        guitarra1.tocar();

        System.out.println("\n********** instància de classe Vent ***************");
        Vent saxo = new Vent("Selmer", 1200);
        saxo.tocar();

        System.out.println("\n********** instància de classe Percussio **********");
        Percussio bateria = new Percussio("Yamaha", 1500);
        bateria.tocar();
    }
}