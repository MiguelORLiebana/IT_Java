package n1exercici3;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> hashCountries = new HashMap<>();
        hashCountries = carregaDades();

        System.out.println("*************************************");
        System.out.println("Introdueix un nom: ");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Comença el joc!!");

        int punts = 0;
        for(int j = 0; j < 2; j++){
            int i = (int) (Math.random()*hashCountries.size());
            System.out.println(i);

            String country = (String) hashCountries.keySet().toArray()[i];
            System.out.println(country);

            String city = hashCountries.get(country);
            System.out.println(city);

            System.out.println("Introdueix nom de la city pel country: " + country);
            String cityUser = scanner.nextLine();

            if(cityUser.equals(city)){
                punts++;
                System.out.println("la ciutat es correcta!");
            } else System.out.println("la ciutat es incorrecta!");
        }

        guardarPuntuacio(name, punts);

    }

    public static void guardarPuntuacio(String name, int punts){
        //ufferedWriter file = null;

        try{
            //file = new BufferedWriter(new FileWriter("src/n1exercici3/output/classificacio.txt"));
            FileWriter file = new FileWriter("src/n1exercici3/output/classificacio.txt", true);

            System.out.println(name + " té una puntuació de: " + punts);
            file.write(name + " té una puntuació de: " + punts + "\n");
            //file.newLine();


            file.close();
        } catch(IOException e){
            System.out.println("No es pot accedir a classificacio.txt");
        }
    }

    public static HashMap<String, String> carregaDades(){

        HashMap<String, String> aux = new HashMap<String, String>();

        try{
            File file = new File("src/n1exercici3/resources/countries.txt");

            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] paisCity = line.split(" ");
//                System.out.println(paisCity[0]);
//                System.out.println(paisCity[1]);
                aux.put(paisCity[0], paisCity[1]);
                System.out.println(line);
            }
        } catch(IOException e){
            System.out.println("No es pot accedir a countries.txt");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error with the array");
        }

        return aux;

    }
}