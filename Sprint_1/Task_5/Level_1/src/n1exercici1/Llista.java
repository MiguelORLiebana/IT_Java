package n1exercici1;

import java.io.File;
import java.util.*;

public class Llista {

    public void llistarContingut(String directory) {

        File file = new File(directory);
        String[] aux = file.list();

        System.out.println("************* Llista sense ordre alfabètic **********");
        for(String a: aux){
            System.out.println(a);
        }

        System.out.println("************* Llista per ordre alfabètic ***********");
        Arrays.sort(aux);

        for(String a: aux){
            System.out.println(a);
        }
    }
}