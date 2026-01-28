package pitercoding.devdojo.javacore.nio.main;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathMain01 {
    public static void main(String[] args) {
        // Formas de passar
        Path p1 = Paths.get("D:\\programacao\\curso-java-dev-dojo\\arquivo\\teste.txt");
        Path p2 = Paths.get("D:\\programacao\\curso-java-dev-dojo\\arquivo", "teste.txt");
        Path p3 = Paths.get("D:","\\programacao\\curso-java-dev-dojo\\arquivo\\", "teste.txt");
        Path p4 = Paths.get("D:","programacao", "curso-java-dev-dojo", "arquivo", "teste.txt");


        System.out.println(p1.getFileName());
        System.out.println(p2.getFileName());
        System.out.println(p3.getFileName());
        System.out.println(p4.getFileName());
    }
}
