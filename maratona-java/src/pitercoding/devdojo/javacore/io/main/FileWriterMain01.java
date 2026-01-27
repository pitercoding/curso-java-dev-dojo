package pitercoding.devdojo.javacore.io.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterMain01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write("Eu sou o Racha Cuca, o pistoleiro mais rápido do oeste!!!!");
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
