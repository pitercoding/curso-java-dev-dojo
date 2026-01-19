package pitercoding.devdojo.javacore.polimorfismo.dominio;

public class Tomate extends Produto {

    public static final double IMPOSTO_POR_CENTO = 0.06;
    private String datadeValidade;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Tomate...");
        return this.valor * IMPOSTO_POR_CENTO;
    }

    public String getDatadeValidade() {
        return datadeValidade;
    }

    public void setDatadeValidade(String datadeValidade) {
        this.datadeValidade = datadeValidade;
    }
}
