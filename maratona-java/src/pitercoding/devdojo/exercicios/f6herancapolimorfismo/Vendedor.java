package pitercoding.devdojo.exercicios.f6herancapolimorfismo;

/**
 * Task 15 — Funcionário e Gerente
 * “Modelar cargos.”
 *
 * Task 16 — Cálculo polimórfico
 * “Bônus varia por cargo.”
 */

public class Vendedor extends Funcionario {
    public Vendedor(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.15; //15%
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome = '" + getNome() + '\'' +
                ", idade = " + getIdade() +
                ", salario = " + getSalario() +
                '}';
    }
}
