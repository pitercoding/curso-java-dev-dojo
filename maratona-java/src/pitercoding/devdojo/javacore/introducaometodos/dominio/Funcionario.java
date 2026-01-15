package pitercoding.devdojo.javacore.introducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;


    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.idade);

        if (salarios == null) {
            return;
        }
        for (double sal : salarios) {
            System.out.print(sal + " ");
        }
        mediaDosSalarios();
    }

    public void mediaDosSalarios() {
        if (salarios == null) {
            return;
        }

        double media = 0;

        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;

        System.out.println("\nMédia dos Salários: " + media);
    }
}
