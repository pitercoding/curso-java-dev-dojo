package pitercoding.devdojo.exercicios.e5staticblocosdeinicializacao;

/**
 * Task 14 — Configuração do sistema
 * “Rodar algo uma única vez.”
 */

public class Sistema {
    static String mensagemInicialDoSistema;

    static {
        mensagemInicialDoSistema = "Sistema inicializado!";
        System.out.println(mensagemInicialDoSistema);
    }


    public static void main(String[] args) {
        System.out.println("Bem vindo!");
    }
}
