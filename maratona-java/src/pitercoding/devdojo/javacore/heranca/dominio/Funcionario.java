package pitercoding.devdojo.javacore.heranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Dentro do Bloco STATIC de Funcionario");
    }

    {
        System.out.println("Dentro do Bloco de Inicialização de Funcionario 1");
    }

    {
        System.out.println("Dentro do Bloco de Inicialização de Funcionario 2");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do Construtor de Funcionario");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void imprimie() {
        super.imprimie();
        System.out.println("Salário: " + this.salario);
    }

    public void relatorioDePagamento() {
        System.out.println("Eu, " + this.nome + ", recebi o salário de " + this.salario);
    }
}
