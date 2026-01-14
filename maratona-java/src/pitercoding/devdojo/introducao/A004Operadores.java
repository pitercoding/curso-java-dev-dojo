package pitercoding.devdojo.introducao;

public class A004Operadores {
    public static void main(String[] args) {
        // + - * /
        int numero01 = 10;
        int numero02 = 20;
        double resultado1 =  numero01 * numero02;
        double resultado2 =  numero01 / (double) numero02;

        System.out.println(numero02 - numero01);
        System.out.println(numero02 + numero01);
        System.out.println("Valor" + numero02 + numero01); //2010
        System.out.println(numero02 + numero01 + "Valor" + numero02 + numero01); //30Valor2010
        System.out.println(resultado1);
        System.out.println(resultado2);

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >= == != retornam true/false
        boolean isDezMaiorQue20 = 10 > 20;
        System.out.println("isDezMaiorQue20 = " + isDezMaiorQue20);
        boolean isDezMenorQue20 = 10 < 20;
        System.out.println("isDezMenorQue20 = " + isDezMenorQue20);
        boolean isDezIgualA20 = 10 == 20;
        System.out.println("isDezIgualA20 = " + isDezIgualA20);
        boolean isDezIgualADez = 10 == 10;
        System.out.println("isDezIgualADez = " + isDezIgualADez);
        boolean isDezDiferenteDeDez = 10 != 10;
        System.out.println("isDezDiferenteDeDez = " + isDezDiferenteDeDez);

        // && || ! retornam true/false
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 500F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 2*1800=3600
        bonus /= 2; // 3600/2=1800
        bonus%= 2; // 1800/2 = 0
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador += 1; // contador = contador + 1;
        contador ++; // 1 + 1 = 2
        contador --; // 2 - 1 = 1
        System.out.println(contador);

        int contador2 = 0;
        System.out.println(++contador2);


    }
}
