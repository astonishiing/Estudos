package javacore.introducao.dominio.Minterfaces.dominio.teste1;

public class DataBaseLoader implements DataLoader, DataRemove {
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no banco de dados");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize da DataBaseLoader");
    }
}
