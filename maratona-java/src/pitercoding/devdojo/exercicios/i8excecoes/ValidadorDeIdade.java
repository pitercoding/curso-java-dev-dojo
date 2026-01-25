package pitercoding.devdojo.exercicios.i8excecoes;

/**
 * Task 20 — Validação com exceção
 * “Erro não pode ser silencioso.”
 */
public class ValidadorDeIdade {
    public static void main(String[] args) {
        int idade = -1;

        if (idade < 0) {
            throw new IdadeInvalidaException("Idade inválida! Não pode ser menor que 0.");
        }
        System.out.println("Idade válida!");
    }
}
