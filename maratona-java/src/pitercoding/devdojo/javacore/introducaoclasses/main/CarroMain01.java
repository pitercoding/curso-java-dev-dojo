package pitercoding.devdojo.javacore.introducaoclasses.main;

import pitercoding.devdojo.javacore.introducaoclasses.entity.Carro;

public class CarroMain01 {
    public static void main(String[] args) {
        Carro ferrari = new Carro();
        Carro fusca = new Carro();

        ferrari.nome = "Ferrari";
        ferrari.modelo = "F43MN";
        ferrari.ano = 2026;

        fusca.nome = "Fusca";
        fusca.modelo = "FS89XX";
        fusca.ano = 1979;

        System.out.println("====== CARRO 1 ======");
        System.out.println("Nome: " + ferrari.nome
                + ", "
                + "Modelo: " + ferrari.modelo
                + ", "
                + "Ano: " + ferrari.ano
        );

        System.out.println("====== CARRO 2 ======");
        System.out.println("Nome: " + fusca.nome
                + ", "
                + "Modelo: " + fusca.modelo
                + ", "
                + "Ano: " + fusca.ano
        );
    }
}
