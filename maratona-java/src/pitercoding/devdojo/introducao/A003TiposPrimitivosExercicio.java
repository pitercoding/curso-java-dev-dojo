package pitercoding.devdojo.introducao;

import java.util.Date;

public class A003TiposPrimitivosExercicio {

    public static void main(String[] args) {
        String nome = "Tripa Seca";
        String endereco = "Rua Sem Número, Aerolitos";
        double salario = 1567.32;
        String dataRecebimentoSalario = "13/01/2026";
        String declaracaoDeRecebimento = "Eu "
                + nome
                + ", morador do endereço "
                + endereco
                + ", confirmo que recebi o salário de "
                + salario
                + ", na data "
                + dataRecebimentoSalario + ".";

        System.out.println(declaracaoDeRecebimento);
    }
}
