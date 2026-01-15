package pitercoding.devdojo.javacore.introducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int n1, int n2) {
        System.out.println(n1 * n2);
    }

    public double divideDoisNumeros(double n1, double n2) {
        if (n2 == 0) {
            return 0;
        }
        return n1 / n2;
    }

    public double divideDoisNumeros02(double n1, double n2) {
        if (n2 == 0) {
            return 0;
        } else {
            return n1 / n2;
        }
    }

    public void imprimeDivisaoDeDoisNumeros(double n1, double n2) {
        if (n2 == 0) {
            System.out.println("Não existe divisão por zero!");
            return;
        }

        System.out.println(n1/n2);
    }

    public void alteraDoisNumeros(int numero1, int numero2) {
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do aleraDoisNumeros: ");
        System.out.println(numero1);
        System.out.println(numero2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
