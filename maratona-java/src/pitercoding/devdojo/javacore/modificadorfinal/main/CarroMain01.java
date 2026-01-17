package pitercoding.devdojo.javacore.modificadorfinal.main;

import pitercoding.devdojo.javacore.modificadorfinal.dominio.Carro;
import pitercoding.devdojo.javacore.modificadorfinal.dominio.Ferrari;

public class CarroMain01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        carro.COMPRADOR.setName("José");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();
    }
}
