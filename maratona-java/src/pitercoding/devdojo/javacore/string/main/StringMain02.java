package pitercoding.devdojo.javacore.string.main;

public class StringMain02 {
    public static void main(String[] args) {
        String nome = "        Racha Cuca      ";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("a", "e"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());

        System.out.println();
        String numeros = "012345";
        System.out.println(numeros.length());
        System.out.println(numeros.substring(0, 2));
        System.out.println(numeros.substring(3));
        System.out.println(nome.trim());



    }
}
