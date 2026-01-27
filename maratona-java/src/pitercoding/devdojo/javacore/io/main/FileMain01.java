package pitercoding.devdojo.javacore.io.main;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FileMain01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created: " + isCreated);
            System.out.println("Path " + file.getPath()); // file.txt
            System.out.println("Absolute path " + file.getAbsolutePath()); // D:\programacao\curso-java-dev-dojo\file.txt
            System.out.println("Is directory? " + file.isDirectory());
            System.out.println("Is file? " + file.isFile());
            System.out.println("Is hidden? " + file.isHidden());
            System.out.println("Last modified: " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));

            boolean exists = file.exists();
            if (exists) {
                System.out.println("Deleted: " + file.delete());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
