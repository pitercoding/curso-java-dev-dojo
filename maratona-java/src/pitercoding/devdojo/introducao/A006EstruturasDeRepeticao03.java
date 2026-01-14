package pitercoding.devdojo.introducao;

public class A006EstruturasDeRepeticao03 {
    //Imprima os 25 primeiros números dentro de um valor máximo. Exemplo: 50
    public static void main(String[] args) {
        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {

            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
