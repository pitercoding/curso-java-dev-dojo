package pitercoding.devdojo.exercicios.f6herancapolimorfismo;

/**
 * Task 15 — Funcionário e Gerente
 * “Modelar cargos.”
 *
 * Task 16 — Cálculo polimórfico
 * “Bônus varia por cargo.”
 *
 * Task 17 — instanceof
 * “Regra específica para gerente.”
 */

public class Gerente extends Funcionario {

    public Gerente(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.20; //20%
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome = '" + getNome() + '\'' +
                ", idade = " + getIdade() +
                ", salario = " + getSalario() +
                '}';
    }


}
