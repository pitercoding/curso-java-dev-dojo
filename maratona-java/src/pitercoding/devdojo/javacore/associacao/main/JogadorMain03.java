package pitercoding.devdojo.javacore.associacao.main;

import pitercoding.devdojo.javacore.associacao.dominio.Jogador;
import pitercoding.devdojo.javacore.associacao.dominio.Time;

public class JogadorMain03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pelé");
        Time time1 = new Time("Palmeiras");
        Time time2 = new Time("Santos");
        Jogador[] jogadoresPalmeiras = {jogador1};
        Jogador[] jogadoresSantos = {jogador2};

        time1.setJogadores(jogadoresPalmeiras);
        time2.setJogadores(jogadoresSantos);

        System.out.println("--- Jogador: ---");
        jogador1.imprime();
        jogador2.imprime();

        System.out.println("\n--- Times ---");
        time1.imprime();
        time2.imprime();
    }
}
