package n1exercici3;

import java.io.*;
import java.util.HashMap;
import java.util.Properties;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        jugar();

    }

    public static void jugar(){

        HashMap<String, String> hashCountries = new HashMap<String, String>();
        hashCountries = carregarDades();

        System.out.println("*********** Comença el joc!! ********");
        System.out.println("*************************************");
        System.out.println("       Introdueix un nom ");
        System.out.println("*************************************");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int punts = 0;

        for(int j = 0; j < 10; j++){

            int numAleatori = aleatori(hashCountries);

            String country = (String) hashCountries.keySet().toArray()[numAleatori];
            String city = hashCountries.get(country);

            System.out.println("******* Introdueix nom de la capital de: " + country + " *********");
            String cityUser = scanner.nextLine();

            if(cityUser.equals(city)){
                punts++;
                System.out.println("La resposta es correcte!");
            } else System.out.println("La resposta es incorrecte!");
        }

        guardarPuntuacio(name, punts);
    }

    public static int aleatori(HashMap<String, String> dades){
        return (int) (Math.random()*dades.size());
    }

    public static void guardarPuntuacio(String name, int punts){

        try{
            FileWriter file = new FileWriter("Level_1/src/n1exercici3/output/classificacio.txt", true);

            System.out.println(name + " té una puntuació de: " + punts);
            file.write(name + " té una puntuació de: " + punts + "\n");

            file.close();
        } catch(IOException e){
            System.out.println("No es pot accedir a l´arxiu classificacio.txt");
        }
    }

    public static HashMap<String, String> carregarDades(){

        HashMap<String, String> aux = new HashMap<String, String>();

        try{
//            FileInputStream propFile = new FileInputStream( "countries.txt");
//            Properties p = new Properties(System.getProperties());
//            p.load(propFile);
//            System.out.println(p);

            //TODO: problem with the relative path

            //Solution1
//            String path = System.getProperty("user.dir");
//            String subpath = "/Level_1/src/n1exercici3/countries.txt";
//            System.out.println(path+subpath);
            //File file = new File(path+subpath);

            //Soluton2 - working on windows os and mac os
            File file = new File("Level_1/src/n1exercici3/resources/countries.txt");

            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] paisCity = line.split(" ");

                aux.put(paisCity[0], paisCity[1]);
            }

        } catch(IOException e){
            System.out.println("EXCEPTION: No es pot accedir a l´arxiu countries.txt");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("EXCEPTION: Error amb l´array");
        }

        return aux;
    }
}