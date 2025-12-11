package javacore.introducao.dominio.Wnio.persistence;

import java.io.IOException;

public interface FilePersistence {

    String write(final String data);
    boolean removeContent(final String sentence);
    String replaceCont(final String oldContent, final String newContent);
    String findAll() throws IOException;
    String findBy(final String sentence);


}
