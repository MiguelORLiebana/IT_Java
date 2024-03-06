package n3exercici1;

import java.util.List;
import java.util.Scanner;

public class Redaccio {
    private List<Redactor> redactors;
    private String auxDni;
    private String dni;
    private String nom;

    public void incrementSouRedactors(int increment){
        for(Redactor p:redactors){
            p.incrementSou(increment);
        }
    }

    private void introdueixRedactor(Redactor redactor){
        redactors.add(redactor);
    }

    public void creaRedactor(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nom del redactor");
        nom = scanner.nextLine();
        System.out.println("DNI del redactor");
        dni = scanner.nextLine();

        Redactor redactorAux = new Redactor(dni, nom);
        introdueixRedactor(redactorAux);
    }

    public void deleteRedactor(){
        auxDni = demanarDni();

        for(Redactor r:redactors){
            if(r.esDni(auxDni)){
                r = null;
            }
        }
    }

    public void mostrarNoticiasRedactor(){
        for(Redactor p:redactors){
            p.getDni();
            p.mostrarNoticies();
        }
    }

    public String demanarDni(){
        String aux;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdueix el dni del redactor");
        return aux = scanner.nextLine();
    }
}
