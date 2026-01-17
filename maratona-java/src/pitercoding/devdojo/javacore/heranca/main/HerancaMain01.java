package pitercoding.devdojo.javacore.heranca.main;

import pitercoding.devdojo.javacore.heranca.dominio.Endereco;
import pitercoding.devdojo.javacore.heranca.dominio.Funcionario;
import pitercoding.devdojo.javacore.heranca.dominio.Pessoa;

public class HerancaMain01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 1");
        endereco.setCep("012345-6789");

        Pessoa pessoa = new Pessoa("Quase Nada");
        pessoa.setCpf("11111111111111");
        pessoa.setEndereco(endereco);
        pessoa.imprimie();

        System.out.println("------------------------");

        Funcionario funcionario = new Funcionario("Tripa Seca");
        funcionario.setCpf("2222222222222222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000);
        funcionario.imprimie();
    }
}
