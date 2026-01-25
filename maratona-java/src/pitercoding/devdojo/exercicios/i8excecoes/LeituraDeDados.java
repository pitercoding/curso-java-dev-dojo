package pitercoding.devdojo.exercicios.i8excecoes;

/**
 * Task 21 — Try / catch / finally
 * “Garantir fechamento.”
 */
public class LeituraDeDados {
    public static void main(String[] args) {
        try {
            leituraDeInfos();
        } catch (Exception e) {
            System.out.println("Erro durante a leitura dos dados");
        } finally {
            System.out.println("Fechando Leitura.");
        }
    }

    public static void leituraDeInfos() {
        System.out.println("Lendo dados...");
        throw new RuntimeException("Falha na leitura"); // simulação
    }
}
