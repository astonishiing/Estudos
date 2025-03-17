package javacore.introducao.dominio.Minterfaces.teste;

import javacore.introducao.dominio.Minterfaces.dominio.teste1.DataBaseLoader;
import javacore.introducao.dominio.Minterfaces.dominio.teste1.FileLoader;

public class DataLoaderTeste01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.remove();
        fileLoader.remove();

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();
    }
}
