package pitercoding.devdojo.javacore.polimorfismo.main;

import pitercoding.devdojo.javacore.polimorfismo.repository.Repositorio;
import pitercoding.devdojo.javacore.polimorfismo.service.RepositorioBancoDeDados;

public class RepositorioMain01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}
