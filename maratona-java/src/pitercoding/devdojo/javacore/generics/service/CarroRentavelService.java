package pitercoding.devdojo.javacore.generics.service;

import pitercoding.devdojo.javacore.generics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
    public Carro buscarCarroDisponivel() {
        System.out.println("Buscando carro disponivel");
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro: " + carro);
        System.out.println("Carros disponiveis: " + carrosDisponiveis);
        return carro;
    }

    public void devolverCarro(Carro carro) {
        System.out.println("Devolvendo carro: " + carro);
        carrosDisponiveis.add(carro);
        System.out.println("Carros disponiveis: " + carrosDisponiveis);
    }
}