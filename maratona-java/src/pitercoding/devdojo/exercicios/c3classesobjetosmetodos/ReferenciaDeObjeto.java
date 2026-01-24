package pitercoding.devdojo.exercicios.c3classesobjetosmetodos;

/**
 * Task 9 — Referência de objeto
 * “Testar comportamento de referência.”
 */
public class ReferenciaDeObjeto {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Quase Nada", 45, 3_000);

        // Duas referências para o MESMO objeto
        Funcionario funcionario2 = funcionario1;

        // Alterando salário por uma referência
        funcionario1.aplicarAumento(10);

        // Imprimindo pelo outro
        funcionario2.imprimirDados();

        System.out.println(funcionario1 == funcionario2); //true
    }
}
