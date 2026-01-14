package pitercoding.devdojo.introducao;

public class A006EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for

        int contador = 0;

        while (contador < 10) {
            contador += 1; // IMPORTANTE!!!
            System.out.println(contador);
        }

        int contador2 = 0;
        do {
            contador2 += 1;
            System.out.println("do-while contando! " + contador2);
        } while (contador2 < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("For "+ i);
        }
    }
}
