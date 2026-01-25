package pitercoding.devdojo.exercicios.h7abstracaointerface;

/**
 * Task 18 — Pagamento
 * “Padronizar pagamentos.”
 */
public class PagamentoCartao implements Pagamento {

    @Override
    public void pagar() {
        System.out.println("Pagando com Cartão de Crédito");
    }
}
