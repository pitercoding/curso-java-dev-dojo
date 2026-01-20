package pitercoding.devdojo.javacore.excecoes.runtime.main;

public class RuntimeExceptionMain02 {
    public static void main(String[] args) {
        System.out.println(divisao(1, 1));

        System.out.println("Código finalizado!");
    }

    private static int divisao(int a, int b) {
        if (b == 0)  {
            throw new IllegalArgumentException("Não pode dividir por zero!");
        }
        return a/b;
    }
}
