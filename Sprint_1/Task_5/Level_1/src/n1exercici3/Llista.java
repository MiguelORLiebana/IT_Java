package n1exercici3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;

public class Llista {

    public void llistarContingutDiretoriesAndFolders(String directory){
        File file = new File(directory);

        if(file.isFile()){
            mostrar(file, Paths.get(file.getAbsolutePath()));
        } else {
            mostrar(file, Paths.get(file.getAbsolutePath()));

            File[] files = file.listFiles();

            for(File f: files){
                llistarContingutDiretoriesAndFolders(f.toString());
            }
        }
    }

    private void mostrar(File file, Path path){
        try{
            BasicFileAttributes attr = Files.getFileAttributeView(path, BasicFileAttributeView.class).readAttributes();
            String tipus = IsDirectoryOrFile(attr);

            showInfo(file, attr, path, tipus);
            guardarPuntuacioEnArxiu(file, attr, path, tipus);

        } catch(IOException e){
            System.out.println("---- Error atributs del directori -----");
        }
    }

    private String IsDirectoryOrFile(BasicFileAttributes attr){
        String item = "";
        if(attr.isDirectory()) return item = ", és un directori (D), ";
        else return item = " - és un fitxer (F)";
    }

    private void showInfo(File file, BasicFileAttributes attr, Path path, String tipus){
        System.out.println("Path: " + file.getAbsolutePath() +
                ", Name: " + file.getName() +
                tipus +
                " Data de modificacion: " + attr.lastModifiedTime());
    }

    public static void guardarPuntuacioEnArxiu(File file, BasicFileAttributes attr, Path path, String tipFitxer){

        try{
            FileWriter fileG = new FileWriter("src/n1exercici3/out/directoris.txt", true);
            
            fileG.write("Path: " + file.getAbsolutePath() +
                    ", Name: " + file.getName() +
                    tipFitxer +
                    " Data de modificacion: " + attr.lastModifiedTime() +
                    "\n");

            fileG.close();
        } catch(IOException e){
            System.out.println("No es pot accedir a l´arxiu directoris.txt");
        }
    }
}