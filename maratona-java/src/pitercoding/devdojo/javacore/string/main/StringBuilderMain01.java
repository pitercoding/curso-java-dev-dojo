package pitercoding.devdojo.javacore.string.main;

public class StringBuilderMain01 {
    public static void main(String[] args) {
        String nome = "Piter Gomes";
        nome.concat(" DEV");
        nome = nome.substring(0, 3);
        System.out.println(nome);

        System.out.println();

        StringBuilder sb = new StringBuilder("Piter Gomes");
        sb.append(" DEV").append(" 2026");
        sb.reverse();
        sb.delete(0, 3);
        System.out.println(sb);
    }
}
