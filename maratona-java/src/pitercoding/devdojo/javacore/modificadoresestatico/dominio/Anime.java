package pitercoding.devdojo.javacore.modificadoresestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    // 0. Bloco de inicialização é executado quando a JVM carregar a classe
    // 1. Alocado espaço em memório pro objeto
    // 2. Cada atributo de classe é criado e inicializado com valores default ou até que foram declarados
    // 3. Bloco de inicialização é executado
    // 4. Construtor é executado

    static {
        System.out.println("Bloco de inicialização static 1!");
        episodios = new int[100];

        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    static {
        System.out.println("Bloco de inicialização static 2!");
    }

    static {
        System.out.println("Bloco de inicialização static 3!");
    }

    {
        System.out.println("Bloco de inicialização NÃO STATIC!");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio: Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
