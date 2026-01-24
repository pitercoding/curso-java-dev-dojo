package pitercoding.devdojo.exercicios.a1fundamentosecontroledefluxo;

/**
 * Task 2 — Classificação de nível de acesso
 * “O sistema precisa classificar usuários.”
 */
public class ClassificacaoNivelDeAcesso {
    public static void main(String[] args) {
        int numeroUsuario = 1;

        String tipoUsuario = switch (numeroUsuario) {
            case 1 -> "ADMIN";
            case 2 -> "USER";
            case 3 -> "GUEST";
            default -> "Opção inválida!";
        };

        System.out.println(tipoUsuario);

    }
}
