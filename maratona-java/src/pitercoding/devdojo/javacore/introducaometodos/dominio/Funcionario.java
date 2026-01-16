package pitercoding.devdojo.javacore.introducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

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

        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;

        System.out.println("\nMédia dos Salários: " + media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

}
