package javacore.introducao.dominio.Wnio.persistence;

import java.io.IOException;

public class NIO2RunningTest {
    public static void main(String[] args) throws IOException {
        FilePersistence persistence = new NIO2FilePersistence("user.csv");
    }
}
