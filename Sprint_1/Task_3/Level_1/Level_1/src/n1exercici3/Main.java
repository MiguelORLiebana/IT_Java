package n1exercici3;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarregaDades();
    }

    //public static HashMap<String, String> CarregaDades(){
    public static void CarregaDades(){
        HashMap<String, String> hash = new HashMap<>();
        int aux;
        try {

            FileReader file = new FileReader("/Users/mike/Desktop/IT_Java/IT_Java/Sprint_1/Task_3/Level_1/Level_1/src/n1exercici3/countries.txt");
            aux = file.read();

            while(aux != -1){
                aux = file.read();
                System.out.println(aux);
            }
            System.out.println("Paso por aquí");


        } catch(IOException e) {

        } finally {

        }
        //return hash;
    }
}