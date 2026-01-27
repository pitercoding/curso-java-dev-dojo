package pitercoding.devdojo.javacore.regex.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherMain03 {
    public static void main(String[] args) {
        // \d = todos os digitos
        // \D = Tudo que não é digito
        // \s = Espaços em branco \t \n \f \r
        // \S = Tudo menos espaços em branco
        // \w = todas as letras de a-z ou A-Z, dígitos e _
        // \W = tudo que não for incluso no \w
        // [] = Caracteres inclusos nesse range

        // String regex = "[a-zA-C]";
        //String texto = "abaaba";
        String regex = "0[xX][0-9a-fA-F]";
        String texto2 = "12 0x 0X 0xFFABC 0x109 0x1";
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
