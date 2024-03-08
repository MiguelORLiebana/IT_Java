package n1exercici2;

public class Main {
    public static void main(String[] args) {

        System.out.println("Invocar mètode estàtic:");
        Cotxe.frenar();

        System.out.println("\nInvocar métode no estàtic:");
        Cotxe cotxe = new Cotxe("Corsa", 100);
        cotxe.accelerar();
    }
}