package n1exercici4;

public class Program {
    public static void main(String[] args) {

        //String directory = "/Users/mike/Desktop/Test";
        Llista llista = new Llista();

        try{
            llista.mostrarConsolaFitxer(args[0]);

        } catch(ArrayIndexOutOfBoundsException e){
            e.getMessage();
        }
    }
}
