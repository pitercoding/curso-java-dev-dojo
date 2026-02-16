package pitercoding.devdojo.javacore.generics.service;

import pitercoding.devdojo.javacore.generics.dominio.Carro;

import java.util.List;

public class RentalService<T> {
    private List<T> objetosDispiniveis;

    public RentalService(List<T> objetosDispiniveis) {
        this.objetosDispiniveis = objetosDispiniveis;
    }

    public T buscarObjetoDisponivel() {
        System.out.println("Buscando objeto disponivel");
        T t = objetosDispiniveis.remove(0);
        System.out.println("Alugando objeto: " + t);
        System.out.println("Objetos disponiveis: " + objetosDispiniveis);
        return t;
    }

    public void devolverObjetoAlugado(T t) {
        System.out.println("Devolvendo objeto: " + t);
        objetosDispiniveis.add(t);
        System.out.println("Objetos disponíveis: " + objetosDispiniveis);
    }
}
