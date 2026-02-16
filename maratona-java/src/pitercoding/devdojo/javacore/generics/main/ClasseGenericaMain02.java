package pitercoding.devdojo.javacore.generics.main;

import pitercoding.devdojo.javacore.generics.dominio.Barco;
import pitercoding.devdojo.javacore.generics.service.BarcoRentavelService;

public class ClasseGenericaMain02 {
    public static void main(String[] args) {
       BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        barcoRentavelService.devolverBarco(barco);
    }
}
