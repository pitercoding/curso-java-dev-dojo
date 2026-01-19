package pitercoding.devdojo.javacore.polimorfismo.main;

import pitercoding.devdojo.javacore.polimorfismo.dominio.Computador;
import pitercoding.devdojo.javacore.polimorfismo.dominio.Produto;
import pitercoding.devdojo.javacore.polimorfismo.dominio.Tomate;
import pitercoding.devdojo.javacore.polimorfismo.service.CalculadoraImposto;

public class ProdutoMain03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);

        System.out.println("---------------------------");

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDatadeValidade("19/01/26");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------------------");
        CalculadoraImposto.calcularImposto(produto);
    }
}
