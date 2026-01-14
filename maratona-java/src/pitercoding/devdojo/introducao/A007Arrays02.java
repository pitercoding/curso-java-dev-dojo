package pitercoding.devdojo.introducao;

public class A007Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double = 0
        // char = espaço em branco
        // boolean = false
        // String null
        String [] nomes = new String[4]; // reference
        nomes[0] = "Racha Cuca";
        nomes[1] = "Tripa Seca";
        nomes[2] = "Quase Nada";
        nomes[3] = "Poucas Trancas";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
