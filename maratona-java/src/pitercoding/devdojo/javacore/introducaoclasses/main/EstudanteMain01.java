package pitercoding.devdojo.javacore.introducaoclasses.main;

import pitercoding.devdojo.javacore.introducaoclasses.entity.Estudante;

public class EstudanteMain01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        estudante01.nome = "Racha Cuca";
        estudante01.idade = 33;
        estudante01.sexo = 'M';

        System.out.println(estudante01.nome);
        System.out.println(estudante01.idade);
        System.out.println(estudante01.sexo);
    }
}
