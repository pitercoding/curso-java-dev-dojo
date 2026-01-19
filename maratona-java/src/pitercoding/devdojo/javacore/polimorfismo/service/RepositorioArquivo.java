package pitercoding.devdojo.javacore.polimorfismo.service;

import pitercoding.devdojo.javacore.polimorfismo.repository.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo...");
    }
}
