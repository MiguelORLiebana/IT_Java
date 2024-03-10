package n1exercici2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;

public class Llista {

    // Option 1
    //Notes: https://www.youtube.com/watch?v=pkrRxaOuGDk

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

        } catch(IOException e){
            System.out.println("---- Error atributs del directori -----");
        }
    }

    // Option 2 - Not Working

    public void llistarContingutDirectoris(String directory) {

        File file = new File(directory);
        String[] aux = file.list();

        System.out.println("************* Llista per ordre alfabètic ***********");
        Arrays.sort(aux);

        for(String a: aux){

            Path path = Paths.get(directory);

            try{
                BasicFileAttributes attr = Files.getFileAttributeView(path, BasicFileAttributeView.class).readAttributes();
                String tipus = IsDirectoryOrFile(attr);
                //showInfo(a, attr, path, tipus);

            } catch(IOException e){
                System.out.println("---- Error atributs del directori -----");
            }
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
}