package pitercoding.devdojo.javacore.enumm.dominio;

public class Cliente {
    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + "\n"
                + "Tipo Cliente: " + tipoCliente.getNomeRelatorio() + "\n"
                + "Tipo Cliente Código: " + tipoCliente.VALOR + "\n"
                + "Tipo Pagamento: " + tipoPagamento;
    }
}
