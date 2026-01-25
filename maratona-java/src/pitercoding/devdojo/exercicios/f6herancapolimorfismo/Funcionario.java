package pitercoding.devdojo.exercicios.f6herancapolimorfismo;

/**
 * Task 15 — Funcionário e Gerente
 * “Modelar cargos.”
 *
 * Task 16 — Cálculo polimórfico
 * “Bônus varia por cargo.”
 */

public class Funcionario {
    private String nome;
    private int idade;
    private double salario;

    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    // MÉTODO POLIMÓRFICO
    public double calcularBonus(){
        return salario * 0.10; //10%
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", salario=" + salario +
                '}';
    }
}
