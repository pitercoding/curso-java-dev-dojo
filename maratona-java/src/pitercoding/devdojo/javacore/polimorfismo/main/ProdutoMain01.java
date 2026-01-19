package pitercoding.devdojo.javacore.polimorfismo.main;

import pitercoding.devdojo.javacore.polimorfismo.dominio.Computador;
import pitercoding.devdojo.javacore.polimorfismo.dominio.Televisao;
import pitercoding.devdojo.javacore.polimorfismo.dominio.Tomate;
import pitercoding.devdojo.javacore.polimorfismo.service.CalculadoraImposto;

import java.util.Comparator;

public class ProdutoMain01 {
    public static void main(String[] args) {
        Computador computador = new Computador("iMac", 11000);
        Tomate tomate = new Tomate("Siciliano", 10);
        Televisao televisao = new Televisao("Samsung 50\" ", 5000);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-------------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-------------------------------------");
        CalculadoraImposto.calcularImposto(televisao);


    }
}
