package pitercoding.devdojo.javacore.introducaoclasses.main;

import pitercoding.devdojo.javacore.introducaoclasses.entity.Professor;

public class ProfessorMain01 {
    public static void main(String[] args) {
        Professor professor01 = new Professor();
        professor01.nome = "Girafales";
        professor01.idade = 47;
        professor01.sexo = 'M';

        System.out.println("Nome: " + professor01.nome
                + ", "
                + "Idade: " + professor01.idade
                + ", "
                + "Sexo: " + professor01.sexo
        );
    }
}
