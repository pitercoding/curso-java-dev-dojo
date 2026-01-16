package pitercoding.devdojo.javacore.sobrecargametodos.dominio;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class Anime {
    private String nome;
    private String tipo;
    private int quantidadeEpisodios;
    private String genero;

    public void init(String nome, String tipo, int quantidadeEpisodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.quantidadeEpisodios = quantidadeEpisodios;
    }

    public void init(String nome, String tipo, int quantidadeEpisodios, String genero) {
        this.init(nome, tipo, quantidadeEpisodios);
        this.genero = genero;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.quantidadeEpisodios);
        System.out.println(this.genero);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidadeEpisodios(){
        return this.quantidadeEpisodios;
    }

    public void setQuantidadeEpisodios(int quantidadeEpisodios) {
        this.quantidadeEpisodios = quantidadeEpisodios;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
