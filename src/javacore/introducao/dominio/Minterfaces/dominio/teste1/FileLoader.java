package javacore.introducao.dominio.Minterfaces.dominio.teste1;

public class FileLoader implements DataLoader {
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }
}
