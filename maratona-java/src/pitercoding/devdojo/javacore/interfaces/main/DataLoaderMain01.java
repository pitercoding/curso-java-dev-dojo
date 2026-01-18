package pitercoding.devdojo.javacore.interfaces.main;

import pitercoding.devdojo.javacore.interfaces.dominio.DataLoader;
import pitercoding.devdojo.javacore.interfaces.dominio.DatabaseLoader;
import pitercoding.devdojo.javacore.interfaces.dominio.FileLoader;

public class DataLoaderMain01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retriveMaxDataSize();
        DatabaseLoader.retriveMaxDataSize();
    }
}
