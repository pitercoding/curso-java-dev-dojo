package pitercoding.devdojo.javacore.associacao.main;

import pitercoding.devdojo.javacore.associacao.dominio.Escola;
import pitercoding.devdojo.javacore.associacao.dominio.Professor;

public class EscolaMain01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya");
        Professor professor2 = new Professor("Racha Cuca");

        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Jardim Céu", professores);

        escola.imprime();
    }
}
