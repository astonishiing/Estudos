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
        System.out.println("================");
        System.out.println(persistence.findAll());
        System.out.println("================");
        System.out.println(persistence.removeContent(";marcos@"));
        System.out.println("================");
        System.out.println(persistence.removeContent("Luiz"));
        System.out.println("================");
        System.out.println(persistence.findBy(";28/09"));
        System.out.println("================");
        System.out.println(persistence.findBy("Marcos"));
        System.out.println("================");
        System.out.println(persistence.replaceCont(";03/05", "Eric;eric@eric.com;20/06/1985;"));
        System.out.println("================");
        System.out.println(persistence.replaceCont("Julia", "Maria;maria@maria.com;09/09/1999"));
        System.out.println("================");
        System.out.println(persistence.findAll());
    }
}
