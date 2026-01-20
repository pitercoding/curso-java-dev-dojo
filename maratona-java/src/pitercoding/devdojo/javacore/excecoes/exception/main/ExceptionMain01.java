package pitercoding.devdojo.javacore.excecoes.exception.main;

import java.io.File;
import java.io.IOException;

public class ExceptionMain01 {
    // Exceções:
    // 1. Checked -> Filha da classe Exception - Código não compila
    // 2. Unchecked -> Neta da classe Exception, filha de RuntimeException - Eu desenvolvi errado. Ex: pede número mas eu passo uma string
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo(){
        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado: " + isCreated);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
