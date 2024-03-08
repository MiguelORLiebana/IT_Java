package n1exercici1;

import java.util.List;

public class Venda {

    private List<Producte> lista;
    private int preuVenda;

    public Venda(List<Producte> lista){
        this.lista = lista;
    }

    public int calcularTotal() throws VendaBuidaException {

        if(lista.isEmpty()){
            throw new VendaBuidaException("Per fer una venda primer has d’afegir productes");
        }
        else{
            for(Producte p:lista){
                preuVenda+=p.donarPreu();
            }
            return preuVenda;
        }
    }
}
