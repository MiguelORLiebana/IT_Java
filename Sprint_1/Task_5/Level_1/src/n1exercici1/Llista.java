package n1exercici1;

import java.io.File;
import java.util.*;

public class Llista {
    public static void main(String[] args) {

//        String directory = "/Users/mike/Desktop";
//        System.out.println(args[0]);
//        System.out.println(args[0].getClass());

        llistarContingut(args[0]);
    }

    public static void llistarContingut(String directory) {

        File file = new File(directory);
        String[] aux = file.list();

        for(String a: aux){
            System.out.println(a);
        }

        List<String> auxList = new ArrayList<String>();
        System.out.println("****** ordenamos ********");
        Collections.sort(Arrays.asList(aux));

        for(String a: aux){
            System.out.println(a);
        }
    }
}