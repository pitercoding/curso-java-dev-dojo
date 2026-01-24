package pitercoding.devdojo.exercicios.e5staticblocosdeinicializacao;

/**
 * Task 13 — Contador de usuários
 * “Saber quantos usuários foram criados.”
 */
public class Usuario {
    private static int contador = 0;

    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
        contador++; // incrementa a cada novo usuário
    }

    public static int getContador() {
        return contador;
    }

    public static void main(String[] args) {
        Usuario u1 = new Usuario("Racha Cuca");
        Usuario u2 = new Usuario("Tripa Seca");
        Usuario u3 = new Usuario("Quase Nada");

        System.out.println("Usuários criados: " + Usuario.getContador());
    }
}
