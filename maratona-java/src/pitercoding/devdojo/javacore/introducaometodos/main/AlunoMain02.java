package pitercoding.devdojo.javacore.introducaometodos.main;

import pitercoding.devdojo.javacore.introducaometodos.dominio.Aluno;

public class AlunoMain02 {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno();
        Aluno aluno02 = new Aluno();

        aluno01.nome = "Poucas Trancas";
        aluno01.idade = 37;
        aluno01.sexo = 'M';

        aluno02.nome = "Tripa Seca";
        aluno02.idade = 40;
        aluno02.sexo = 'M';

        aluno01.imprime();
        aluno02.imprime();
    }
}
