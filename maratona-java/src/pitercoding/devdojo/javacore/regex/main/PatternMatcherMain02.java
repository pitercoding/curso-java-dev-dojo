package pitercoding.devdojo.javacore.regex.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherMain02 {
    public static void main(String[] args) {
        // \d = todos os digitos
        // \D = Tudo que não é digito
        // \s = Espaços em branco \t \n \f \r
        // \S = Tudo menos espaços em branco
        // \w = todas as letras de a-z ou A-Z, dígitos e _
        // \W = tudo que não for incluso no \w
        String regex = "\\S";
        //String texto = "abaaba";
        String texto2 = "@#hhj2 12gvh21";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("Texto:  " + texto2);
        System.out.println("Índice: 0123456789" );
        System.out.println("Regex: " + regex);
        System.out.println("Posições encontadas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
