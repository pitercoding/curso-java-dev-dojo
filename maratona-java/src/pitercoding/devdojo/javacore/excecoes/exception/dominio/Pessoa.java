package pitercoding.devdojo.javacore.excecoes.exception.dominio;

import java.io.File;
import java.io.FileNotFoundException;

public class Pessoa {
    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvando pessoa!");
    }
}
