package pitercoding.devdojo.javacore.enumm.main;

import pitercoding.devdojo.javacore.enumm.dominio.Cliente;
import pitercoding.devdojo.javacore.enumm.dominio.TipoCliente;
import pitercoding.devdojo.javacore.enumm.dominio.TipoPagamento;

public class ClienteMain01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Quase Nada", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println("----------------------------");
        System.out.println(cliente2);
        System.out.println("----------------------------");
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        System.out.println("----------------------------");
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);

    }
}
