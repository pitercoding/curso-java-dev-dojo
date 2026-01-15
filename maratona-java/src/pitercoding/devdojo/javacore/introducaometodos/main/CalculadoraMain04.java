package pitercoding.devdojo.javacore.introducaometodos.main;

import pitercoding.devdojo.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraMain04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int a = 1;
        int b = 2;
        calculadora.alteraDoisNumeros(a, b);

        System.out.println("Dentro de CalculadoraMain04: ");
        System.out.println(a);
        System.out.println(b);
    }
}
