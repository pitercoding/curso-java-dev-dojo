package pitercoding.devdojo.exercicios.f6herancapolimorfismo;

/**
 * Task 15 — Funcionário e Gerente
 * “Modelar cargos.”
 *
 * Task 16 — Cálculo polimórfico
 * “Bônus varia por cargo.”
 */

public class Main {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Racha Cuca", 35, 2_000);
        Funcionario vendedor = new Vendedor("Tripa Seca", 40, 1_500);

        imprimirInfo(gerente);
        imprimirInfo(vendedor);
    }

    private static void imprimirInfo(Funcionario funcionario) {
        System.out.println(funcionario);
        System.out.println("Bônus: R$" + funcionario.calcularBonus());

        if (funcionario instanceof Gerente gerente) {
            System.out.println("Acesso a relatórios gerenciais liberado para " + gerente.getNome());
        }

        System.out.println("---------------------------------");
    }
}
