package javacore.introducao.dominio.Minterfaces.dominio.teste1;

public class FileLoader implements DataLoader, DataRemove {
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Deletando dados de um arquivo");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no arquivo");
    }
}
