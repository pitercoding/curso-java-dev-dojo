package pitercoding.devdojo.exercicios.d4encapsulamentoconstrutores;

/**
 * Task 10 — Classe ContaBancaria
 * “Encapsular dados sensíveis.”
 *
 * Task 11 — Construtor obrigatório
 * “Conta não pode nascer sem saldo inicial.”
 *
 * Task 12 — Sobrecarga de construtores
 * “Criar conta com ou sem saldo.”
 */

public class ContaBancaria {
    private double saldo;

    public ContaBancaria() {
        this(0);
    }

    public ContaBancaria(double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("Saldo inicial não pode ser negativo!");
        }
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito > 0) {
            saldo += valorDeposito;
            System.out.println("Valor depositado R$" + valorDeposito);
            System.out.println("Saldo atual R$" + saldo);
        } else {
            System.out.println("Valor inválido!");
        }
    }

    public void sacar(double valorSaque) {
        if (valorSaque <= 0) {
            System.out.println("Valor de saque inválido!");
            return;
        }

        if (this.saldo >= valorSaque) {
            saldo -= valorSaque;
            System.out.println("Valor sacado: R$" + valorSaque);
            System.out.println("Saldo atual: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente para saque!");
        }
    }

    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        ContaBancaria contaBancaria2 = new ContaBancaria(100);

        System.out.println("Saldo Inicial: R$" + contaBancaria.getSaldo());
        contaBancaria.depositar(300);
        contaBancaria.sacar(300);

        System.out.println("-----------------------------");
        System.out.println("Saldo Inicial: R$" + contaBancaria2.getSaldo());
        contaBancaria2.depositar(100);
        contaBancaria2.sacar(100);
    }
}
