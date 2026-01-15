package pitercoding.devdojo.javacore.introducaometodos.main;

import pitercoding.devdojo.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraMain05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,2,3,4,5,5);
    }
}
