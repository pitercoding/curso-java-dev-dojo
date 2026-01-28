package pitercoding.devdojo.javacore.nio.main;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveMain01 {
    public static void main(String[] args) {
        Path dir = Paths.get("home/piter");
        Path arquivo = Paths.get("dev/arquivo.txt");

        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);

        Path absoluto = Paths.get("/home/piter");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("file.txt");

        System.out.println("1. Absoluto + Relativo: " + absoluto.resolve(relativo));
        System.out.println("2. Absoluto + File: " + absoluto.resolve(file));

        System.out.println("3. Relativo + Absoluto: " + absoluto.resolve(absoluto));
        System.out.println("4. Relativo + File: " + absoluto.resolve(file));
    }
}
