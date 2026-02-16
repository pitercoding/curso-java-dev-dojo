package pitercoding.devdojo.javacore.generics.main;

import pitercoding.devdojo.javacore.generics.dominio.Barco;

import java.util.List;

public class MetodoGenericoMain01 {
    public static void main(String[] args) {
        List<Barco> barcoList = criarArrayComUmObjeto(new Barco("Canoa Marota"));
        System.out.println(barcoList);
    }

    private static <T> List<T> criarArrayComUmObjeto(T objeto) {
        List<T> lista = List.of(objeto);
        return lista;
    }
}
