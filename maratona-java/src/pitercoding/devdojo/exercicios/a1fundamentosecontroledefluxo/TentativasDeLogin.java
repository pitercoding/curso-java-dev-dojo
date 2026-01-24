package pitercoding.devdojo.exercicios.a1fundamentosecontroledefluxo;

import java.util.Scanner;

/**
 * Task 3 — Simulação de tentativas de login
 * “Após 3 tentativas erradas, bloquear.”
 */
public class TentativasDeLogin {
    public static void main(String[] args) {
        String loginCorreto = "admin";
        String senhaCorreta = "123";

        String loginDigitado = "admin";
        String senhaDigitada = "12a";

        boolean logado = false;

        for (int tentativa = 1; tentativa <= 3; tentativa++) {

            if (loginDigitado.equals(loginCorreto) && senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Login realizado com sucesso!");
                logado = true;
                break;
            } else {
                System.out.println("Login ou senha inválidos. Tentativa " + tentativa);
            }
        }
        if (!logado) {
            System.out.println("Usuário bloqueado");
        }
    }
}
