package pitercoding.devdojo.javacore.introducaometodos.main;

import pitercoding.devdojo.javacore.introducaometodos.dominio.Funcionario;

public class FuncionarioMain01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Tripa Seca");
        funcionario.setIdade(43);
        funcionario.setSalarios(new double[]{1500, 2563.77, 3245.77});
        funcionario.imprimir();
        System.out.println(funcionario.getMedia());
    }
}
