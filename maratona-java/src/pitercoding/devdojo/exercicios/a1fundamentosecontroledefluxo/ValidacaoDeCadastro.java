package pitercoding.devdojo.exercicios.a1fundamentosecontroledefluxo;

/**
 * Task 1 — Validação simples de cadastro
 * “Precisamos validar dados antes de salvar no sistema.”
 */
public class ValidacaoDeCadastro {
    public static void main(String[] args) {
        String nome = "Racha Cuca";
        int idade = 35;
        double salario = 1_000.55;

        if (idade < 18) {
            System.out.println("Cadastro não permitido!");
        } else if (salario <= 0) {
            System.out.println("[ERRO] Salário não pode ser 0 ou menor que 0");
        } else {
            System.out.println("Usuário cadastrado com sucesso!");
        }
    }
}
