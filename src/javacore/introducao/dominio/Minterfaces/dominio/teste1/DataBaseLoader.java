package javacore.introducao.dominio.Minterfaces.dominio.teste1;

public class DataBaseLoader implements DataLoader {
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }
}
