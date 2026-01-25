package pitercoding.devdojo.exercicios.i8excecoes;

public class MultiplasExcecoes {
    public static void main(String[] args) {

        try {
            gerarErro(2);
        } catch (ArithmeticException e) {
            System.out.println("Erro de cálculo: " + e.getMessage());
        } catch (NullPointerException  e) {
            System.out.println("Erro de referência nula: " + e.getMessage());
        } finally {
            System.out.println("Fim do processamento.");
        }
    }

    public static void gerarErro(int tipo) {
        if (tipo == 1) {
            int resultado = 1 / 0;// dispara ArithmeticException
        } else if (tipo == 2) {
            String s = null;
            s.length(); // // dispara NullPointerException
        } else {
            System.out.println("Nenhum erro gerado.");
        }
    }
}
