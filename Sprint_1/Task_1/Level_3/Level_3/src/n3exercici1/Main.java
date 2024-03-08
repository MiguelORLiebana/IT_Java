package n3exercici1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Redaccio redaccio = new Redaccio();
        int aux = 10;

        while (aux != 0) {
            System.out.println("**************** MENU ********************");
            aux = selection(redaccio);
            System.out.println("******************************************");
        }
    }
    public static int selection(Redaccio redaccio) {
        int id;
        System.out.println("0.- Sortir del menú.");
        System.out.println("1.- Introduir redactor.");
        System.out.println("2.- Eliminar redactor.");
        System.out.println("3.- Introduir notícia a un redactor.");
        System.out.println("4.- Eliminar notícia (redactor i titular).");
        System.out.println("5.- Mostrar totes les notícies per redactor.");
        System.out.println("6.- Calcular puntuació de la notícia.");
        System.out.println("7.- Calcular preu-notícia");

        try {
            Scanner scanner = new Scanner(System.in);
            id = scanner.nextInt();

            switch (id) {
                case 0:
                    break;
                case 1:
                    redaccio.creaRedactor();
                    break;
                case 2:
                    redaccio.deleteRedactor();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("******************************************");
                    System.out.println("      Error: Invalid value");
                    System.out.println("******************************************");
            }
            return id;

        } catch (Exception e) {
            System.out.println("******************************************");
            System.out.println("       Valor incorrecte, try again!");
            System.out.println("******************************************");
            return 10;
        }
    }
}