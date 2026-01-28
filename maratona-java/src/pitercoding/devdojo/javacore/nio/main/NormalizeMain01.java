package pitercoding.devdojo.javacore.nio.main;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeMain01 {
    public static void main(String[] args) {
        String diretorioDoProjeto = "home/piter/dev";
        String arquivoTxt = "../../arquivo.txt";

        Path path1 = Paths.get(diretorioDoProjeto, arquivoTxt);
        System.out.println(path1);
        System.out.println(path1.normalize());

        Path path2 = Paths.get("/home/./piter/./dev");
        System.out.println(path2);
        System.out.println(path2.normalize());
    }
}
