package pitercoding.devdojo.exercicios.b2arrayslacoscondicionais;

/**
 * Task 4 — Média de notas
 * “Precisamos calcular a média da turma.”
 */
public class MediaDeNotas {
    public static void main(String[] args) {
        double[] notas = {5.7, 4.9, 9.4, 7.9};
        double soma = 0;

        for (double nota: notas) {
            soma += nota;
        }

        double media = soma / notas.length;
        System.out.println("Média do aluno: " + media);

        if (media >= 7) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }
    }
}
