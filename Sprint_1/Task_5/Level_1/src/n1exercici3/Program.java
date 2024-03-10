package n1exercici3;

public class Program {
    public static void main(String[] args) {

        //String directory = "/Users/mike/Desktop/Test";
        Llista directoris = new Llista();

        try{
            directoris.llistarContingutDiretoriesAndFolders(args[0], true);
        } catch(ArrayIndexOutOfBoundsException e){
            e.getMessage();
        }
    }
}
