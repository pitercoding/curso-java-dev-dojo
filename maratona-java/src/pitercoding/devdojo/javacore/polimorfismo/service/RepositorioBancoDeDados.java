package pitercoding.devdojo.javacore.polimorfismo.service;

import pitercoding.devdojo.javacore.polimorfismo.repository.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados...");
    }
}
