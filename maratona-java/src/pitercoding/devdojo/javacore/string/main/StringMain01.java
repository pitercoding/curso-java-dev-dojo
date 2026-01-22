package pitercoding.devdojo.javacore.string.main;

public class StringMain01 {
    public static void main(String[] args) {
        String nome = "Piter"; // String constant pool
        String nome2 = "Piter";

        nome = nome.concat(" Gomes"); // mesma coisa que -> nome += " Gomes"
        System.out.println(nome);

        System.out.println(nome.equals(nome2)); // compara valor

        // Fazem referência para o mesmo objeto em memória que está no string pool
        System.out.println(nome == nome2); // compara referência

        String nome3 = new String("Piter");
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern()); // esse método pega o valor dentor do pool de strings
    }
}
