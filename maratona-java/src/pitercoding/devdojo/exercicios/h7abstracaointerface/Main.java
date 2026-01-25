package pitercoding.devdojo.exercicios.h7abstracaointerface;

public class Main {
    public static void main(String[] args) {
        Pagamento pagamento1 = new PagamentoCartao();
        Pagamento pagamento2 = new PagamentoBoleto();

        ProcessadorPagamento.processar(pagamento1);
        ProcessadorPagamento.processar(pagamento2);
    }
}
