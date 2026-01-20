package pitercoding.devdojo.javacore.excecoes.exception.dominio;

public class LoginInvalidoException extends Exception {

    public LoginInvalidoException() {
        super("Login inválido!");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
