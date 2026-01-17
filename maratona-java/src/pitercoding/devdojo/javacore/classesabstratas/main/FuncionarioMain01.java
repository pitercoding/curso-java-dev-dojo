package pitercoding.devdojo.javacore.classesabstratas.main;

import pitercoding.devdojo.javacore.classesabstratas.dominio.Desenvolvedor;
import pitercoding.devdojo.javacore.classesabstratas.dominio.Gerente;

public class FuncionarioMain01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        System.out.println(gerente);

        Desenvolvedor desenvolvedor = new Desenvolvedor("Quase Nada", 12000);
        System.out.println(desenvolvedor);

        gerente.imprime();
        desenvolvedor.imprime();
    }
}
