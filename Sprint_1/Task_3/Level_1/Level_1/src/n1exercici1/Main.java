package n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Month gener = new Month("gener");
        Month febrer = new Month("febrer");
        Month març = new Month("març");
        Month abril = new Month("abril");
        Month maig = new Month("maig");
        Month juny = new Month("juny");
        Month juliol = new Month("juliol");
        Month agost = new Month("agost");
        Month setembre = new Month("setembre");
        Month octubre = new Month("octubre");
        Month novembre = new Month("novembre");
        Month desembre = new Month("desembre");

        List<Month> months = new ArrayList<Month>();

        months.add(gener);
        months.add(febrer);
        months.add(març);
        months.add(abril);
        months.add(maig);
        months.add(juny);
        months.add(juliol);
        months.add(setembre);
        months.add(octubre);
        months.add(novembre);
        months.add(desembre);

        System.out.println("**************** FOR ******************");
        mostrarOrdreMonthsFor(months);
        System.out.println("*********** ITERATOR *******************");
        mostrarOrdreMonthsIterador(months);

        System.out.println("*************************************");
        months.add(7,agost);

        mostrarOrdreMonthsFor(months);

        System.out.println("********** CONVERT TO HASHSET ***********");
        LinkedHashSet<Month> monthsHashset = new LinkedHashSet<Month>(months);

        mostrarOrdreMonthsHashset(monthsHashset);
    }

    public static void mostrarOrdreMonthsFor(List<Month> months){
        for(Month p:months){
            System.out.println(p.getMonthName());
        }
    }

    public static void mostrarOrdreMonthsIterador(List<Month> months){
        for(int i = 0; i < months.size(); i++){
            System.out.println(months.get(i).getMonthName());
        }
    }

    public static void mostrarOrdreMonthsHashset(LinkedHashSet<Month> months){
        for(Month p:months){
            System.out.println(p.getMonthName());
        }
    }
}