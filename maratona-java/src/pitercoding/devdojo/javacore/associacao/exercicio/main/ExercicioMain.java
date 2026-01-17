package pitercoding.devdojo.javacore.associacao.exercicio.main;

import pitercoding.devdojo.javacore.associacao.exercicio.entity.Aluno;
import pitercoding.devdojo.javacore.associacao.exercicio.entity.Local;
import pitercoding.devdojo.javacore.associacao.exercicio.entity.Professor;
import pitercoding.devdojo.javacore.associacao.exercicio.entity.Seminario;

public class ExercicioMain {
    public static void main(String[] args) {
        Local local = new Local("Rua 1");

        Aluno aluno = new Aluno("Racha Cuca", 35);

        Professor professor = new Professor("Girafales", "História");

        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("A História do Chapolin Colorado", alunosParaSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
