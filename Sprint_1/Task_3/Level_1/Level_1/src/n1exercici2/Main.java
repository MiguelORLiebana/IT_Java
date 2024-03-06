package n1exercici2;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        List<Integer> llista = new ArrayList<Integer>();

        afegirData(llista);
        mostrarLlista(llista);

        ListIterator<Integer> it = llista.listIterator();

        for (ListIterator<Integer> iter = it; iter.hasNext(); ) {
            Integer i = iter.next();
            System.out.println(i.intValue());
        }


    }

    public static void afegirData(List<Integer> llista){
        for(int i = 1; i<11; i++){
            llista.add(i);
        }
    }

    public static void mostrarLlista(List<Integer> llista){
        for(Integer i : llista){
            System.out.println(i);
        }
    }
}