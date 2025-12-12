package javacore.introducao.dominio.Wnio.persistence;

import java.io.IOException;

public class NIO2RunningTest {
    public static void main(String[] args) throws IOException {
        FilePersistence persistence = new NIO2FilePersistence("user.txt");
        System.out.println("================");
        System.out.println(persistence.write("Luana;luana@luana.com;28/09/1989;"));
        System.out.println("================");
        System.out.println(persistence.write("Marcos;marcos@marcos.com;01/01/1999;"));
        System.out.println("================");
        System.out.println(persistence.write("Henrique;henrique@henrique.com;03/05/2001;"));
    }
}
