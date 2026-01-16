package pitercoding.devdojo.javacore.associacao.main;

import pitercoding.devdojo.javacore.associacao.dominio.Jogador;
import pitercoding.devdojo.javacore.associacao.dominio.Time;

public class JogadorMain02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");
        jogador1.setTime(time);
        jogador1.imprime();
    }
}
