package pitercoding.devdojo.javacore.polimorfismo.service;

import pitercoding.devdojo.javacore.polimorfismo.dominio.Computador;
import pitercoding.devdojo.javacore.polimorfismo.dominio.Produto;
import pitercoding.devdojo.javacore.polimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: R$" + produto.getValor());
        System.out.println("Imposto a ser pago: R$" + imposto);

        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDatadeValidade());
        }
    }
}
