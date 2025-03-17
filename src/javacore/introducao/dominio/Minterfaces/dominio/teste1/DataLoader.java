package javacore.introducao.dominio.Minterfaces.dominio.teste1;

public interface DataLoader {
    public abstract void load();
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }
}
