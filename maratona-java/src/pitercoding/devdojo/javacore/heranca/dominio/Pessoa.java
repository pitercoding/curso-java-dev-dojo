package pitercoding.devdojo.javacore.heranca.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;
    static {
        System.out.println("Dentro do Bloco STATIC de PESSOA");
    }

    {
        System.out.println("Dentro do Bloco de Inicialização de PESSOA 1");
    }

    {
        System.out.println("Dentro do Bloco de Inicialização de PESSOA 2");
    }

    public Pessoa(String nome) {
        System.out.println("Dentro do Construtor de PESSOA");
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void imprimie() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Rua: " + this.endereco.getRua());
        System.out.println("CEP: " + this.endereco.getCep());
    }
}
