package pitercoding.devdojo.introducao;

public class A005EstruturasCondicionais04 {
    // R$     R$     %
    // 0      34,712 9.70
    // 34,713 68,507 37.35
    // 68,508        49.50
    public static void main(String[] args) {
        double salarioAnual = 25000;
        double impostosCategoriaA = 9.70 / 100;
        double impostosCategoriaB = 37.35 / 100;
        double impostosCategoriaC = 49.50 / 100;
        double impostosPagos;

        System.out.println("Salário anual: " + salarioAnual);

        if (salarioAnual <= 34712) {
            impostosPagos = salarioAnual * impostosCategoriaA;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            impostosPagos = salarioAnual * impostosCategoriaB;
        } else {
            impostosPagos = salarioAnual * impostosCategoriaC;
        }

        System.out.println("Impostos pagos: R$" + impostosPagos);
    }
}
