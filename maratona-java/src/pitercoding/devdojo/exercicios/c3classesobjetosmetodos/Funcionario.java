package pitercoding.devdojo.exercicios.c3classesobjetosmetodos;

/**
 * Task 7 — Classe Funcionario
 * “Criar entidade básica.”
 * Task 8 — Reajuste salarial
 * “Regra de negócio simples.”
 */

public class Funcionario {
    String nome;
    int idade;
    double salario;

    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Salário: " + this.salario);
    }

    public void aplicarAumento(double percentual) {
        this.salario += this.salario * (percentual / 100);
    }

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Racha Cuca", 33, 5_000);
        funcionario.aplicarAumento(10);
        funcionario.imprimirDados();
    }
}
