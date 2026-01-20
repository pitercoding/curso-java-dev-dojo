package pitercoding.devdojo.javacore.excecoes.runtime.main;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class ExceptionMain04 {
    public static void main(String[] args) {
        try {
            throw new ArithmeticException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro do IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Dentro do ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }

        //Multi catch
        try {
            talvezLanceExcecao();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void talvezLanceExcecao() throws SQLException, FileNotFoundException {

    }
}
