package pitercoding.devdojo.javacore.generics.main;

import pitercoding.devdojo.javacore.generics.dominio.Carro;
import pitercoding.devdojo.javacore.generics.service.CarroRentavelService;

public class ClasseGenericaMain01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        carroRentavelService.devolverCarro(carro);
    }
}
