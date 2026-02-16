package pitercoding.devdojo.javacore.generics.main;

import pitercoding.devdojo.javacore.generics.dominio.Barco;
import pitercoding.devdojo.javacore.generics.dominio.Carro;
import pitercoding.devdojo.javacore.generics.service.BarcoRentavelService;
import pitercoding.devdojo.javacore.generics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaMain03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

        RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalServiceCarro.buscarObjetoDisponivel();
        System.out.println("Alugando carro por um mês...");
        rentalServiceCarro.devolverObjetoAlugado(carro);
        System.out.println("Carro devolvido com sucesso!");


        System.out.println("-------------------");

        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalServiceBarco.buscarObjetoDisponivel();
        System.out.println("Alugando barco por um mês...");
        rentalServiceBarco.devolverObjetoAlugado(barco);
        System.out.println("Barco devolvido com sucesso!");
    }
}
