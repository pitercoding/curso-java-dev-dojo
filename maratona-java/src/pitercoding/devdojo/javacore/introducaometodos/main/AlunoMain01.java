package pitercoding.devdojo.javacore.introducaometodos.main;

import pitercoding.devdojo.javacore.introducaometodos.dominio.Aluno;
import pitercoding.devdojo.javacore.introducaometodos.dominio.ImprimeAluno;

public class AlunoMain01 {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno();
        Aluno aluno02 = new Aluno();
        ImprimeAluno imprimeAluno = new ImprimeAluno();

        aluno01.nome = "Poucas Trancas";
        aluno01.idade = 37;
        aluno01.sexo = 'M';

        aluno02.nome = "Tripa Seca";
        aluno02.idade = 40;
        aluno02.sexo = 'M';

        System.out.println("\n=== Aluno 01 ===");
        imprimeAluno.imprime(aluno01);
        System.out.println("\n=== Aluno 02 ===");
        imprimeAluno.imprime(aluno02);

//        System.out.println("\n=== Aluno 01 ===");
//        System.out.println(aluno01.nome);
//        System.out.println(aluno01.idade);
//        System.out.println(aluno01.sexo);
//
//        System.out.println("\n=== Aluno 02 ===");
//        System.out.println(aluno02.nome);
//        System.out.println(aluno02.idade);
//        System.out.println(aluno02.sexo);
    }
}
