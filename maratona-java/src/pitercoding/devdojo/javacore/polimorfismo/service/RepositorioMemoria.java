package pitercoding.devdojo.javacore.polimorfismo.service;

import pitercoding.devdojo.javacore.polimorfismo.repository.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória...");
    }
}
