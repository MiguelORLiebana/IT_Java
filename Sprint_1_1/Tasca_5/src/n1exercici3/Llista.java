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

    public void llistarContingutDiretoriesAndFolders(String directory, Boolean guardar){

        File file = new File(directory);

        if(file.isFile()){

            mostrar(file, Paths.get(file.getAbsolutePath()), guardar);

        } else {

            mostrar(file, Paths.get(file.getAbsolutePath()), guardar);

            File[] files = file.listFiles();

            for(File f: files){

                llistarContingutDiretoriesAndFolders(f.toString(), guardar);

            }
        }
    }

    private void mostrar(File file, Path path, Boolean guardar){

        try{

            BasicFileAttributes attr = Files.getFileAttributeView(path, BasicFileAttributeView.class).readAttributes();
            String tipus = IsDirectoryOrFile(attr);

            if(!guardar) showInfo(file, attr, tipus);
            else guardarPuntuacioEnArxiu(file, attr, tipus);

        } catch(IOException e){

            System.out.println("---- Error atributs del directori -----");
        }
    }

    private String IsDirectoryOrFile(BasicFileAttributes attr){

        if(attr.isDirectory()) return ", és un directori (D), ";
        else return " - és un fitxer (F)";
    }

    private void showInfo(File file, BasicFileAttributes attr, String tipus){

        System.out.println("Path: " + file.getAbsolutePath() +
                ", Name: " + file.getName() +
                tipus +
                " Data de modificacion: " + attr.lastModifiedTime());
    }

    public static void guardarPuntuacioEnArxiu(File file, BasicFileAttributes attr, String tipFitxer){

        try{

            String dir = System.getProperty("user.dir");

            //String local = "/src/n1exercici3/output/directoris.txt";
            //FileWriter fileG = new FileWriter(dir + local, true);

            String commandIo = "/output/directoris.txt";
            FileWriter fileG = new FileWriter(dir + commandIo, true);
            
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