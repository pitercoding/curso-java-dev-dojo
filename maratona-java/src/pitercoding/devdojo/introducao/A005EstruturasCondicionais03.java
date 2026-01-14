package pitercoding.devdojo.introducao;

public class A005EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Condição: Doar se salário for maior que 5000
        double salario = 3000;
        String resultado = salario >= 5000 ? "Eu vou doar 500R$ pro DevDojo" : "Não vou doar nada para o DevDojo";
        System.out.println(resultado);
    }
}
