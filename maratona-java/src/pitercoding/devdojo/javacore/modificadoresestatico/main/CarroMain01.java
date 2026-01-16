package pitercoding.devdojo.javacore.modificadoresestatico.main;

import pitercoding.devdojo.javacore.modificadoresestatico.dominio.Carro;

public class CarroMain01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("Mercedes", 275);
        Carro carro3 = new Carro("Audi", 290);

        Carro.setVelocidadeLimite(180);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
