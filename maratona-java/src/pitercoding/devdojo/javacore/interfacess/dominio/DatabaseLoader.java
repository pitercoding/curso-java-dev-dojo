package pitercoding.devdojo.javacore.interfacess.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {
    // private -> default - protected -> public
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no BD.");
    }

    public static void retriveMaxDataSize(){
        System.out.println("Dentro do retriveMaxDataSize() na classe DatabaseLoader.");
    }
}
