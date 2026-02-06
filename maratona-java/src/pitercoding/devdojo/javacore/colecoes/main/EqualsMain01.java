package pitercoding.devdojo.javacore.colecoes.main;

import pitercoding.devdojo.javacore.colecoes.dominio.Smartphone;

public class EqualsMain01 {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("123456", "Samsung");
        Smartphone smartphone2 = new Smartphone("123456", "Samsung");
        System.out.println(smartphone1.equals(smartphone2));
    }
}
