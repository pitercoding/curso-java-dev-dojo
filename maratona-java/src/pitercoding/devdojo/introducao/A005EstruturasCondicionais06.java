package pitercoding.devdojo.introducao;

public class A005EstruturasCondicionais06 {
    // Switch: Dados valores de 1 a 7, imprima se é dia útil ou final de semana
    // Dia 1 = Domingo
    public static void main(String[] args) {
        byte dia = 1;

        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("[ERRO] Dia inválido!");
                break;
        }
    }
}
