package pitercoding.devdojo.javacore.introducaometodos.main;

import pitercoding.devdojo.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraMain03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(10, 3);
        System.out.println(resultado);
        System.out.println(calculadora.divideDoisNumeros02(10, 0));
        System.out.println("-----------");
        calculadora.imprimeDivisaoDeDoisNumeros(20, 0);
    }
}
