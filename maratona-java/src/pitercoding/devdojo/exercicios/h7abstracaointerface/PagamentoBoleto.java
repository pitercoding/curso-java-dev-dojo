package pitercoding.devdojo.exercicios.h7abstracaointerface;

/**
 * Task 18 — Pagamento
 * “Padronizar pagamentos.”
 */
public class PagamentoBoleto implements Pagamento {

    @Override
    public void pagar() {
        System.out.println("Pagando com Boleto");
    }
}
