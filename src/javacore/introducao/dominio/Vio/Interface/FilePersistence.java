package javacore.introducao.dominio.Vio.Interface;

public interface FilePersistence {

    String write(final String data);
    boolean removeContent(final String sentence);
    String replaceCont(final String oldContent, final String newContent);
    String findAll();
    String findBy(final String sentence);


}
