package pitercoding.devdojo.introducao;

public class A006EstruturasDeRepeticao04 {
    // Dado o valor de um carro, descubra em quantas parcelas pode ser parcelado
    // Condição valorParcela >= 1000
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal ; parcela++) {
            double valorParcela = valorTotal / parcela;

            if (valorParcela < 1000) {
                break;
            }
            System.out.println(parcela + "x de R$" + valorParcela);
        }
    }
}
