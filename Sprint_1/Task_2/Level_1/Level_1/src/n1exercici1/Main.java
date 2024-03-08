package n1exercici1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Producte product_1 = new Producte("patata", 10);
        Producte product_2 = new Producte("Limón", 20);

        List<Producte> listaAux = new ArrayList<Producte>();

        listaAux.add(product_1);
        listaAux.add(product_2);

        Venda venda = new Venda(listaAux);
        try{
            System.out.println("Preu total: " + venda.calcularTotal());
        } catch (VendaBuidaException e){
            System.out.println(e.getMessage());
        }
    }
}