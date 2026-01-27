package pitercoding.devdojo.javacore.io.main;

import java.io.File;
import java.io.IOException;

public class FileMain02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean isDireorioCreated = fileDiretorio.mkdir();
        System.out.println("Pasta criada? " + isDireorioCreated);

        File fileTxt = new File(fileDiretorio,"exemplo.txt");
        boolean isFileCreated = fileTxt.createNewFile();
        System.out.println("Arquivo criado? " + isFileCreated);

        File fileRenamed = new File(fileDiretorio,"arquivo_renomeado.txt");
        boolean isFileRenamed = fileTxt.renameTo(fileRenamed);
        System.out.println("Arquivo renomeado? " + isFileRenamed);

        File diretorioRenamed = new File("pasta2");
        boolean isDiretorioRenamed = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println("Pasta renomeada? " + isDiretorioRenamed);
    }
}
