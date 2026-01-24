package pitercoding.devdojo.exercicios.b2arrayslacoscondicionais;

/**
 * Task 5 — Busca simples
 * “Verificar se um CPF está na lista.”
 */
public class BuscaSimplesCPF {
    public static void main(String[] args) {
        String[] cpfs = {"123456", "10101010", "1111111", "999999"};

        String cpfDigitado = "123456";
        boolean cpfExisteNaLista = false;

        for (String cpf: cpfs) {
            if (cpf.equals(cpfDigitado)) {
                cpfExisteNaLista = true;
                break;
            }
        }

        if (cpfExisteNaLista) {
            System.out.println("CPF válido!");
        } else {
            System.out.println("CPF inexistente!");
        }
    }
}
