package pitercoding.devdojo.javacore.interfacess.main;

import pitercoding.devdojo.javacore.interfacess.dominio.DataLoader;
import pitercoding.devdojo.javacore.interfacess.dominio.DatabaseLoader;
import pitercoding.devdojo.javacore.interfacess.dominio.FileLoader;

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
