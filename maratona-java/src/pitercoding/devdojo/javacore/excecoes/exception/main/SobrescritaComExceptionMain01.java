package pitercoding.devdojo.javacore.excecoes.exception.main;

import pitercoding.devdojo.javacore.excecoes.exception.dominio.Funcionario;
import pitercoding.devdojo.javacore.excecoes.exception.dominio.LoginInvalidoException;
import pitercoding.devdojo.javacore.excecoes.exception.dominio.Pessoa;

public class SobrescritaComExceptionMain01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
}
